package com.example.TrabalhoFinalA3.repository;

import com.example.TrabalhoFinalA3.domain.Profissionais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfissionaisRepositoryJPA extends JpaRepository<Profissionais, Long> {

}
