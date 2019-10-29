package com.fisisac.developer.fisisackback.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fisisac.developer.fisisackback.domain.Curso;
import com.fisisac.developer.fisisackback.repository.CursoRepository;
import com.fisisac.developer.fisisackback.service.CursoService;

@Service
public class CursoServiceImpl implements CursoService {

  @Autowired
  CursoRepository cursoRepository;

  public Set<Curso> getAllCursos() {
    Set<Curso> setCursos = new HashSet<>();
    cursoRepository.findAll().forEach(curso -> setCursos.add(curso));
    return setCursos;
  }
}