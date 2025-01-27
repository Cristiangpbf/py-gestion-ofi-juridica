package com.uisrael.juridic.services.impl;

import com.uisrael.juridic.model.Entidad;
import com.uisrael.juridic.repository.IEntidadRepository;
import com.uisrael.juridic.services.IEntidadServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntidadServicesImpl implements IEntidadServices {

    @Autowired
    private IEntidadRepository repo;

    @Override
    public void insertEntidad(Entidad nuevo) {
        try {
            repo.save(nuevo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Entidad> listEntidad() {
        return repo.findAll();
    }
}
