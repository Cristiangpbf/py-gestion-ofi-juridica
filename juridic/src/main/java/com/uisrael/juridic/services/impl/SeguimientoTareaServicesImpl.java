package com.uisrael.juridic.services.impl;

import com.uisrael.juridic.model.SeguimientoTarea;
import com.uisrael.juridic.repository.ISeguimientoTareaRepository;
import com.uisrael.juridic.services.ISeguimientoTareaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeguimientoTareaServicesImpl implements ISeguimientoTareaServices {

    @Autowired
    private ISeguimientoTareaRepository repo;

    @Override
    public void insertSeguimientoTarea(SeguimientoTarea nuevo) {
        try {
            repo.save(nuevo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<SeguimientoTarea> listSeguimientoTarea() {
        return repo.findAll();
    }
}
