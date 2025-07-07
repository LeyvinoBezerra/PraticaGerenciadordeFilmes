package com.example.pratica_db.pratica.Enteties;


import java.util.Objects;

public class Ator {

    private String nome;

    public Ator(String nome) {
        this.nome = nome;
    }

    public Ator(Ator i) {
    }


    public String getNome() {
        return nome;
    }

    public <Strings> void setNome(Strings nome) {
        this.nome = String.valueOf(nome);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ator ator = (Ator) o;
        return Objects.equals(nome, ator.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    @Override
    public String toString() {
        return "Ator{" +
                "nome=" + nome +
                '}';
    }
}
