package com.uisrael.juridic.services;

import com.uisrael.juridic.model.Caso;
import com.uisrael.juridic.model.Plazo;

import java.util.List;

public interface IPlazoServices {
    public void insertPlazo(Plazo nuevo);
    public List<Plazo> listPlazo();
    public Plazo getPlazo(int id);
    List<Plazo> listPlazoXCasoId(Integer casoId);
}
