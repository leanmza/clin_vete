package com.ejercicoTodoCode.veterinaria.service;

import com.ejercicoTodoCode.veterinaria.dto.MascotaDuenoDTO;
import com.ejercicoTodoCode.veterinaria.model.Mascota;

import java.util.List;

public interface IMascotaService {
    List<Mascota> getMascotas();

    void saveMascota(Mascota mascota);

    void deleteMascota(Long id);

    void editMascota(Mascota mascota);

    Mascota findMascota(Long idMascota);

    List<Mascota> getCaniches();

    MascotaDuenoDTO getMascota(Long id);
}
