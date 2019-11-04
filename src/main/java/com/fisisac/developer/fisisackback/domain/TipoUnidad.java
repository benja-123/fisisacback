package com.fisisac.developer.fisisackback.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tipo_unidad")
public class TipoUnidad {
    
    @Id
    @Column(name = "id_tunidad")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoUnidad;
    @Column(name = "tunidad_desc")
    private String tipoUnidadDesc;
    @Column(name = "tunidad_siglas")
    private String tipoUnidadSiglas;

    public TipoUnidad() {
    }

    public TipoUnidad(int idTipoUnidad, String tipoUnidadDesc, String tipoUnidadSiglas) {
        this.idTipoUnidad = idTipoUnidad;
        this.tipoUnidadDesc = tipoUnidadDesc;
        this.tipoUnidadSiglas = tipoUnidadSiglas;
    }

    public int getIdTipoUnidad() {
        return idTipoUnidad;
    }

    public void setIdTipoUnidad(int idTipoUnidad) {
        this.idTipoUnidad = idTipoUnidad;
    }

    public String getTipoUnidadDesc() {
        return tipoUnidadDesc;
    }

    public void setTipoUnidadDesc(String tipoUnidadDesc) {
        this.tipoUnidadDesc = tipoUnidadDesc;
    }

    public String getTipoUnidadSiglas() {
        return tipoUnidadSiglas;
    }

    public void setTipoUnidadSiglas(String tipoUnidadSiglas) {
        this.tipoUnidadSiglas = tipoUnidadSiglas;
    }
    
    
}
