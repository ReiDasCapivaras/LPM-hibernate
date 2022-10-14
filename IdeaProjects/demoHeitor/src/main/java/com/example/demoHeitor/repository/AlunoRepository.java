package com.example.demoHeitor.repository;

import com.example.demoHeitor.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

}
