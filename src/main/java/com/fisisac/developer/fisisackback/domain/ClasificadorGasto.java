package com.fisisac.developer.fisisackback.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "clasificador_gasto")
public class ClasificadorGasto {

    @Id
    @Column(name = "id_cgasto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCgasto;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_tegreso")
    private TipoEgreso tegreso;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_ccg")
    private CategoriaClasificadorGasto ccg;
    @Column(name = "cgasto_codigo")
    private String cgasto_codigo;
    @Column(name = "cgasto_desc")
    private String cgastoDescripcion;
    @Column(name = "cgasto_porc")
    private String cgastoPorcentaje;

    public ClasificadorGasto() {
    }

    public ClasificadorGasto(int idCgasto, TipoEgreso tegreso, CategoriaClasificadorGasto ccg, String cgasto_codigo, String cgastoDescripcion, String cgastoPorcentaje) {
        this.idCgasto = idCgasto;
        this.tegreso = tegreso;
        this.ccg = ccg;
        this.cgasto_codigo = cgasto_codigo;
        this.cgastoDescripcion = cgastoDescripcion;
        this.cgastoPorcentaje = cgastoPorcentaje;
    }

    public int getIdCgasto() {
        return idCgasto;
    }

    public void setIdCgasto(int idCgasto) {
        this.idCgasto = idCgasto;
    }

    public TipoEgreso getTegreso() {
        return tegreso;
    }

    public void setTegreso(TipoEgreso tegreso) {
        this.tegreso = tegreso;
    }

    public CategoriaClasificadorGasto getCcg() {
        return ccg;
    }

    public void setCcg(CategoriaClasificadorGasto ccg) {
        this.ccg = ccg;
    }

    public String getCgasto_codigo() {
        return cgasto_codigo;
    }

    public void setCgasto_codigo(String cgasto_codigo) {
        this.cgasto_codigo = cgasto_codigo;
    }

    public String getCgastoDescripcion() {
        return cgastoDescripcion;
    }

    public void setCgastoDescripcion(String cgastoDescripcion) {
        this.cgastoDescripcion = cgastoDescripcion;
    }

    public String getCgastoPorcentaje() {
        return cgastoPorcentaje;
    }

    public void setCgastoPorcentaje(String cgastoPorcentaje) {
        this.cgastoPorcentaje = cgastoPorcentaje;
    }

}
