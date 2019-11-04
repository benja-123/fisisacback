package com.fisisac.developer.fisisackback.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "presupuesto")
public class Presupuesto{
    @Id
    @Column(name = "id_presupuesto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "presupuesto_anio")
    private float año;
    @Column(name = "presupuesto_nconsejo")
    private String numconfac;
    @Column(name = "presupuesto_fconsejo")
    private Date fechaconfac;
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

    public Presupuesto(int id, float año, String numconfac, Date fechaconfac, String numrd, 
                        Date rdfecha, String numrr, Date rrfecha){
                            this.id = id;
                            this.año = año;
                            this.fechaconfac = fechaconfac;
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

    public float getAño() {
        return año;
    }

    public void setAño(float año) {
        this.año = año;
    }

    public String getNumconfac() {
        return numconfac;
    }

    public void setNumconfac(String numconfac) {
        this.numconfac = numconfac;
    }

    public Date getFecha() {
        return this.fechaconfac;
    }

    public void setFecha(Date fechaconfac) {
        this.fechaconfac = fechaconfac;
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