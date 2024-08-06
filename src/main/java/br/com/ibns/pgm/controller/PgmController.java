package br.com.ibns.pgm.controller;

import br.com.ibns.pgm.pgm.DadosListagemPgms;
import br.com.ibns.pgm.pgm.DadosPgm;
import br.com.ibns.pgm.pgm.Pgm;
import br.com.ibns.pgm.pgm.PgmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
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


    /* Este metodo foi modificado.
    Mantendo este compentário para consultas futuras.
    @GetMapping
    public List<DadosListagemPgms> listarPgms(){
        return repository.findAll().stream().map(DadosListagemPgms::new).toList();
    }
    */


    @GetMapping
    public Page<DadosListagemPgms> listarPgms(Pageable pagination){
        return repository.findAll(pagination).map(DadosListagemPgms::new);
    }



}
