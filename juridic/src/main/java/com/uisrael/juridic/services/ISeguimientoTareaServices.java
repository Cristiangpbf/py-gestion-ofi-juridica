package com.uisrael.juridic.services;

import com.uisrael.juridic.model.SeguimientoTarea;

import java.util.List;

public interface ISeguimientoTareaServices {
    public void insertSeguimientoTarea(SeguimientoTarea nuevo);
    public List<SeguimientoTarea> listSeguimientoTarea();
}
