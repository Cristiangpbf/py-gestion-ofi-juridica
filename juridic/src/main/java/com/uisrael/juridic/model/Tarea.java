package com.uisrael.juridic.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

@Data
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

}
