package com.fisisac.developer.fisisackback.service.impl;

import java.util.HashSet;
import java.util.Set;

import com.fisisac.developer.fisisackback.domain.Presupuesto;
import com.fisisac.developer.fisisackback.repository.PresupuestoRepository;
import com.fisisac.developer.fisisackback.service.PresupuestoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PresupuestoServiceImpl implements PresupuestoService{
    
    @Autowired
    PresupuestoRepository presupuestoRepository;

    public Set<Presupuesto> getAllPresupuestos(){
        Set<Presupuesto> setPresupuestos = new HashSet<>();
        presupuestoRepository.findAll().forEach(presupuesto -> setPresupuestos.add(presupuesto));
        return setPresupuestos;
    }
}