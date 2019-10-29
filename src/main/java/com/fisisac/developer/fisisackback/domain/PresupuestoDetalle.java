package com.fisisac.developer.fisisackback.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "presupuesto_detalle")
public class PresupuestoDetalle {
	@Id
	@Column(name = "id_presupuesto_detalle")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "id_presupuesto")
	private int idpresupuesto;
	@Column(name = "id_clas_gasto")
	private int idclasgasto;
	@Column(name = "id_semestre")
	private int idsemestre;
	@Column(name = "id_desc_prep_detalle")
	private int iddescprepdetalle;
	@Column(name = "id_curso")
	private int idcurso;
	@Column(name = "id_tipo_unidad")
	private int idtipounidad;
	@Column(name = "id_tipo_cantidad")
	private int idtipocantidad;
	@Column(name = "id_programa")
	private int idprograma;
	@Column(name = "grado_docente")
	private String gradodocente;
	@Column(name = "pago_por_unit_tiempo")
	private float pagoporunittiempo;
	@Column(name = "pago_unitario_sd")
	private float pagounitariosd;
	@Column(name = "precio_referencial")
	private float precioreferencial;
	@Column(name = "costo_unit")
	private float costounit;
	@Column(name = "nro_cantidad")
	private float nrocantidad;
	@Column(name = "nro_unidad")
	private float nrounidad;
	@Column(name = "total")
	private float total;


	public PresupuestoDetalle(){
	}

	public PresupuestoDetalle(int id, int idpresupuesto, int idclasgasto, int idsemestre, int iddescprepdetalle, int idcurso, int idtipounidad, int idtipocantidad, int idprograma, String gradodocente, float pagoporunittiempo, float pagounitariosd, float precioreferencial, float costounit, float nrocantidad, float nrounidad, float total){
		this.id = id;
		this.idpresupuesto=idpresupuesto;
		this.idclasgasto=idclasgasto;
		this.idsemestre=idsemestre;
		this.iddescprepdetalle=iddescprepdetalle;
		this.idcurso=idcurso;
		this.idtipounidad=idtipounidad;
		this.idtipocantidad=idtipocantidad;
		this.idprograma=idprograma;
		this.gradodocente=gradodocente;
		this.pagoporunittiempo=pagoporunittiempo;
		this.pagounitariosd=pagounitariosd;
		this.precioreferencial=precioreferencial;
		this.costounit=costounit;
		this.nrocantidad=nrocantidad;
		this.nrounidad=nrounidad;
		this.total=total;
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

	public int getIdsemestre() {
		return this.idsemestre;
	}

	public void setIdsemestre(int idsemestre) {
		this.idsemestre = idsemestre;
	}

	public int getIddescprepdetalle() {
		return this.iddescprepdetalle;
	}

	public void setIddescprepdetalle(int iddescprepdetalle) {
		this.iddescprepdetalle = iddescprepdetalle;
	}

	public int getIdcurso() {
		return this.idcurso;
	}

	public void setIdcurso(int idcurso) {
		this.idcurso = idcurso;
	}

	public int getIdtipounidad() {
		return this.idtipounidad;
	}

	public void setIdtipounidad(int idtipounidad) {
		this.idtipounidad = idtipounidad;
	}

	public int getIdtipocantidad() {
		return this.idtipocantidad;
	}

	public void setIdtipocantidad(int idtipocantidad) {
		this.idtipocantidad = idtipocantidad;
	}

	public int getIdprograma() {
		return this.idprograma;
	}

	public void setIdprograma(int idprograma) {
		this.idprograma = idprograma;
	}

	public String getGradodocente() {
		return this.gradodocente;
	}

	public void setGradodocente(String gradodocente) {
		this.gradodocente = gradodocente;
	}

	public float getPagoporunittiempo() {
		return this.pagoporunittiempo;
	}

	public void setPagoporunittiempo(float pagoporunittiempo) {
		this.pagoporunittiempo = pagoporunittiempo;
	}

	public float getPagounitariosd() {
		return this.pagounitariosd;
	}

	public void setPagounitariosd(float pagounitariosd) {
		this.pagounitariosd = pagounitariosd;
	}

	public float getPrecioreferencial() {
		return this.precioreferencial;
	}

	public void setPrecioreferencial(float precioreferencial) {
		this.precioreferencial = precioreferencial;
	}

	public float getCostounit() {
		return this.costounit;
	}

	public void setCostounit(float costounit) {
		this.costounit = costounit;
	}

	public float getNrocantidad() {
		return this.nrocantidad;
	}

	public void setNrocantidad(float nrocantidad) {
		this.nrocantidad = nrocantidad;
	}


	public float getNrounidad() {
		return this.nrounidad;
	}

	public void setNrounidad(float nrounidad) {
		this.nrounidad = nrounidad;
	}

	public float getTotal() {
		return this.total;
	}

	public void setTotal(float total) {
		this.total = total;
	}




}