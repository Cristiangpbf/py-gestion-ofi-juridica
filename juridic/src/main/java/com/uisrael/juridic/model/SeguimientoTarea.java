package com.uisrael.juridic.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Entity
public class SeguimientoTarea implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String comentario;
    private byte[] evidencia;
    private String estado;
    private Timestamp fechaActualizacion;

    @ManyToOne
    @JoinColumn(name = "tareaid")
    private Tarea tarea;

}
