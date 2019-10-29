package com.fisisac.developer.fisisackback.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "descripcion_prep_detalle")
public class DescripcionPresupuestoDetalle{
    @Id
    @Column(name = "id_desc_prep_detalle")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "id_tipo_desc_prep")
    private int idtipodescprep;
    @Column(name = "desc_prep_detalle_descripcion")
    private String descprepdetalledescripcion;

    public DescripcionPresupuestoDetalle(){
    }

    public DescripcionPresupuestoDetalle(int id, int idtipodescprep, String descprepdetalledescripcion){
                            this.id = id;
                            this.idtipodescprep=idtipodescprep;
                            this.descprepdetalledescripcion = descprepdetalledescripcion;
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdtipodescprep() {
		return this.idtipodescprep;
	}

	public void setIdtipodescprep(int idtipodescprep) {
		this.idtipodescprep = idtipodescprep;
	}

	public String getDescprepdetalledescripcion() {
		return this.descprepdetalledescripcion;
	}

	public void setDescprepdetalledescripcion(String descprepdetalledescripcion) {
		this.descprepdetalledescripcion = descprepdetalledescripcion;
	}

	

}