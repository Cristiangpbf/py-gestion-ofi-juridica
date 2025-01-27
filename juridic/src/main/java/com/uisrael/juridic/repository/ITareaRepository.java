package com.uisrael.juridic.repository;

import com.uisrael.juridic.model.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITareaRepository extends JpaRepository<Tarea, Integer> {
}
