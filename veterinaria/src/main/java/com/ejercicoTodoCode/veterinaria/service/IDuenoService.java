package com.ejercicoTodoCode.veterinaria.service;

import com.ejercicoTodoCode.veterinaria.model.Dueno;

import java.util.List;

public interface IDuenoService {
    List<Dueno> getDuenos();

    void saveDueno(Dueno dueno);

    void deleteDueno(Long id);

    void editDueno(Dueno dueno);

    Dueno findDueno(Long idDueno);
}
