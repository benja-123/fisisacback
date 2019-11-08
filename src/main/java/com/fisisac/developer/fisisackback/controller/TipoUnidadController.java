package com.fisisac.developer.fisisackback.controller;

import java.util.List;

import com.fisisac.developer.fisisackback.domain.TipoUnidad;
import com.fisisac.developer.fisisackback.service.TipoUnidadService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@CrossOrigin
@RequestMapping("/tipounidad")
public class TipoUnidadController{

    @Autowired
    TipoUnidadService tipoUnidadService;

    @GetMapping
    public ResponseEntity<List<TipoUnidad>> getAllTipoUnidad() {
        List<TipoUnidad> listaTipoUnidad = tipoUnidadService.getAllTipoUnidad();
        return new ResponseEntity<>(listaTipoUnidad,HttpStatus.OK);
    }
    
}