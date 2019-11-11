package com.fisisac.developer.fisisackback.service.impl;

import java.util.List;

import com.fisisac.developer.fisisackback.domain.PresupuestoDetalle;
import com.fisisac.developer.fisisackback.repository.PresupuestoDetalleRepository;
import com.fisisac.developer.fisisackback.service.PresupuestoDetalleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PresupuestoDetalleServiceImpl implements PresupuestoDetalleService{

    @Autowired
    PresupuestoDetalleRepository presupuestoDetRepo;

    public void saveAllPresupuestoDet(List<PresupuestoDetalle> presupuestoDetalles){
        presupuestoDetRepo.saveAll(presupuestoDetalles);
    }
}