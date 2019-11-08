package com.fisisac.developer.fisisackback.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.fisisac.developer.fisisackback.domain.TipoGrado;
import com.fisisac.developer.fisisackback.repository.TipoGradoRepository;
import com.fisisac.developer.fisisackback.service.TipoGradoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoGradoServiceImpl implements TipoGradoService{

    @Autowired
    TipoGradoRepository tipoGradoRepository;

    public List<TipoGrado> getAllTipoGrado(){
        List<TipoGrado> listaTipoGrado = new ArrayList<>();
        tipoGradoRepository.findAll().forEach(tipoGrado -> listaTipoGrado.add(tipoGrado));
        return listaTipoGrado;
    }
}