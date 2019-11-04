package com.fisisac.developer.fisisackback.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tipo_egreso")
public class TipoEgreso {

    @Id
    @Column(name = "id_tegreso")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTegreso;
    @Column(name = "tegreso_desc")
    private String tegresoDescripcion;
    @Column(name = "tegreso_siglas")
    private String tegresoSiglas;

    public TipoEgreso() {
    }

    public TipoEgreso(int idTegreso, String tegresoDescripcion, String tegresoSiglas) {
        this.idTegreso = idTegreso;
        this.tegresoDescripcion = tegresoDescripcion;
        this.tegresoSiglas = tegresoSiglas;
    }

    public int getIdTegreso() {
        return idTegreso;
    }

    public void setIdTegreso(int idTegreso) {
        this.idTegreso = idTegreso;
    }

    public String getTegresoDescripcion() {
        return tegresoDescripcion;
    }

    public void setTegresoDescripcion(String tegresoDescripcion) {
        this.tegresoDescripcion = tegresoDescripcion;
    }

    public String getTegresoSiglas() {
        return tegresoSiglas;
    }

    public void setTegresoSiglas(String tegresoSiglas) {
        this.tegresoSiglas = tegresoSiglas;
    }

}
