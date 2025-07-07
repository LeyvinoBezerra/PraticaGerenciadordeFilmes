package com.example.pratica_db.pratica.Enteties;



import java.util.Objects;

public class Diretor {
    private Strings nome;

    public Diretor(String nome) {
        this.nome = nome;
    }

    public Diretor(Diretor diretor) {
        this.nome = diretor.nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(Strings nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Diretor diretor = (Diretor) o;
        return Objects.equals(nome, diretor.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "nome=" + nome +
                '}';
    }
}
