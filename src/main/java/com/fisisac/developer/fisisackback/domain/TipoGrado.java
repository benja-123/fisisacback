package com.fisisac.developer.fisisackback.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tipo_grado")
public class TipoGrado{

    @Id
    @Column(name = "id_tip_grado")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoGrado;
    @Column(name = "nom_tip_grado")
    private String nombreTipoGrado;

    public TipoGrado(){
    }

    public TipoGrado(int idTipoGrado, String nombreTipoGrado){
        this.idTipoGrado = idTipoGrado;
        this.nombreTipoGrado = nombreTipoGrado;
    }

    public int getIdTipoGrado(){
        return this.idTipoGrado;
    }

    public void setIdTipoGrado(int idTipoGrado){
        this.idTipoGrado = idTipoGrado;
    }

    public String getNombreTipoGRado(){
        return this.nombreTipoGrado;
    }

    public void setNombreTipoGrado(String nombreTipoGrado){
        this.nombreTipoGrado = nombreTipoGrado;
    }
}