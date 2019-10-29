package com.fisisac.developer.fisisackback.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "presupuesto_resumen")
public class PresupuestoResumen {
    @Id
    @Column(name = "id_prep_resumen")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "id_presupuesto")
	private Presupuesto presupuesto;
	
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