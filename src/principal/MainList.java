package principal;

import modelos.*;
import calculos.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MainList {
    public static void main(String[] args) {
        
        Filme meuFilme = new Filme();
        Filme outroFilme = new Filme();
        Serie lost = new Serie();
        var filmeDoGabriel = new Filme();

        meuFilme.avaliarFilme(9);
        outroFilme.avaliarFilme(6);
        filmeDoGabriel.avaliarFilme(10);

        ArrayList<Titulo> lista = new ArrayList<>();

        lista.add(filmeDoGabriel);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        // Loop percorrendo a lista
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof  Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        List<String> buscaPorArtista = new LinkedList<>();

        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Gabriel");
        buscaPorArtista.add("Beatriz");

        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);

        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);

        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
