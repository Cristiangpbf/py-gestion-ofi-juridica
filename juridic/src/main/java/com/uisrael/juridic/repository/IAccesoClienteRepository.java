package com.uisrael.juridic.repository;

import com.uisrael.juridic.model.AccesoCliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAccesoClienteRepository extends JpaRepository<AccesoCliente, Integer> {
}
