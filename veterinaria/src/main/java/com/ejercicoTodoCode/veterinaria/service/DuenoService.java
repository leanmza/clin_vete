package com.ejercicoTodoCode.veterinaria.service;

import com.ejercicoTodoCode.veterinaria.model.Dueno;
import com.ejercicoTodoCode.veterinaria.repository.IDuenoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DuenoService implements IDuenoService{

    @Autowired
    IDuenoRepository duenoRepository;

    @Override
    public List<Dueno> getDuenos() {
        return duenoRepository.findAll();
    }

    @Override
    public void saveDueno(Dueno dueno) {
        duenoRepository.save(dueno);

    }

    @Override
    public void deleteDueno(Long id) {
        duenoRepository.deleteById(id);
    }

    @Override
    public void editDueno(Dueno dueno) {
        this.saveDueno(dueno);
    }

    @Override
    public Dueno findDueno(Long idDueno) {
        return duenoRepository.findById(idDueno).orElse(null);
    }
}
