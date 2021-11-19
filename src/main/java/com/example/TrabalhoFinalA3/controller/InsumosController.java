package com.example.TrabalhoFinalA3.controller;

import com.example.TrabalhoFinalA3.domain.Insumos;
import com.example.TrabalhoFinalA3.services.InsumosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/insumos")
public class InsumosController {

    @Autowired
    private InsumosService service;

    @PostMapping
    public @ResponseBody
    Insumos create(@RequestBody Insumos insumos){
        insumos = service.save(insumos);
        return insumos;
    }

    @GetMapping
    public @ResponseBody
    List<Insumos> getAll() {
        List<Insumos> insumoss = service.getAll();
        return insumoss;
    }

    @GetMapping(value = "/{id}")
    public @ResponseBody
    Insumos get(@PathVariable(name="id") Long id) {
        Insumos insumos = service.get(id);
        return insumos;
    }

    @PutMapping(value = "/{id}")
    public @ResponseBody Insumos update
            (@PathVariable(name = "id") Long id,
             @RequestBody Insumos insumos) {
        Insumos in = service.update(id, insumos);
        return in;
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        service.remove(id);
    }
}
