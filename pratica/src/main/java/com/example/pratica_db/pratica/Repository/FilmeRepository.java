package com.example.pratica_db.pratica.Repository;

import com.example.pratica_db.pratica.Enteties.Filme;

import java.util.HashSet;

public class FilmeRepository {

    private HashSet<Filme> filmes;

    public FilmeRepository() {
        this.filmes = new HashSet<Filme>();
    }
        public boolean addFilme (Filme filmes){
            return this.filmes.add(filmes);
        }

        public HashSet<Filme> getFilmes(){
            return new HashSet<Filme>(this.filmes);
        }
    }


