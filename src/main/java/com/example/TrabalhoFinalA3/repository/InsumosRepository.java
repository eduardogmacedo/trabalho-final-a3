package com.example.TrabalhoFinalA3.repository;

import com.example.TrabalhoFinalA3.domain.Insumos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InsumosRepository {

    @Autowired
    private InsumosRepositoryJPA repositoryJPA;

    public Insumos get(Long id) {
        return repositoryJPA.findById(id).orElseGet(null);
    }

    public Insumos save(Insumos insumos) {
        return repositoryJPA.save(insumos);
    }

    public void remove(Long id) {
        repositoryJPA.deleteById(id);
    }

    public List<Insumos> getAll() {
        return repositoryJPA.findAll();
    }
}
