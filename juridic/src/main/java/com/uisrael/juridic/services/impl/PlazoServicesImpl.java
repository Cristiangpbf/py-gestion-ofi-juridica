package com.uisrael.juridic.services.impl;

import com.uisrael.juridic.model.Caso;
import com.uisrael.juridic.model.Plazo;
import com.uisrael.juridic.repository.IPlazoRepository;
import com.uisrael.juridic.services.IPlazoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlazoServicesImpl implements IPlazoServices {

    @Autowired
    private IPlazoRepository repo;

    @Override
    public void insertPlazo(Plazo nuevo) {
        repo.save(nuevo);
    }

    @Override
    public List<Plazo> listPlazo() {
        return repo.findAll();
    }

    @Override
    public List<Plazo> listPlazoXCasoId(Integer casoId) {
        return repo.findByCasoId(casoId);
    }

    @Override
    public Plazo getPlazo(int id) {
        return repo.findById(id).get();
    }
}
