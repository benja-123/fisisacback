package com.fisisac.developer.fisisackback.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "presupuesto_resumen")
public class PresupuestoResumen {
    @Id
    @Column(name = "id_prep_resumen")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "id_presupuesto")
    private int idpresupuesto;
    @Column(name = "id_clas_gasto")
    private int idclasgasto;
    @Column(name = "importe")
    private float importe;



    public PresupuestoResumen(){
    }

    public PresupuestoResumen(int id, int idpresupuesto, int idclasgasto, float importe){
                            this.id = id;
                            this.idpresupuesto=idpresupuesto;
                            this.idclasgasto=idclasgasto;
                            this.importe=importe;
    }
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdpresupuesto() {
		return this.idpresupuesto;
	}

	public void setIdpresupuesto(int idpresupuesto) {
		this.idpresupuesto = idpresupuesto;
	}

	public int getIdclasgasto() {
		return this.idclasgasto;
	}

	public void setIdclasgasto(int idclasgasto) {
		this.idclasgasto = idclasgasto;
	}

	public float getImporte() {
		return this.importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}

}