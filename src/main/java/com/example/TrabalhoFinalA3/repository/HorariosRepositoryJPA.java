package com.example.TrabalhoFinalA3.repository;

import com.example.TrabalhoFinalA3.domain.Horarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HorariosRepositoryJPA extends JpaRepository<Horarios, Long> {

}
