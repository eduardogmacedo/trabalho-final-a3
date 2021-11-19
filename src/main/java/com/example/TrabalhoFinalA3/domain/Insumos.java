package com.example.TrabalhoFinalA3.domain;

import javax.persistence.*;

@Entity
public class Insumos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_insumo;

    private String nome_insumo;

    @ManyToOne
    private Servicos servicos;

    public Long getId_insumo() {
        return id_insumo;
    }

    public void setId_insumo(Long id_insumo) {
        this.id_insumo = id_insumo;
    }

    public String getNome_insumo() {
        return nome_insumo;
    }

    public void setNome_insumo(String nome_insumo) {
        this.nome_insumo = nome_insumo;
    }

    public Servicos getServicos() {
        return servicos;
    }

    public void setServicos(Servicos servicos) {
        this.servicos = servicos;
    }
}
