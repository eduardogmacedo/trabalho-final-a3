package com.example.TrabalhoFinalA3.controller;

import com.example.TrabalhoFinalA3.domain.Profissionais;
import com.example.TrabalhoFinalA3.services.ProfissionaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profissionais")
public class ProfissionaisController {

    @Autowired
    private ProfissionaisService service;

    @PostMapping
    public @ResponseBody
    Profissionais create(@RequestBody Profissionais profissionais){
        profissionais = service.save(profissionais);
        return profissionais;
    }

    @GetMapping
    public @ResponseBody
    List<Profissionais> getAll() {
        List<Profissionais> profissionaiss = service.getAll();
        return profissionaiss;
    }

    @GetMapping(value = "/{id}")
    public @ResponseBody
    Profissionais get(@PathVariable(name="id") Long id) {
        Profissionais profissionais = service.get(id);
        return profissionais;
    }

    @PutMapping(value = "/{id}")
    public @ResponseBody Profissionais update
            (@PathVariable(name = "id") Long id,
             @RequestBody Profissionais profissionais) {
        Profissionais pr = service.update(id, profissionais);
        return pr;
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        service.remove(id);
    }
}
