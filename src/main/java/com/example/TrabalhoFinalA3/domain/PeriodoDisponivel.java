package com.example.TrabalhoFinalA3.domain;

import javax.persistence.*;

@Entity
public class PeriodoDisponivel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_periodo_disponivel;

    private int dia_mes_ano;

    @OneToOne
    private Horarios horarios;

    @ManyToOne
    private Servicos servicos;

    @ManyToOne
    private Profissionais profissionais;

    public Long getId_periodo_disponivel() {
        return id_periodo_disponivel;
    }

    public void setId_periodo_disponivel(Long id_periodo_disponivel) {
        this.id_periodo_disponivel = id_periodo_disponivel;
    }

    public int getDia_mes_ano() {
        return dia_mes_ano;
    }

    public void setDia_mes_ano(int dia_mes_ano) {
        this.dia_mes_ano = dia_mes_ano;
    }

    public Horarios getHorarios() {
        return horarios;
    }

    public void setHorarios(Horarios horarios) {
        this.horarios = horarios;
    }

    public Servicos getServicos() {
        return servicos;
    }

    public void setServicos(Servicos servicos) {
        this.servicos = servicos;
    }

    public Profissionais getProfissionais() {
        return profissionais;
    }

    public void setProfissionais(Profissionais profissionais) {
        this.profissionais = profissionais;
    }
}
