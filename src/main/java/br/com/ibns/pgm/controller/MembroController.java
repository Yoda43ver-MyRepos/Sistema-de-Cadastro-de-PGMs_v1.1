package br.com.ibns.pgm.controller;

import br.com.ibns.pgm.membro.DadosListagemMembros;
import br.com.ibns.pgm.membro.DadosMembro;
import br.com.ibns.pgm.membro.Membro;
import br.com.ibns.pgm.membro.MembroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("membros")
public class MembroController {


    @Autowired
    private MembroRepository repository;

    @PostMapping
    public void cadastrarMembro(@RequestBody DadosMembro dados){
       repository.save(new Membro(dados));
    }


    @GetMapping
    public List<DadosListagemMembros> listarMembros(){
        return repository.findAll().stream().map(DadosListagemMembros::new).toList();
    }

}
