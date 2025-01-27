package com.uisrael.juridic.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Entity
public class Entidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreCompleto;
    @Column(unique = true, nullable = false) // El correo será único y no podrá ser null
    private String email;
    private String telefono;
    private String direccion;
    private Timestamp fechaRegistro;

}
