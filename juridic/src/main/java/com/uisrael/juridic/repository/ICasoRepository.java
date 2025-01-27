package com.uisrael.juridic.repository;

import com.uisrael.juridic.model.Caso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICasoRepository extends JpaRepository<Caso, Integer> {
}
