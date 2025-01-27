package com.uisrael.juridic.services.impl;

import com.uisrael.juridic.model.Rol;
import com.uisrael.juridic.repository.IRolRepository;
import com.uisrael.juridic.services.IRolServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolServicesImpl implements IRolServices {

    @Autowired
    private IRolRepository repo;

    @Override
    public void insertRol(Rol nuevo) {
        try {
            repo.save(nuevo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Rol> listRol() {
        return repo.findAll();
    }
}
