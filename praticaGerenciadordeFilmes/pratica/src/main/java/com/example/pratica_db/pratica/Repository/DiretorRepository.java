package com.example.pratica_db.pratica.Repository;

import com.example.pratica_db.pratica.Enteties.Diretor;
import org.apache.logging.log4j.util.Strings;

import java.util.HashSet;
import java.util.Iterator;

public class DiretorRepository {
    private HashSet<Diretor> diretores;

    public DiretorRepository() {
        this.diretores = new HashSet<Diretor>();
    }
    public boolean addDiretor(Diretor diretor) {
        return this.diretores.add(diretor);
    }

    public HashSet<Diretor> getDiretores() {
        return new HashSet<Diretor>(diretores);
    }
    public Diretor getDiretor(Strings nome) {
            Diretor diretor = null;

            Iterator<Diretor> iterator = diretores.iterator();

            for(Diretor d = null; iterator.hasNext(); d = iterator.next()) {

                if(d.getNome().equals(nome)) {
                    diretor = new Diretor(d);
                    break;
                }

            }

            return diretor;
        }

    }




