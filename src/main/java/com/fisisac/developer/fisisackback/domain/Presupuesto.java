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
    @Column(name = "presupuesto_año")
    private float año;
    @Column(name = "presupuesto_numconfac")
    private String numconfac;
    @Column(name = "presupuesto_fecha")
    private Date fecha;
    @Column(name = "presupuesto_numrd")
    private String numrd;
    @Column(name = "presupuesto_rdfecha")
    private Date rdfecha;
    @Column(name = "presupuesto_numrr")
    private String numrr;
    @Column(name = "presupuesto_rrfecha")
    private Date rrfecha;

    public Presupuesto(){
    }

    public Presupuesto(int id, float año, String numconfac, Date fecha, String numrd, 
                        Date rdfecha, String numrr, Date rrfecha){
                            this.id = id;
                            this.año = año;
                            this.fecha = fecha;
                            this.numconfac = numconfac;
                            this.numrd = numrd;
                            this.rdfecha = rdfecha;
                            this.numrr = numrr;
                            this.rrfecha = rrfecha;
    }
}