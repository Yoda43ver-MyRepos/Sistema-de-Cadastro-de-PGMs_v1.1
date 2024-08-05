package br.com.ibns.pgm.controller;

import br.com.ibns.pgm.membro.MembroRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("membros")
public class MembroController {

    private MembroRepository repository;

}
