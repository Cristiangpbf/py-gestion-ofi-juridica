package com.uisrael.juridic.services.impl;

import com.uisrael.juridic.model.Caso;
import com.uisrael.juridic.repository.ICasoRepository;
import com.uisrael.juridic.services.ICasoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CasoServicesImpl implements ICasoServices {

    @Autowired
    private ICasoRepository repo;

    @Override
    public void insertCaso(Caso nuevo) {
        try {
            repo.save(nuevo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateCaso(Caso caso) {
        repo.save(caso);
    }

    @Override
    public void deleteCaso(int caso) {
        repo.deleteById(caso);
    }

    @Override
    public Caso getCaso(int id) {
        return repo.findById(id).get();

    }

    @Override
    public List<Caso> listCaso() {
        return repo.findAll();
    }
}
