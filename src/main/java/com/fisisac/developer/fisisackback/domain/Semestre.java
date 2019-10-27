package com.fisisac.developer.fisisackback.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "semestre")
public class Semestre{
    @Id
    @Column(name = "id_semestre")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "descripcion")
    private String descripcion;

    public Semestre(){
    }

    public Semestre (int id, String descripcion){
        this.id = id;
        this.descripcion = descripcion;
    }

    public int getId(){
        return this.id;
    }

    public void setId( int id){
        this.id = id;
    }

    public String getDescripcion (){
        return this.descripcion;
    }

    public void setDescripcion (String descripcion){
        this.descripcion = descripcion;
    }
}