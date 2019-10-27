package com.fisisac.developer.fisisackback.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tipo_cantidad")
public class TipoCantidad {
	@Id
	@Column(name = "id_tipo_cantidad")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "tipo_cantidad_nombre")
	private String tipocantnombre;

	public Curso(){
	}

	public Curso(int id, String tipocantnombre){
		this.id = id;
		this.tipocantnombre = tipocantnombre;
	}

	public int getId(){
		return this.id;
	}

	public void setId(int id){
		this.id = id;
	}

	public String gettipocantnombre(){
		return this.tipocantnombre;
	}

	public void settipocantnombre(String tipocantnombre){
		this.tipocantnombre = tipocantnombre;
	}

}