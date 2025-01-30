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
        repo.save(nuevo);
    }

    @Override
    public List<Entidad> listEntidad() {
        return repo.findAll();
    }

    @Override
    public Entidad getEntidad(int id) {
        return repo.findById(id).get();
    }

    @Override
    public void updateEntidad(Entidad entidad) {
        repo.save(entidad);
    }

    @Override
    public void deleteEntidad(int id) {
        repo.deleteById(id);
    }

    @Override
    public List<Entidad> listaXRol(String nombreRol) {
        return repo.findByRol(nombreRol);
    }
}
