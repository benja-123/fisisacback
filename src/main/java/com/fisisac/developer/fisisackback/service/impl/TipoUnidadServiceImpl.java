package com.fisisac.developer.fisisackback.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.fisisac.developer.fisisackback.domain.TipoUnidad;
import com.fisisac.developer.fisisackback.repository.TipoUnidadRepository;
import com.fisisac.developer.fisisackback.service.TipoUnidadService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoUnidadServiceImpl implements TipoUnidadService{

    @Autowired
    TipoUnidadRepository tipoRepositorio;

    public List<TipoUnidad> getAllTipoUnidad(){
        List<TipoUnidad> unidades = new ArrayList<>();
        tipoRepositorio.findAll().forEach(tipoUnidad -> unidades.add(tipoUnidad));
        return unidades;
    }
}