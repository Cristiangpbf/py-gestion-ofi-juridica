package com.uisrael.juridic.model;

import jakarta.persistence.*;

import java.io.Serializable;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Entidad getEntidad() {
        return entidad;
    }

    public void setEntidad(Entidad entidad) {
        this.entidad = entidad;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
