package com.example.demoHeitor.controller;


import com.example.demoHeitor.model.Aluno;
import com.example.demoHeitor.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/apiAluno")
public class AlunoController {

    @Autowired
    AlunoRepository alRepo;

    @GetMapping(value="/todos")
    public List<Aluno> buscar_todos()
    {
        return alRepo.findAll();
    }

}
