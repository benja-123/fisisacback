package com.fisisac.developer.fisisackback.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "clasificador_gasto")
public class ClasificadorGasto {
	@Id
	@Column(name = "id_clas_gasto")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int id_clas_gasto;
	@Column(name = "id_cat_egreso")
	private int id_cat_egreso;
	@Column(name = "tipo_gasto")
	private long tipo_gasto;
	@Column(name = "clas_gasto_nombre")
	private String clas_gasto_nombre;
	@Column(name = "clas_gasto_porcentaje")
	private String clas_gasto_porcentaje;

	public ClasificadorGasto(){
	}

	public ClasificadorGasto(int id_clas_gasto, int id_cat_egreso, int tipo_gasto,
                String clas_gasto_nombre, String clas_gasto_porcentaje){
		this.id_clas_gasto = id_clas_gasto;
        this.id_cat_egreso = id_cat_egreso;
        this.tipo_gasto = tipo_gasto;
        this.clas_gasto_nombre = clas_gasto_nombre;
        this.clas_gasto_porcentaje = clas_gasto_porcentaje;
	}

	public int getIdClasGasto(){
		return this.id_clas_gasto;
	}

	public void setIdClasGasto(int id_clas_gasto){
		this.id_clas_gasto = id_clas_gasto;
	}

	public int getIdCatEgreso(){
		return this.id_cat_egreso;
	}

	public void setIdCatEgreso(int id_cat_egreso){
		this.id_cat_egreso = id_cat_egreso;
	}

	public Long getTipoGasto(){
		return this.tipo_gasto;
	}

	public void setTipoGasto(int tipo_gasto){
		this.tipo_gasto = tipo_gasto;
	}

	public String getClasGastoNombre(){
		return this.clas_gasto_nombre;
	}

	public void setClasGastoNombre(String clas_gasto_nombre){
		this.clas_gasto_nombre = clas_gasto_nombre;
	}

	public String getClasGastoPorcentaje(){
		return this.clas_gasto_porcentaje;
	}

	public void setClasGastoPorcentaje(String clas_gasto_porcentaje){
		this.clas_gasto_porcentaje = clas_gasto_porcentaje;
	}

}