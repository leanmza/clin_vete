package com.ejercicoTodoCode.veterinaria.service;

import com.ejercicoTodoCode.veterinaria.dto.MascotaDuenoDTO;
import com.ejercicoTodoCode.veterinaria.model.Mascota;
import com.ejercicoTodoCode.veterinaria.repository.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MascotaService implements IMascotaService{

    @Autowired
    IMascotaRepository mascotaRepository;

    @Override
    public List<Mascota> getMascotas() {
        return mascotaRepository.findAll();
    }

    @Override
    public void saveMascota(Mascota mascota) {
        mascotaRepository.save(mascota);

    }

    @Override
    public void deleteMascota(Long id) {
    mascotaRepository.deleteById(id);
    }

    @Override
    public void editMascota(Mascota mascota) {
    this.saveMascota(mascota);
    }

    @Override
    public Mascota findMascota(Long idMascota) {
        return mascotaRepository.findById(idMascota).orElse(null);
    }

    @Override
    public List<Mascota> getCaniches() {
        List<Mascota> listaMascotas = this.getMascotas();
        List<Mascota> listaCaniches = new ArrayList<>();

        for(Mascota masco : listaMascotas){
            if(masco.getEspecie().toLowerCase().contains("perro") == true && masco.getRaza().toLowerCase().contains("caniche") == true){
                listaCaniches.add(masco);
            }
        }

        return listaCaniches;
    }

    @Override
    public MascotaDuenoDTO getMascota(Long id) {

        MascotaDuenoDTO mascotaDuenoDTO = new MascotaDuenoDTO();
        Mascota masco = this.findMascota(id);

        mascotaDuenoDTO.setNombreMascota(masco.getNombre());
        mascotaDuenoDTO.setEspecie(masco.getEspecie());
        mascotaDuenoDTO.setRaza(masco.getRaza());
        mascotaDuenoDTO.setNombreDueno(masco.getDueno().getNombre());
        mascotaDuenoDTO.setApellidoDueno(masco.getDueno().getApellido());


        return mascotaDuenoDTO;
    }
}
