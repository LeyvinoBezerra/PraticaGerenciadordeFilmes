package com.example.pratica_db.pratica.Enteties;

import org.apache.logging.log4j.util.Strings;

import java.util.Objects;

public class Ator {

    private Strings nome;

    public Ator(String nome) {
        this.nome = nome;
    }
    public Ator(Ator ator) {
        this.nome = ator.nome;
    }

    public Strings getNome() {
        return nome;
    }

    public void setNome(Strings nome) {
        this.nome = nome;
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
