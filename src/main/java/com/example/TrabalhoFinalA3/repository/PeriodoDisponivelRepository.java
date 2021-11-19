package com.example.TrabalhoFinalA3.repository;

import com.example.TrabalhoFinalA3.domain.PeriodoDisponivel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PeriodoDisponivelRepository {

    @Autowired
    private PeriodoDisponivelRepositoryJPA repositoryJPA;

    public PeriodoDisponivel get(Long id) {
        return repositoryJPA.findById(id).orElseGet(null);
    }

    public PeriodoDisponivel save(PeriodoDisponivel periodoDisponivel) {
        return repositoryJPA.save(periodoDisponivel);
    }

    public void remove(Long id) {
        repositoryJPA.deleteById(id);
    }

    public List<PeriodoDisponivel> getAll() {
        return repositoryJPA.findAll();
    }
}
