package com.fisisac.developer.fisisackback.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fisisac.developer.fisisackback.domain.Semestre;
import com.fisisac.developer.fisisackback.repository.SemestreRepository;
import com.fisisac.developer.fisisackback.service.SemestreService;

@Service
public class SemestreServiceImpl implements SemestreService {

  @Autowired
  SemestreRepository semestreRepository;

  public List<Semestre> getAllProgramas() {
    List<Semestre> setSemestres = new ArrayList<>();
    semestreRepository.findAll().forEach(semestre -> setSemestres.add(semestre));
    return setSemestres;
  }
}