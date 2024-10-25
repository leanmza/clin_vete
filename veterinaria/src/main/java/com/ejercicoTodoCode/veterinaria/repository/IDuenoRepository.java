package com.ejercicoTodoCode.veterinaria.repository;

import com.ejercicoTodoCode.veterinaria.model.Dueno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDuenoRepository extends JpaRepository<Dueno,Long> {
}
