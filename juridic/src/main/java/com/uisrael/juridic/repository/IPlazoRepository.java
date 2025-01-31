package com.uisrael.juridic.repository;

import com.uisrael.juridic.model.Caso;
import com.uisrael.juridic.model.Plazo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPlazoRepository extends JpaRepository<Plazo, Integer> {

    @Query("SELECT p FROM Plazo p " +
            "JOIN Caso c ON c.id = p.caso.id " +
            "WHERE c.id = :casoId")
    List<Plazo> findByCasoId(@Param("casoId") Integer casoId);
}
