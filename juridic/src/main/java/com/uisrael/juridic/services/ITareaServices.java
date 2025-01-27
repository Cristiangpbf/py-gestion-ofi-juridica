package com.uisrael.juridic.services;

import com.uisrael.juridic.model.Tarea;

import java.util.List;

public interface ITareaServices {
    public void insertTarea(Tarea nuevo);
    public List<Tarea> listTarea();
}
