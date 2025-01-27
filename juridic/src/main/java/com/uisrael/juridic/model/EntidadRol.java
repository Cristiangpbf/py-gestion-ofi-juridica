package com.uisrael.juridic.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "ENTIDADROL")
public class EntidadRol implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "entidadId")
    private Entidad entidad;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "rolId")
    private Rol rol;
}
