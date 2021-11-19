package com.example.TrabalhoFinalA3.domain;

import javax.persistence.*;

@Entity
public class Profissionais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_profissional;

    private String nome_profissional;

    private int cpf_profissional;

    private String telefone_profissional;

    private String email_profissional;

    private String rua_profissional;

    private int numero_profissional;

    private String bairro_profissional;

    private String cidade_profissional;

    private String estado_profissional;

    public Long getId_profissional() {
        return id_profissional;
    }

    public void setId_profissional(Long id_profissional) {
        this.id_profissional = id_profissional;
    }

    public String getNome_profissional() {
        return nome_profissional;
    }

    public void setNome_profissional(String nome_profissional) {
        this.nome_profissional = nome_profissional;
    }

    public int getCpf_profissional() {
        return cpf_profissional;
    }

    public void setCpf_profissional(int cpf_profissional) {
        this.cpf_profissional = cpf_profissional;
    }

    public String getTelefone_profissional() {
        return telefone_profissional;
    }

    public void setTelefone_profissional(String telefone_profissional) {
        this.telefone_profissional = telefone_profissional;
    }

    public String getEmail_profissional() {
        return email_profissional;
    }

    public void setEmail_profissional(String email_profissional) {
        this.email_profissional = email_profissional;
    }

    public String getRua_profissional() {
        return rua_profissional;
    }

    public void setRua_profissional(String rua_profissional) {
        this.rua_profissional = rua_profissional;
    }

    public int getNumero_profissional() {
        return numero_profissional;
    }

    public void setNumero_profissional(int numero_profissional) {
        this.numero_profissional = numero_profissional;
    }

    public String getBairro_profissional() {
        return bairro_profissional;
    }

    public void setBairro_profissional(String bairro_profissional) {
        this.bairro_profissional = bairro_profissional;
    }

    public String getCidade_profissional() {
        return cidade_profissional;
    }

    public void setCidade_profissional(String cidade_profissional) {
        this.cidade_profissional = cidade_profissional;
    }

    public String getEstado_profissional() {
        return estado_profissional;
    }

    public void setEstado_profissional(String estado_profissional) {
        this.estado_profissional = estado_profissional;
    }

}
