package com.fisisac.developer.fisisackback.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fisisac.developer.fisisackback.domain.Curso;
import com.fisisac.developer.fisisackback.repository.CursoRepository;
import com.fisisac.developer.fisisackback.service.CursoService;

@Service
public class CursoServiceImpl implements CursoService {

  @Autowired
  CursoRepository cursoRepository;

  public List<Curso> getAllCursosId( Long id) {
    List<Curso> setCursos = new ArrayList<>();
    cursoRepository.findAllByProgramaId(id).addAll(setCursos);
    return setCursos;
  }
}