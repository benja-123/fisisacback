package com.fisisac.developer.fisisackback.service.impl;

import com.fisisac.developer.fisisackback.domain.Presupuesto;
import com.fisisac.developer.fisisackback.repository.PresupuestoRepository;
import com.fisisac.developer.fisisackback.service.PresupuestoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PresupuestoServiceImpl implements PresupuestoService{
    
    @Autowired
    PresupuestoRepository presupuestoRepository;

    public boolean savePresupuesto(Presupuesto presupuesto){
        try {
            presupuestoRepository.save(presupuesto);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}