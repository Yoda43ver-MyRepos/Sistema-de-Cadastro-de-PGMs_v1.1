package br.com.ibns.pgm.controller;

import br.com.ibns.pgm.pgm.PgmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pgms")
public class PgmController {


    @Autowired
    private  PgmRepository repository;


    @PostMapping
    public void cadastrarPgm(@RequestBody String json){
        System.out.println(json);
    }




}
