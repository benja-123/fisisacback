package com.fisisac.developer.fisisackback.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "categoria_clasificador_gasto")
public class CategoriaClasificadorGasto {

    @Id
    @Column(name = "id_ccg")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCcg;
    @Column(name = "ccg_desc")
    private String ccgDescripcion;
    @Column(name = "ccg_siglas")
    private String ccgSiglas;

    public CategoriaClasificadorGasto() {
    }

    public CategoriaClasificadorGasto(int idCcg, String ccgDescripcion, String ccgSiglas) {
        this.idCcg = idCcg;
        this.ccgDescripcion = ccgDescripcion;
        this.ccgSiglas = ccgSiglas;
    }

    public int getIdCcg() {
        return idCcg;
    }

    public void setIdCcg(int idCcg) {
        this.idCcg = idCcg;
    }

    public String getCcgDescripcion() {
        return ccgDescripcion;
    }

    public void setCcgDescripcion(String ccgDescripcion) {
        this.ccgDescripcion = ccgDescripcion;
    }

    public String getCcgSiglas() {
        return ccgSiglas;
    }

    public void setCcgSiglas(String ccgSiglas) {
        this.ccgSiglas = ccgSiglas;
    }

}
