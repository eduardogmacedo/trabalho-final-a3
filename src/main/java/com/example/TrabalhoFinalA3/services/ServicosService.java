package com.example.TrabalhoFinalA3.services;

import com.example.TrabalhoFinalA3.domain.Servicos;
import com.example.TrabalhoFinalA3.repository.ServicosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ServicosService {

    @Autowired
    private ServicosRepository servicosRepository;

    @Transactional(readOnly = true)
    public Servicos get(Long id) {
        return servicosRepository.get(id);
    }

    @Transactional(readOnly = true)
    public List<Servicos> getAll() {
        return servicosRepository.getAll();
    }

    @Transactional
    public Servicos save(Servicos insumos) {
        return servicosRepository.save(insumos);
    }

    @Transactional
    public Servicos update(Long id, Servicos servicos) {
        servicos.setId_servico(id);
        return servicosRepository.save(servicos);
    }

    @Transactional
    public void remove(Long id) {
        servicosRepository.remove(id);
    }
}
