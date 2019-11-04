package com.fisisac.developer.fisisackback.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "clasificador_gasto_det")
public class ClasificadorGastoDet {
    
    @Id
    @Column(name = "id_cgastodet")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCgastoDet;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_tcg")
    private TipoClasificadorGasto tcg;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_cgasto")
    private ClasificadorGasto cgasto;
    @Column(name = "cgastodet_desc")
    private String cGastoDetDesc;

    public ClasificadorGastoDet() {
    }

    public ClasificadorGastoDet(int idCgastoDet, TipoClasificadorGasto tcg, ClasificadorGasto cgasto, String cGastoDetDesc) {
        this.idCgastoDet = idCgastoDet;
        this.tcg = tcg;
        this.cgasto = cgasto;
        this.cGastoDetDesc = cGastoDetDesc;
    }

    public int getIdCgastoDet() {
        return idCgastoDet;
    }

    public void setIdCgastoDet(int idCgastoDet) {
        this.idCgastoDet = idCgastoDet;
    }

    public TipoClasificadorGasto getTcg() {
        return tcg;
    }

    public void setTcg(TipoClasificadorGasto tcg) {
        this.tcg = tcg;
    }

    public ClasificadorGasto getCgasto() {
        return cgasto;
    }

    public void setCgasto(ClasificadorGasto cgasto) {
        this.cgasto = cgasto;
    }

    public String getcGastoDetDesc() {
        return cGastoDetDesc;
    }

    public void setcGastoDetDesc(String cGastoDetDesc) {
        this.cGastoDetDesc = cGastoDetDesc;
    }
    
}
