package com.example.TrabalhoFinalA3.domain;

import javax.persistence.*;

@Entity
public class Servicos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_servico;

    private String nome_servico;

    @ManyToOne
    private Profissionais profissionais;

    public Long getId_servico() {
        return id_servico;
    }

    public void setId_servico(Long id_servico) {
        this.id_servico = id_servico;
    }

    public String getNome_servico() {
        return nome_servico;
    }

    public void setNome_servico(String nome_servico) {
        this.nome_servico = nome_servico;
    }

    public Profissionais getProfissionais() {
        return profissionais;
    }

    public void setProfissionais(Profissionais profissionais) {
        this.profissionais = profissionais;
    }
}
