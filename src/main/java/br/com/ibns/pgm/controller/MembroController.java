package br.com.ibns.pgm.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("membros")
public class MembroController {


    //@Autowired
    //private MembroRepository repository;

    @PostMapping
    public void exibirDadosMembro(@RequestBody String json){
        System.out.println(json);

    }


}
