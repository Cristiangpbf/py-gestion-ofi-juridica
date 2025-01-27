package com.uisrael.juridic.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
public class Caso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String codigoReferencia;
    private String tipoCaso;
    private String fechaInicio;
    private String detalles;
    private String estado;
    private String fechaCreacion;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "clienteId")
    private Entidad cliente;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "empleadoId")
    private Entidad empleado;
}
