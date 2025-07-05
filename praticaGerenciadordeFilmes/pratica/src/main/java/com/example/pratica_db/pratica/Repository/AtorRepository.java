package com.example.pratica_db.pratica.Repository;

import com.example.pratica_db.pratica.Enteties.Ator;

import java.util.HashSet;
import java.util.Iterator;

public class AtorRepository {

    private HashSet<Ator> atores;
    public AtorRepository() {
        this.atores = new HashSet<Ator>();
    }
    public HashSet<Ator> getAtores() {
        return new HashSet<Ator>(this.atores);
    }
    public boolean addAtor(Ator ator) {
        return this.atores.add(ator);
    }
    public Ator getAtor(String nomes) {
        Ator a = null;
        Iterator<Ator> ator = atores.iterator();
        for (Ator i = null; ator.hasNext(); i = ator.next()) {
            if (i.getNome().equals(nomes)) {
                a = new Ator(i);
                break;
            }
        }
        return a;
    }
}
