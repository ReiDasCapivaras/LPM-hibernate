package com.example.demoFabio.controller;

import com.example.demoFabio.model.Aluno;
import com.example.demoFabio.model.Professor;
import com.example.demoFabio.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/apiProfessor")
public class ProfessorController {

    @Autowired
    ProfessorRepository pfRepo;

    @GetMapping(value="/todos")
    public List<Professor> buscarTodos(){
        return pfRepo.findAll();
    }

    @GetMapping(value="/professores/{matricula}")
    public Optional<Professor> buscarPorId(@PathVariable(value = "matricula") int matricula){
        return pfRepo.findById(matricula);
    }

    @PostMapping("/inserirProfessor")
    public void inserirAlunos (@RequestBody Professor professor){
        pfRepo.save(professor);
    }
}
