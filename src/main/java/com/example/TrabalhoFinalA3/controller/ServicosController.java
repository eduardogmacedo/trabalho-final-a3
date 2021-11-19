package com.example.TrabalhoFinalA3.controller;

import com.example.TrabalhoFinalA3.domain.Servicos;
import com.example.TrabalhoFinalA3.services.ServicosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servicos")
public class ServicosController {

    @Autowired
    private ServicosService service;

    @PostMapping
    public @ResponseBody
    Servicos create(@RequestBody Servicos servicos){
        servicos = service.save(servicos);
        return servicos;
    }

    @GetMapping
    public @ResponseBody
    List<Servicos> getAll() {
        List<Servicos> servicoss = service.getAll();
        return servicoss;
    }

    @GetMapping(value = "/{id}")
    public @ResponseBody
    Servicos get(@PathVariable(name="id") Long id) {
        Servicos servicos = service.get(id);
        return servicos;
    }

    @PutMapping(value = "/{id}")
    public @ResponseBody Servicos update
            (@PathVariable(name = "id") Long id,
             @RequestBody Servicos servicos) {
        Servicos sv = service.update(id, servicos);
        return sv;
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        service.remove(id);
    }
}
