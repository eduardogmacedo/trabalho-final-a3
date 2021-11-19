package com.example.TrabalhoFinalA3.repository;

import com.example.TrabalhoFinalA3.domain.PeriodoDisponivel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeriodoDisponivelRepositoryJPA extends JpaRepository<PeriodoDisponivel, Long> {

}
