package com.fisisac.developer.fisisackback.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fisisac.developer.fisisackback.domain.Semestre;
import com.fisisac.developer.fisisackback.service.SemestreService;

@RestController
@CrossOrigin
@RequestMapping("/semestres")
public class SemestreController {

  @Autowired
  SemestreService semestreService;

  @GetMapping
  public ResponseEntity<Set<Semestre>> getAllProgramas() {
    Set<Semestre> setSemestre = semestreService.getAllProgramas();
    return new ResponseEntity<>(setSemestre, HttpStatus.OK);
  }

}