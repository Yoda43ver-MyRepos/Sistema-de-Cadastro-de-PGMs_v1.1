package br.com.ibns.pgm.controller;

import br.com.ibns.pgm.membro.DadosMembro;
import br.com.ibns.pgm.membro.Membro;
import br.com.ibns.pgm.membro.MembroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("membros")
public class MembroController {


    @Autowired
    private MembroRepository repository;

    @PostMapping
    public void cadastrarMembro(@RequestBody DadosMembro dados){
       repository.save(new Membro(dados));

    }


}
