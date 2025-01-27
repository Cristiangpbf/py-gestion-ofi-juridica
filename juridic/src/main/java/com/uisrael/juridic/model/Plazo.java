package com.uisrael.juridic.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

@Data
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

}
