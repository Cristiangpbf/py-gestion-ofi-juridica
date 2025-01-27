package com.uisrael.juridic.services;

import com.uisrael.juridic.model.Rol;

import java.util.List;

public interface IRolServices {
    public void insertRol(Rol nuevo);
    public List<Rol> listRol();
}
