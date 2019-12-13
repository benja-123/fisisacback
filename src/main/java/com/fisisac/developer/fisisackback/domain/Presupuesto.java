package com.fisisac.developer.fisisackback.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity(name = "presupuesto")
public class Presupuesto{
    @Id
    @Column(name = "id_presupuesto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Integer id;
    @Column(name = "presupuesto_anio")
    private int anio;
    @Column(name = "presupuesto_nconsejo")
    private String numconfac;
    @Column(name = "presupuesto_fconsejo")
    private Date fechacon;
    @Column(name = "presupuesto_numrd")
    private String numrd;
    @Column(name = "presupuesto_fechard")
    private Date rdfecha;
    @Column(name = "presupuesto_numrr")
    private String numrr;
    @Column(name = "presupuesto_fecharr")
    private Date rrfecha;

    public Presupuesto(){
    }

    public Presupuesto(int id, int anio, String numconfac, Date fechacon, String numrd, 
                        Date rdfecha, String numrr, Date rrfecha){
                            this.id = id;
                            this.anio = anio;
                            this.fechacon = fechacon;
                            this.numconfac = numconfac;
                            this.numrd = numrd;
                            this.rdfecha = rdfecha;
                            this.numrr = numrr;
                            this.rrfecha = rrfecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getNumconfac() {
        return numconfac;
    }

    public void setNumconfac(String numconfac) {
        this.numconfac = numconfac;
    }

    public Date getFechaCon() {
        return this.fechacon;
    }

    public void setFechaCon(Date fechacon) {
        this.fechacon = fechacon;
    }

    public String getNumrd() {
        return numrd;
    }

    public void setNumrd(String numrd) {
        this.numrd = numrd;
    }

    public Date getRdfecha() {
        return rdfecha;
    }

    public void setRdfecha(Date rdfecha) {
        this.rdfecha = rdfecha;
    }

    public String getNumrr() {
        return numrr;
    }

    public void setNumrr(String numrr) {
        this.numrr = numrr;
    }

    public Date getRrfecha() {
        return rrfecha;
    }

    public void setRrfecha(Date rrfecha) {
        this.rrfecha = rrfecha;
    }
}
