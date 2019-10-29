package com.fisisac.developer.fisisackback.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "categoria_egreso")
public class CategoriaEgreso {
	@Id
	@Column(name = "id_cat_egreso")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_cat_egreso;
	@Column(name = "cat_egreso_nombre")
	private String cat_egreso_nombre;
}

	public CategoriaEgreso(){
	}

	public CategoriaEgreso(int id_cat_egreso, String cat_egreso_nombre){
		this.id_cat_egreso = id_cat_egreso;
		this.cat_egreso_nombre = cat_egreso_nombre;
	}

	public int getIdCatEgreso() {
		return this.id_cat_egreso;
	}

	public void setIdCatEgreso(int id_cat_egreso) {
		this.id_cat_egreso = id_cat_egreso;
	}

	public String getCatEgresoNombre() {
		return this.cat_egreso_nombre;
	}

	public void setCatEgresoNombre(String cat_egreso_nombre ) {
		this.cat_egreso_nombre = cat_egreso_nombre;
	}

}