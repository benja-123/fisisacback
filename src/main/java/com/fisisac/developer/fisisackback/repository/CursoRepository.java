package com.fisisac.developer.fisisackback.repository;

import java.util.List;

import com.fisisac.developer.fisisackback.domain.Curso;

import org.springframework.data.jpa.repository.JpaRepository;


public interface CursoRepository extends JpaRepository<Curso, Long> {
    
    List<Curso> findAllByProgramaId(Long id);
}