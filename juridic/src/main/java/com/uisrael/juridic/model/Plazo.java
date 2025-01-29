package com.uisrael.juridic.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
public class Plazo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String titulo;
    private String descripcion;
    private Date fechaevento;
    private Boolean recordatorio;
    private Boolean notificado;
    private Timestamp fechacreacion;

    @ManyToOne
    @JoinColumn(name = "casoid")
    private Caso caso;

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

    public Date getFechaevento() {
        return fechaevento;
    }

    public void setFechaevento(Date fechaevento) {
        this.fechaevento = fechaevento;
    }

    public Boolean getRecordatorio() {
        return recordatorio;
    }

    public void setRecordatorio(Boolean recordatorio) {
        this.recordatorio = recordatorio;
    }

    public Boolean getNotificado() {
        return notificado;
    }

    public void setNotificado(Boolean notificado) {
        this.notificado = notificado;
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
}
