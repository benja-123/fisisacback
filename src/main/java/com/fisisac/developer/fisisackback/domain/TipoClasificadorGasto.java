package com.fisisac.developer.fisisackback.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tipo_clasificador_gasto")
public class TipoClasificadorGasto {
    
    @Id
    @Column(name = "id_tcg")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTcg;
    @Column(name = "tcg_desc")
    private String tcgDescripcion;
    @Column(name = "tcg_siglas")
    private String tcgSiglas;

    public TipoClasificadorGasto() {
    }

    public TipoClasificadorGasto(int idTcg, String tcgDescripcion, String tcgSiglas) {
        this.idTcg = idTcg;
        this.tcgDescripcion = tcgDescripcion;
        this.tcgSiglas = tcgSiglas;
    }

    public int getIdTcg() {
        return idTcg;
    }

    public void setIdTcg(int idTcg) {
        this.idTcg = idTcg;
    }

    public String getTcgDescripcion() {
        return tcgDescripcion;
    }

    public void setTcgDescripcion(String tcgDescripcion) {
        this.tcgDescripcion = tcgDescripcion;
    }

    public String getTcgSiglas() {
        return tcgSiglas;
    }

    public void setTcgSiglas(String tcgSiglas) {
        this.tcgSiglas = tcgSiglas;
    }
    
    
}
