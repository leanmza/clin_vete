package com.ejercicoTodoCode.veterinaria.controller;

import com.ejercicoTodoCode.veterinaria.dto.MascotaDuenoDTO;
import com.ejercicoTodoCode.veterinaria.model.Mascota;
import com.ejercicoTodoCode.veterinaria.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MascotaController {

    @Autowired
    IMascotaService mascotaService;

    @GetMapping("mascota/traer")
    public List<Mascota> getMascotas(){
    return mascotaService.getMascotas();
    }

    @PostMapping("/mascota/crear")
    public String createMascotas(@RequestBody Mascota mascota){
        mascotaService.saveMascota(mascota);
        return "Mascota creada correctamente";
    }

    @DeleteMapping("/mascota/delete/{id}")
    public String deleteMascota(@PathVariable Long id){
        mascotaService.deleteMascota(id);
        return "Mascota eliminada correctamente";
    }

    @PutMapping("/mascota/editar")
    public Mascota editMascota(@RequestBody Mascota mascota){
        mascotaService.editMascota(mascota);
        return mascotaService.findMascota(mascota.getIdMascota());
    }

    @GetMapping("/mascota/caniche")
    public List<Mascota> getCaniches(){
        return mascotaService.getCaniches();
    }

    @GetMapping("/mascota/get/{id}")
    public MascotaDuenoDTO getMascota(@PathVariable Long id){
        return mascotaService.getMascota(id);

    }
}
