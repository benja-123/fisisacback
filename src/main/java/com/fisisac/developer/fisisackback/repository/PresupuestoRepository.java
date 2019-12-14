package com.fisisac.developer.fisisackback.repository;

import com.fisisac.developer.fisisackback.domain.Presupuesto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PresupuestoRepository extends JpaRepository<Presupuesto, Integer> {
    Presupuesto findPresupuestoByPresupuestoNConsejo(String presupuesto_nconsejo);
}