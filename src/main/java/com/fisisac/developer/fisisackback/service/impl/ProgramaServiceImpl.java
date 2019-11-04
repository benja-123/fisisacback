package com.fisisac.developer.fisisackback.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fisisac.developer.fisisackback.domain.Programa;
import com.fisisac.developer.fisisackback.repository.ProgramaRepository;
import com.fisisac.developer.fisisackback.service.ProgramaService;

@Service
public class ProgramaServiceImpl implements ProgramaService {

  @Autowired
  ProgramaRepository programaRepository;

  public List<Programa> getAllProgramas() {
    List<Programa> setProgramas = new ArrayList<>();
    programaRepository.findAll().forEach(programa -> setProgramas.add(programa));
    return setProgramas;
  }
}