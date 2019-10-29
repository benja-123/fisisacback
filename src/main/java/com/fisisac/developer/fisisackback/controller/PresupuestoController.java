package com.fisisac.developer.fisisackback.controller;

import java.util.Set;

import com.fisisac.developer.fisisackback.domain.Presupuesto;
import com.fisisac.developer.fisisackback.service.PresupuestoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/presupuestos")
public class PresupuestoController{

    @Autowired
    PresupuestoService presupuestoService;

    @GetMapping
    public ResponseEntity<Set<Presupuesto>> getAllPresupuestos(){
        Set<Presupuesto> setPresupuestos = presupuestoService.getAllPresupuestos();
        return new ResponseEntity<>(setPresupuestos, HttpStatus.OK);
    }
}