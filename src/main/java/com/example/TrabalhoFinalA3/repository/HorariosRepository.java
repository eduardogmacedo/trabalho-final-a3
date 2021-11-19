package com.example.TrabalhoFinalA3.repository;


import com.example.TrabalhoFinalA3.domain.Horarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HorariosRepository {

    @Autowired
    private HorariosRepositoryJPA repositoryJPA;

    public Horarios get(Long id) {
        return repositoryJPA.findById(id).orElseGet(null);
    }

    public Horarios save(Horarios horarios) {
        return repositoryJPA.save(horarios);
    }

    public void remove(Long id) {
        repositoryJPA.deleteById(id);
    }

    public List<Horarios> getAll() {
        return repositoryJPA.findAll();
    }
}
