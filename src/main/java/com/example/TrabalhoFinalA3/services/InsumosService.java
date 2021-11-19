package com.example.TrabalhoFinalA3.services;

import com.example.TrabalhoFinalA3.domain.Insumos;
import com.example.TrabalhoFinalA3.repository.InsumosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class InsumosService {

    @Autowired
    private InsumosRepository insumosRepository;

    @Transactional(readOnly = true)
    public Insumos get(Long id) {
        return insumosRepository.get(id);
    }

    @Transactional(readOnly = true)
    public List<Insumos> getAll() {
        return insumosRepository.getAll();
    }

    @Transactional
    public Insumos save(Insumos insumos) {
        return insumosRepository.save(insumos);
    }

    @Transactional
    public Insumos update(Long id, Insumos insumos) {
        insumos.setId_insumo(id);
        return insumosRepository.save(insumos);
    }

    @Transactional
    public void remove(Long id) {
        insumosRepository.remove(id);
    }
}
