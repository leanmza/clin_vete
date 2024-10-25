package com.ejercicoTodoCode.veterinaria.controller;

import com.ejercicoTodoCode.veterinaria.model.Dueno;
import com.ejercicoTodoCode.veterinaria.service.IDuenoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DuenoController {

    @Autowired
    IDuenoService duenoService;

    @GetMapping("/dueno/traer")
    public List<Dueno> getDuenos(){
        return duenoService.getDuenos();
    }

    @PostMapping("/dueno/crear")
    public String createDuenos(@RequestBody Dueno dueno){
        duenoService.saveDueno(dueno);
        return "Dueño creado correctamente";
    }

    @DeleteMapping("/dueno/delete/{id}")
    public String deleteDueno(@PathVariable Long id){
        duenoService.deleteDueno(id);
        return "Dueño eliminado exitosamente";
    }

    @PutMapping("/dueno/editar")
    public Dueno editDueno(@RequestBody Dueno dueno){
        duenoService.editDueno(dueno);
        return duenoService.findDueno(dueno.getIdDueno());
    }
}
