package br.com.ibns.pgm.controller;

import br.com.ibns.pgm.membro.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("membros")
public class MembroController {


    @Autowired
    private MembroRepository repository;

    @PostMapping
    @Transactional
    public void cadastrarMembro(@RequestBody DadosMembro dados){
       repository.save(new Membro(dados));
    }


    @GetMapping
    public List<DadosListagemMembros> listarMembros(){
        return repository.findAll().stream().map(DadosListagemMembros::new).toList();
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
