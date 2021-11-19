package com.example.TrabalhoFinalA3.controller;

import com.example.TrabalhoFinalA3.domain.Horarios;
import com.example.TrabalhoFinalA3.services.HorariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/horarios")
public class HorariosController {

    @Autowired
    private HorariosService service;

    @PostMapping
    public @ResponseBody
    Horarios create(@RequestBody Horarios horarios){
        horarios = service.save(horarios);
        return horarios;
    }

    @GetMapping
    public @ResponseBody
    List<Horarios> getAll() {
        List<Horarios> horarioss = service.getAll();
        return horarioss;
    }

    @GetMapping(value = "/{id}")
    public @ResponseBody
    Horarios get(@PathVariable(name="id") Long id) {
        Horarios horarios = service.get(id);
        return horarios;
    }

    @PutMapping(value = "/{id}")
    public @ResponseBody Horarios update
            (@PathVariable(name = "id") Long id,
             @RequestBody Horarios horarios) {
        Horarios hr = service.update(id, horarios);
        return hr;
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        service.remove(id);
    }
}
