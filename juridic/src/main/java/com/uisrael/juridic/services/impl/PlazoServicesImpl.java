package com.uisrael.juridic.services.impl;

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
        try {
            repo.save(nuevo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Plazo> listPlazo() {
        return repo.findAll();
    }
}
