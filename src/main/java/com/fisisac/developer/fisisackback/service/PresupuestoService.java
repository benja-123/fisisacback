package com.fisisac.developer.fisisackback.service;

import java.util.List;

import com.fisisac.developer.fisisackback.domain.Presupuesto;

public interface PresupuestoService {
    public Presupuesto savePresupuesto( Presupuesto presupuesto);
    public List<Presupuesto> getAllPresupuestos();
}