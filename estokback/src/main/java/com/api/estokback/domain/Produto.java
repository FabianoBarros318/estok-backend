package com.api.estokback.domain;

import java.time.LocalDate;

public class Produto {
    private String nomeProduto;
    private Integer codigo;
    private LocalDate prazadoDeValidade = LocalDate.now();
    private String descrição;
    private Integer peso;
    private Interger medida;
    private Interger grupo;

    public Produto() {
        super();
    }

    public Produto(String nomeProduto, Integer codigo, LocalDate prazadoDeValidade, String descrição, Integer peso, Interger medida, Interger grupo) {
        this.nomeProduto = nomeProduto;
        this.codigo = codigo;
        this.prazadoDeValidade = prazadoDeValidade;
        this.descrição = descrição;
        this.peso = peso;
        this.medida = medida;
        this.grupo = grupo;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public LocalDate getPrazadoDeValidade() {
        return prazadoDeValidade;
    }

    public void setPrazadoDeValidade(LocalDate prazadoDeValidade) {
        this.prazadoDeValidade = prazadoDeValidade;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Interger getMedida() {
        return medida;
    }

    public void setMedida(Interger medida) {
        this.medida = medida;
    }

    public Interger getGrupo() {
        return grupo;
    }

    public void setGrupo(Interger grupo) {
        this.grupo = grupo;
    }
}





