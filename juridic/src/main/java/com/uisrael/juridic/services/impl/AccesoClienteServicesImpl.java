package com.uisrael.juridic.services.impl;

import com.uisrael.juridic.model.AccesoCliente;
import com.uisrael.juridic.repository.IAccesoClienteRepository;
import com.uisrael.juridic.services.IAccesoClienteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccesoClienteServicesImpl implements IAccesoClienteServices {

    @Autowired
    private IAccesoClienteRepository repo;

    @Override
    public void insertAccesoCliente(AccesoCliente nuevo) {
        try {
            repo.save(nuevo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<AccesoCliente> listAccesoCliente() {
        return repo.findAll();
    }
}
