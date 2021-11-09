package com.projetosic.projetoapisic.model;

@Entit
public class Pauta {

    private int Id;
    private String Nome;

    //Get e Set
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }
}
