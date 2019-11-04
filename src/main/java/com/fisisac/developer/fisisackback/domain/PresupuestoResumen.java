package com.fisisac.developer.fisisackback.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity(name = "presupuesto_resumen")
public class PresupuestoResumen {

    @Id
    @Column(name = "id_presumen")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_presupuesto")
    private Presupuesto presupuesto;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_cgasto")
    private ClasificadorGasto idclasgasto;
    @Column(name = "importe")
    private float importe;

    public PresupuestoResumen() {
    }

    public PresupuestoResumen(int id, Presupuesto presupuesto, ClasificadorGasto idclasgasto, float importe) {
        this.id = id;
        this.presupuesto = presupuesto;
        this.idclasgasto = idclasgasto;
        this.importe = importe;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Presupuesto getIdpresupuesto() {
        return this.presupuesto;
    }

    public void setPresupuesto(Presupuesto presupuesto) {
        this.presupuesto = presupuesto;
    }

    public ClasificadorGasto getIdclasgasto() {
        return idclasgasto;
    }

    public void setIdclasgasto(ClasificadorGasto idclasgasto) {
        this.idclasgasto = idclasgasto;
    }

    public float getImporte() {
        return this.importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

}
