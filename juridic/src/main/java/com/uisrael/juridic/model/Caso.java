package com.uisrael.juridic.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
public class Caso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String codigoReferencia;
    private String tipoCaso;
    private Date fechaInicio;
    private String detalles;
    private String estado;
    private Timestamp fechaCreacion;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "clienteId")
    private Entidad cliente;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "empleadoId")
    private Entidad empleado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigoReferencia() {
        return codigoReferencia;
    }

    public void setCodigoReferencia(String codigoReferencia) {
        this.codigoReferencia = codigoReferencia;
    }

    public String getTipoCaso() {
        return tipoCaso;
    }

    public void setTipoCaso(String tipoCaso) {
        this.tipoCaso = tipoCaso;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Entidad getCliente() {
        return cliente;
    }

    public void setCliente(Entidad cliente) {
        this.cliente = cliente;
    }

    public Entidad getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Entidad empleado) {
        this.empleado = empleado;
    }
}
