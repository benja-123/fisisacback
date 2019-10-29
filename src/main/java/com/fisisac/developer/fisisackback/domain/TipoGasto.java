package com.fisisac.developer.fisisackback.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tipo_gasto")
public class TipoGasto {
	@Id
	@Column(name = "id_tipo_gasto")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_tipo_gasto;
	@Column(name = "tipo_gasto_nombre")
	private String tipo_gasto_nombre;
}

	public TipoGasto(){
	}

	public TipoGasto(int id_tipo_gasto, String tipo_gasto_nombre){
		this.id_tipo_gasto = id_tipo_gasto;
        this.tipo_gasto_nombre = tipo_gasto_nombre;
	}

	public int getIdTipoGasto() {
		return this.id_tipo_gasto;
	}

	public void setIdTipoGasto (int id_tipo_gasto) {
		this.id_tipo_gasto = id_tipo_gasto;
	}

	public String getTipoGastoNombre() {
		return this.tipo_gasto_nombre;
	}

	public void setTipoGastoNombre (String tipo_gasto_nombre) {
		this.tipo_gasto_nombre = tipo_gasto_nombre;
	}

}