package com.example.TrabalhoFinalA3.repository;

import com.example.TrabalhoFinalA3.domain.Profissionais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProfissionaisRepository {

    @Autowired
    private ProfissionaisRepositoryJPA repositoryJPA;

    public Profissionais get(Long id) {
        return repositoryJPA.findById(id).orElseGet(null);
    }

    public Profissionais save(Profissionais profissionais) {
        return repositoryJPA.save(profissionais);
    }

    public void remove(Long id) {
        repositoryJPA.deleteById(id);
    }

    public List<Profissionais> getAll() {
        return repositoryJPA.findAll();
    }

}
