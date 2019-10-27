package com.fisisac.developer.fisisackback.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fisisac.developer.fisisackback.domain.Programa;
import com.fisisac.developer.fisisackback.repository.ProgramaRepository;
import com.fisisac.developer.fisisackback.service.ProgramaService;

@Service
public class ProgramaServiceImpl implements ProgramaService {

  @Autowired
  ProgramaRepository programaRepository;

  public Set<Programa> getAllProgramas() {
    Set<Programa> setProgramas = new HashSet<>();
    programaRepository.findAll().forEach(programa -> setProgramas.add(programa));
    return setProgramas;
  }
}