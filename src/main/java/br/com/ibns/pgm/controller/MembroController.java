package br.com.ibns.pgm.controller;

import br.com.ibns.pgm.membro.*;
import br.com.ibns.pgm.membro.Membro;
import br.com.ibns.pgm.membro.MembroRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("membros")
public class MembroController {

    @Autowired
    private MembroRepository repository;

    @PostMapping
    @Transactional
    public void cadastrarMembro(@RequestBody @Valid DadosMembro dados){
       repository.save(new Membro(dados));
    }
    @GetMapping
    public Page<DadosListagemMembros> listarMembros(Pageable paginacao  ){
        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemMembros::new);
    }
    @GetMapping("/inativos")
    public Page<DadosListagemMembros> listarMembrosInativos (Pageable paginacao){
        return repository.findAllByAtivoFalse(paginacao).map(DadosListagemMembros::new);
    }
    @PutMapping
    @Transactional
    public void atualizarMembro(@RequestBody @Valid DadosAtualizacaoMembros dados){
           var membro =  repository.getReferenceById(dados.id());
           membro.atualizarInformacoesMembro(dados);
    }
    @DeleteMapping("/{id}")
    @Transactional
    public void inativarMembro(@PathVariable Long id){
          var medico = repository.getReferenceById(id);
          medico.inativar();
    }
}
