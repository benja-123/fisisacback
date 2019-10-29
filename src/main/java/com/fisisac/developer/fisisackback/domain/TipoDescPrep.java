package com.fisisac.developer.fisisackback.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tipo_desc_prep")
public class TipoDescPrep {
	@Id
	@Column(name = "id_tipo_desc_prep")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_tipo_desc_prep;
	@Column(name = "tipo_desc_prep_nombre")
	private String tipo_desc_prep_nombre;
}

	public TipoDescPrep(){
	}

	public TipoDescPrep(int id_tipo_desc_prep, String tipo_desc_prep_nombre){
		this.id_tipo_desc_prep = id_tipo_desc_prep;
        this.tipo_desc_prep_nombre = tipo_desc_prep_nombre;
	}

	public int getIdTipoDescPrep() {
		return this.id_tipo_desc_prep;
	}

	public void setIdTipoDescPrep (int id_tipo_desc_prep) {
		this.id_tipo_desc_prep = id_tipo_desc_prep;
	}

	public String getTipoDescPrepNombre() {
		return this.tipo_desc_prep_nombre;
	}

	public void setTipoDescPrepNombre (String tipo_desc_prep_nombre) {
		this.tipo_desc_prep_nombre = tipo_desc_prep_nombre;
	}

}