package com.example.TrabalhoFinalA3.controller;

import com.example.TrabalhoFinalA3.domain.PeriodoDisponivel;
import com.example.TrabalhoFinalA3.services.PeriodoDisponivelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/periododisponivel")
public class PeriodoDisponivelController {

    @Autowired
    private PeriodoDisponivelService service;

    @PostMapping
    public @ResponseBody
    PeriodoDisponivel create(@RequestBody PeriodoDisponivel periodoDisponivel){
        periodoDisponivel = service.save(periodoDisponivel);
        return periodoDisponivel;
    }

    @GetMapping
    public @ResponseBody
    List<PeriodoDisponivel> getAll() {
        List<PeriodoDisponivel> periodoDisponiveis = service.getAll();
        return periodoDisponiveis;
    }

    @GetMapping(value = "/{id}")
    public @ResponseBody
    PeriodoDisponivel get(@PathVariable(name="id") Long id) {
        PeriodoDisponivel periodoDisponivel = service.get(id);
        return periodoDisponivel;
    }

    @PutMapping(value = "/{id}")
    public @ResponseBody PeriodoDisponivel update
            (@PathVariable(name = "id") Long id,
             @RequestBody PeriodoDisponivel periodoDisponivel) {
        PeriodoDisponivel pd = service.update(id, periodoDisponivel);
        return pd;
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        service.remove(id);
    }
}
