package com.uisrael.juridic.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;

@Entity
public class AccesoCliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Timestamp fechaacceso;

    @ManyToOne
    @JoinColumn(name = "clienteid")
    private Entidad cliente;

    @ManyToOne
    @JoinColumn(name = "casoid")
    private Caso caso;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getFechaacceso() {
        return fechaacceso;
    }

    public void setFechaacceso(Timestamp fechaacceso) {
        this.fechaacceso = fechaacceso;
    }

    public Entidad getCliente() {
        return cliente;
    }

    public void setCliente(Entidad cliente) {
        this.cliente = cliente;
    }

    public Caso getCaso() {
        return caso;
    }

    public void setCaso(Caso caso) {
        this.caso = caso;
    }
}
