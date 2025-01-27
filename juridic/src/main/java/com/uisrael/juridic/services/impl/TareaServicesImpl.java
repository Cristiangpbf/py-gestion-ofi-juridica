package com.uisrael.juridic.services.impl;

import com.uisrael.juridic.model.Tarea;
import com.uisrael.juridic.repository.ITareaRepository;
import com.uisrael.juridic.services.ITareaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaServicesImpl implements ITareaServices {

    @Autowired
    private ITareaRepository repo;

    @Override
    public void insertTarea(Tarea nuevo) {
        try {
            repo.save(nuevo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Tarea> listTarea() {
        return repo.findAll();
    }
}
