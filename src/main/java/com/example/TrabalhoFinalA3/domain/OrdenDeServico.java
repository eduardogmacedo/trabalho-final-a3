package com.example.TrabalhoFinalA3.domain;

import javax.persistence.*;

@Entity
public class OrdenDeServico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_orden_de_servico;

    private String situacao_os;

    @ManyToOne
    private Clientes clientes;

    @ManyToOne
    private Profissionais profissionais;

    public Long getId_orden_de_servico() {
        return id_orden_de_servico;
    }

    public void setId_orden_de_servico(Long id_orden_de_servico) {
        this.id_orden_de_servico = id_orden_de_servico;
    }

    public String getSituacao_os() {
        return situacao_os;
    }

    public void setSituacao_os(String situacao_os) {
        this.situacao_os = situacao_os;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public Profissionais getProfissionais() {
        return profissionais;
    }

    public void setProfissionais(Profissionais profissionais) {
        this.profissionais = profissionais;
    }
}
