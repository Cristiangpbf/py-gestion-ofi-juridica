package com.uisrael.juridic.services;

import com.uisrael.juridic.model.Entidad;

import java.util.List;

public interface IEntidadServices {
    public void insertEntidad(Entidad nuevo);
    public List<Entidad> listEntidad();
    public Entidad getEntidad(int id);
    public void updateEntidad(Entidad entidad);
    public void deleteEntidad(int id);
}
