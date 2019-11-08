package com.fisisac.developer.fisisackback.controller;

import java.util.List;

import com.fisisac.developer.fisisackback.domain.TipoGrado;
import com.fisisac.developer.fisisackback.service.TipoGradoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/tipogrado")
public class TipoGradoController{

    @Autowired
    TipoGradoService tipoGradoService;

    @GetMapping
    public ResponseEntity<List<TipoGrado>> getAllTipoGrado(){
        List<TipoGrado> listaTipoGrado = tipoGradoService.getAllTipoGrado();
        return new ResponseEntity<>(listaTipoGrado, HttpStatus.OK);
    }
}