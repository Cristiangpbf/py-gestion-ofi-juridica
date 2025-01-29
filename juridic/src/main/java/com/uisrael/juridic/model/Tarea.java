package com.uisrael.juridic.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
public class Tarea implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String titulo;
    private String descripcion;
    private Date fechalimite;
    private String prioridad;
    private String estado;
    private Timestamp fechacreacion;

    @ManyToOne
    @JoinColumn(name = "casoId")
    private Caso caso;

    @ManyToOne
    @JoinColumn(name = "responsableid")
    private Entidad responsable;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechalimite() {
        return fechalimite;
    }

    public void setFechalimite(Date fechalimite) {
        this.fechalimite = fechalimite;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Timestamp getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(Timestamp fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public Caso getCaso() {
        return caso;
    }

    public void setCaso(Caso caso) {
        this.caso = caso;
    }

    public Entidad getResponsable() {
        return responsable;
    }

    public void setResponsable(Entidad responsable) {
        this.responsable = responsable;
    }
}
