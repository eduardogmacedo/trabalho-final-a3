package com.example.TrabalhoFinalA3.services;

import com.example.TrabalhoFinalA3.domain.Horarios;
import com.example.TrabalhoFinalA3.repository.HorariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HorariosService {

    @Autowired
    private HorariosRepository horariosRepository;

    @Transactional(readOnly = true)
    public Horarios get(Long id) {
        return horariosRepository.get(id);
    }

    @Transactional(readOnly = true)
    public List<Horarios> getAll() {
        return horariosRepository.getAll();
    }

    @Transactional
    public Horarios save(Horarios horarios) {
        return horariosRepository.save(horarios);
    }

    @Transactional
    public Horarios update(Long id, Horarios horarios) {
        horarios.setId_horarios(id);
        return horariosRepository.save(horarios);
    }

    @Transactional
    public void remove(Long id) {
        horariosRepository.remove(id);
    }
}
