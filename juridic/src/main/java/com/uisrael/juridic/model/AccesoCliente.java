package com.uisrael.juridic.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
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
}
