package com.fisisac.developer.fisisackback.controller;

import java.util.List;

import com.fisisac.developer.fisisackback.domain.PresupuestoDetalle;
import com.fisisac.developer.fisisackback.service.PresupuestoDetalleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/presupuestodetalle")
public class PresupuestoDetalleController{

    @Autowired
    PresupuestoDetalleService presupuestoServicio;

    @PostMapping
    public void saveAllPresupuestoDetalle(@RequestBody List<PresupuestoDetalle> presupuestos){
        presupuestoServicio.saveAllPresupuestoDet(presupuestos);
    }
}