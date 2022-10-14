package com.example.demoFabio.controller;

import com.example.demoFabio.model.Aluno;
import com.example.demoFabio.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/apiAluno")
public class AlunoController {


    @Autowired
    AlunoRepository alRepo;

    @GetMapping(value="/todos")
    public List<Aluno> buscarTodos(){
        return alRepo.findAll();
    }

    @GetMapping(value="/alunos/{ra}")
    public Optional<Aluno> buscarPorId(@PathVariable(value = "ra") int ra){
        return alRepo.findById(ra);
    }

    @PostMapping("/inserirAluno")
    public void inserirAlunos (@RequestBody Aluno aluno){
        alRepo.save(aluno);
    }
}
