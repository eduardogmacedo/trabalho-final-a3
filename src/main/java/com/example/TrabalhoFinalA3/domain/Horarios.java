package com.example.TrabalhoFinalA3.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Horarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_horarios;

    private int oito_horas;

    private int nove_horas;

    private int dez_horas;

    private int onze_horas;

    private int treze_horas;

    private int quatorze_horas;

    private int quinze_horas;

    private int dezesseis_horas;

    private int dezessete_horas;

    public Long getId_horarios() {
        return id_horarios;
    }

    public void setId_horarios(Long id_horarios) {
        this.id_horarios = id_horarios;
    }

    public int getOito_horas() {
        return oito_horas;
    }

    public void setOito_horas(int oito_horas) {
        this.oito_horas = oito_horas;
    }

    public int getNove_horas() {
        return nove_horas;
    }

    public void setNove_horas(int nove_horas) {
        this.nove_horas = nove_horas;
    }

    public int getDez_horas() {
        return dez_horas;
    }

    public void setDez_horas(int dez_horas) {
        this.dez_horas = dez_horas;
    }

    public int getOnze_horas() {
        return onze_horas;
    }

    public void setOnze_horas(int onze_horas) {
        this.onze_horas = onze_horas;
    }

    public int getTreze_horas() {
        return treze_horas;
    }

    public void setTreze_horas(int treze_horas) {
        this.treze_horas = treze_horas;
    }

    public int getQuatorze_horas() {
        return quatorze_horas;
    }

    public void setQuatorze_horas(int quatorze_horas) {
        this.quatorze_horas = quatorze_horas;
    }

    public int getQuinze_horas() {
        return quinze_horas;
    }

    public void setQuinze_horas(int quinze_horas) {
        this.quinze_horas = quinze_horas;
    }

    public int getDezesseis_horas() {
        return dezesseis_horas;
    }

    public void setDezesseis_horas(int dezesseis_horas) {
        this.dezesseis_horas = dezesseis_horas;
    }

    public int getDezessete_horas() {
        return dezessete_horas;
    }

    public void setDezessete_horas(int dezessete_horas) {
        this.dezessete_horas = dezessete_horas;
    }
}
