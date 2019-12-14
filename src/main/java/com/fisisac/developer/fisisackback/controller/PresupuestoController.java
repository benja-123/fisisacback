package com.fisisac.developer.fisisackback.controller;

import java.util.List;

import com.fisisac.developer.fisisackback.domain.Presupuesto;
import com.fisisac.developer.fisisackback.service.PresupuestoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@CrossOrigin
@RequestMapping("/presupuesto")
public class PresupuestoController{

    @Autowired
    PresupuestoService presupuestoService;

    @PostMapping("/save")
    public Presupuesto savePresupuesto(@RequestBody Presupuesto presupuesto) {

       Presupuesto presupuesto2 = presupuestoService.savePresupuesto(presupuesto);
        return presupuesto2;
    }

    @GetMapping
    public ResponseEntity<List<Presupuesto>> getAllPresupestos(){
        List<Presupuesto> presupuestos = presupuestoService.getAllPresupuestos();
        return new ResponseEntity<>(presupuestos,HttpStatus.OK);

    }
    
}