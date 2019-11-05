package com.fisisac.developer.fisisackback.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.fisisac.developer.fisisackback.domain.ClasificadorGasto;
import com.fisisac.developer.fisisackback.repository.ClasificadorGastoRepository;
import com.fisisac.developer.fisisackback.service.ClasificadorGastoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClasificadorGastoServiceImpl implements ClasificadorGastoService{
    
    @Autowired
    ClasificadorGastoRepository clasificadorRepository;

    public List<ClasificadorGasto> getAllClasificadorGastos(){
        List<ClasificadorGasto> clasificadores = new ArrayList<>();
        clasificadorRepository.findAll().forEach(clasificador -> clasificadores.add(clasificador));
        return clasificadores;
    }
}