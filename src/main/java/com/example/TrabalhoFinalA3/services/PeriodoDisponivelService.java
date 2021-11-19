package com.example.TrabalhoFinalA3.services;

import com.example.TrabalhoFinalA3.domain.PeriodoDisponivel;
import com.example.TrabalhoFinalA3.repository.PeriodoDisponivelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PeriodoDisponivelService {

    @Autowired
    private PeriodoDisponivelRepository periodoDisponivelRepository;

    @Transactional(readOnly = true)
    public PeriodoDisponivel get(Long id) {
        return periodoDisponivelRepository.get(id);
    }

    @Transactional(readOnly = true)
    public List<PeriodoDisponivel> getAll() {
        return periodoDisponivelRepository.getAll();
    }

    @Transactional
    public PeriodoDisponivel save(PeriodoDisponivel periodoDisponivel) {
        return periodoDisponivelRepository.save(periodoDisponivel);
    }

    @Transactional
    public PeriodoDisponivel update(Long id, PeriodoDisponivel periodoDisponivel) {
        periodoDisponivel.setId_periodo_disponivel(id);
        return periodoDisponivelRepository.save(periodoDisponivel);
    }

    @Transactional
    public void remove(Long id) {
        periodoDisponivelRepository.remove(id);
    }
}
