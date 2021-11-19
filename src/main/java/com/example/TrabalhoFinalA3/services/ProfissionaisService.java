package com.example.TrabalhoFinalA3.services;

import com.example.TrabalhoFinalA3.domain.Profissionais;
import com.example.TrabalhoFinalA3.repository.ProfissionaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProfissionaisService {

    @Autowired
    private ProfissionaisRepository profissionaisRepository;

    @Transactional(readOnly = true)
    public Profissionais get(Long id) {
        return profissionaisRepository.get(id);
    }

    @Transactional(readOnly = true)
    public List<Profissionais> getAll() {
        return profissionaisRepository.getAll();
    }

    @Transactional
    public Profissionais save(Profissionais profissionais) {
        return profissionaisRepository.save(profissionais);
    }

    @Transactional
    public Profissionais update(Long id, Profissionais profissionais) {
        profissionais.setId_profissional(id);
        return profissionaisRepository.save(profissionais);
    }

    @Transactional
    public void remove(Long id) {
        profissionaisRepository.remove(id);
    }
}
