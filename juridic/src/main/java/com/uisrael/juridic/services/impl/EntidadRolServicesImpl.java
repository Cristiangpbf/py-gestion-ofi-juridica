package com.uisrael.juridic.services.impl;

import com.uisrael.juridic.model.EntidadRol;
import com.uisrael.juridic.repository.IEntidadRolRepository;
import com.uisrael.juridic.services.IEntidadRolServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntidadRolServicesImpl implements IEntidadRolServices {

    @Autowired
    private IEntidadRolRepository repo;

    @Override
    public void insertEntidadRol(EntidadRol nuevo) {
        try {
            repo.save(nuevo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<EntidadRol> listEntidadRol() {
        return repo.findAll();
    }
}
