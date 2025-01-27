package com.uisrael.juridic.services;

import com.uisrael.juridic.model.Caso;

import java.util.List;

public interface ICasoServices {
    public void insertCaso(Caso nuevo);
    public List<Caso> listCaso();
}
