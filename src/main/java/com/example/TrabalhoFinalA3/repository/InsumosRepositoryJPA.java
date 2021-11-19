package com.example.TrabalhoFinalA3.repository;

import com.example.TrabalhoFinalA3.domain.Insumos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsumosRepositoryJPA extends JpaRepository<Insumos, Long> {

}
