package com.fisisac.developer.fisisackback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fisisac.developer.fisisackback.domain.Programa;
import com.fisisac.developer.fisisackback.service.ProgramaService;

@RestController
@CrossOrigin
@RequestMapping("/programas")
public class ProgramaController {

  @Autowired
  ProgramaService programaService;

  @GetMapping
  public ResponseEntity<List<Programa>> getAllProgramas() {
    List<Programa> setProgramas = programaService.getAllProgramas();
    return new ResponseEntity<>(setProgramas, HttpStatus.OK);
  }

}