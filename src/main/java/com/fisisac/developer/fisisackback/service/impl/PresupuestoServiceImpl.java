package com.fisisac.developer.fisisackback.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.fisisac.developer.fisisackback.domain.Presupuesto;
import com.fisisac.developer.fisisackback.repository.PresupuestoRepository;
import com.fisisac.developer.fisisackback.service.PresupuestoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PresupuestoServiceImpl implements PresupuestoService{
    
    @Autowired
    PresupuestoRepository presupuestoRepository;

    public Presupuesto savePresupuesto(Presupuesto presupuesto){
        return presupuestoRepository.save(presupuesto);
    }

    public List<Presupuesto> getAllPresupuestos(){
        List<Presupuesto> presupuestos = new ArrayList<>();
        presupuestoRepository.findAll().forEach(presupuesto -> presupuestos.add(presupuesto));
        return presupuestos;
    }

    public Presupuesto getPresupuestoByNConsejo(String nconsejo){
        Presupuesto presupuesto;
        presupuesto = presupuestoRepository.findPresupuestoByPresupuestoNConsejo(nconsejo);
        return presupuesto;
    }
}