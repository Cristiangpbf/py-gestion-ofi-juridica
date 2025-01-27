package com.uisrael.juridic.services;

import com.uisrael.juridic.model.AccesoCliente;

import java.util.List;

public interface IAccesoClienteServices {
    public void insertAccesoCliente(AccesoCliente nuevo);
    public List<AccesoCliente> listAccesoCliente();
}
