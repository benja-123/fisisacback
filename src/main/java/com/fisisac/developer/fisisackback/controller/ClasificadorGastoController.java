package com.fisisac.developer.fisisackback.controller;

import com.fisisac.developer.fisisackback.service.ClasificadorGastoService;
import com.fisisac.developer.fisisackback.domain.ClasificadorGasto;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/clasificadorgasto")
public class ClasificadorGastoController{

    @Autowired
    ClasificadorGastoService clasificadorService;

    @GetMapping
    public ResponseEntity<List<ClasificadorGasto>> getAllClasificadores(){
        List<ClasificadorGasto> clasificadores = clasificadorService.getAllClasificadorGastos();
        return new ResponseEntity<>(clasificadores, HttpStatus.OK);
    }
}