package com.uisrael.juridic.repository;

import com.uisrael.juridic.model.Entidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IEntidadRepository extends JpaRepository<Entidad, Integer> {

    @Query("SELECT e FROM Entidad e " +
            "JOIN EntidadRol er ON e.id = er.entidad.id " +
            "JOIN Rol r ON er.rol.id = r.id " +
            "WHERE r.nombreRol = :nombreRol")
    List<Entidad> findByRol(@Param("nombreRol") String nombreRol);

}
