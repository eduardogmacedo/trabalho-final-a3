package com.example.TrabalhoFinalA3.repository;

import com.example.TrabalhoFinalA3.domain.Profissionais;
import com.example.TrabalhoFinalA3.domain.Servicos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServicosRepositoryJPA extends JpaRepository<Servicos, Long> {

    public List<Profissionais> findByProfissionais(Profissionais profissionais);
}
