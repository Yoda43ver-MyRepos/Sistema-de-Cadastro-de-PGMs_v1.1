package br.com.ibns.pgm.controller;

import br.com.ibns.pgm.pgm.DadosListagemPgms;
import br.com.ibns.pgm.pgm.DadosPgm;
import br.com.ibns.pgm.pgm.Pgm;
import br.com.ibns.pgm.pgm.PgmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pgms")
public class PgmController {


    @Autowired
    private  PgmRepository repository;


    @PostMapping
    public void cadastrarPgm(@RequestBody DadosPgm dados){
        repository.save(new Pgm(dados));
    }

    @GetMapping
    public List<DadosListagemPgms> listarPgms(){
        return repository.findAll().stream().map(DadosListagemPgms::new).toList();
    }



}
