package com.fisisac.developer.fisisackback.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "presupuesto_detalle")
public class PresupuestoDetalle {

    @Id
    @Column(name = "id_pdetalle")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_presupuesto")
    private Presupuesto presupuesto;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_semestre")
    private Semestre semestre;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_curso")
    private Curso curso;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_programa")
    private Programa programa;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_cgastodet")
    private ClasificadorGastoDet cGastoDet;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_tunidad")
    private TipoUnidad tipounidad;
    @Column(name = "grado_docente")
    private String gradodocente;
    @Column(name = "pago_utiempo")
    private float pagoporunittiempo;
    @Column(name = "pago_unitario_sd")
    private float pagounitariosd;
    @Column(name = "precio_referencial")
    private float precioreferencial;
    @Column(name = "costo_unit")
    private float costounit;
    @Column(name = "n_cantidad")
    private float nrocantidad;
    @Column(name = "n_unidad")
    private float nrounidad;
    @Column(name = "total")
    private float total;

    public PresupuestoDetalle() {
    }

    public PresupuestoDetalle(int id, Presupuesto presupuesto, Semestre semestre, Curso curso, Programa programa, ClasificadorGastoDet cGastoDet, TipoUnidad tipounidad, String gradodocente, float pagoporunittiempo, float pagounitariosd, float precioreferencial, float costounit, float nrocantidad, float nrounidad, float total) {
        this.id = id;
        this.presupuesto = presupuesto;
        this.semestre = semestre;
        this.curso = curso;
        this.programa = programa;
        this.cGastoDet = cGastoDet;
        this.tipounidad = tipounidad;
        this.gradodocente = gradodocente;
        this.pagoporunittiempo = pagoporunittiempo;
        this.pagounitariosd = pagounitariosd;
        this.precioreferencial = precioreferencial;
        this.costounit = costounit;
        this.nrocantidad = nrocantidad;
        this.nrounidad = nrounidad;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Presupuesto getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Presupuesto presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Semestre getSemestre() {
        return semestre;
    }

    public void setSemestre(Semestre semestre) {
        this.semestre = semestre;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    public ClasificadorGastoDet getcGastoDet() {
        return cGastoDet;
    }

    public void setcGastoDet(ClasificadorGastoDet cGastoDet) {
        this.cGastoDet = cGastoDet;
    }

    public TipoUnidad getTipounidad() {
        return tipounidad;
    }

    public void setTipounidad(TipoUnidad tipounidad) {
        this.tipounidad = tipounidad;
    }

    public String getGradodocente() {
        return gradodocente;
    }

    public void setGradodocente(String gradodocente) {
        this.gradodocente = gradodocente;
    }

    public float getPagoporunittiempo() {
        return pagoporunittiempo;
    }

    public void setPagoporunittiempo(float pagoporunittiempo) {
        this.pagoporunittiempo = pagoporunittiempo;
    }

    public float getPagounitariosd() {
        return pagounitariosd;
    }

    public void setPagounitariosd(float pagounitariosd) {
        this.pagounitariosd = pagounitariosd;
    }

    public float getPrecioreferencial() {
        return precioreferencial;
    }

    public void setPrecioreferencial(float precioreferencial) {
        this.precioreferencial = precioreferencial;
    }

    public float getCostounit() {
        return costounit;
    }

    public void setCostounit(float costounit) {
        this.costounit = costounit;
    }

    public float getNrocantidad() {
        return nrocantidad;
    }

    public void setNrocantidad(float nrocantidad) {
        this.nrocantidad = nrocantidad;
    }

    public float getNrounidad() {
        return nrounidad;
    }

    public void setNrounidad(float nrounidad) {
        this.nrounidad = nrounidad;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

}
