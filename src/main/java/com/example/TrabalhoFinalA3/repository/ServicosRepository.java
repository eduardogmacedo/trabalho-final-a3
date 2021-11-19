package com.example.TrabalhoFinalA3.repository;

import com.example.TrabalhoFinalA3.domain.Profissionais;
import com.example.TrabalhoFinalA3.domain.Servicos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ServicosRepository {

    @Autowired
    private ServicosRepositoryJPA repositoryJPA;

    public Servicos get(Long id) {
        return repositoryJPA.findById(id).orElseGet(null);
    }

    public Servicos save(Servicos servicos) {
        return repositoryJPA.save(servicos);
    }

    public void remove(Long id) {
        repositoryJPA.deleteById(id);
    }

    public List<Servicos> getAll() {
        return repositoryJPA.findAll();
    }

    public List<Profissionais> find(Profissionais profissionais){
        return repositoryJPA.findByProfissionais(profissionais);
    }
}
