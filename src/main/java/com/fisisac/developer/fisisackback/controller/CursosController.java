package com.fisisac.developer.fisisackback.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fisisac.developer.fisisackback.domain.Curso;
import com.fisisac.developer.fisisackback.service.CursoService;

@RestController
@CrossOrigin
@RequestMapping("/cursos")
public class CursosController {

  @Autowired
  CursoService cursoService;

  @GetMapping
  public ResponseEntity<Set<Curso>> getAllProgramas() {
    Set<Curso> setProgramas = cursoService.getAllCursos();
    return new ResponseEntity<>(setProgramas, HttpStatus.OK);
  }

}