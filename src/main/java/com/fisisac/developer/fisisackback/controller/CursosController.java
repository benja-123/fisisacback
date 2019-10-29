package com.fisisac.developer.fisisackback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fisisac.developer.fisisackback.domain.Curso;
import com.fisisac.developer.fisisackback.service.CursoService;

@RestController
@CrossOrigin
@RequestMapping("/programas/{id}/cursos")
public class CursosController {

  @Autowired
  CursoService cursoService;

  @GetMapping
  public ResponseEntity<List<Curso>> getAllProgramas(@PathVariable("id") Long id) {    
    List<Curso> setProgramas = cursoService.getAllCursosId(id);
    return new ResponseEntity<>(setProgramas, HttpStatus.OK);
  }

}