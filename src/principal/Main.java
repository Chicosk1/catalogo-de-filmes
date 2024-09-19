package principal;

import modelos.*;
import calculos.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        Filme meuFilme = new Filme();

        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();

        meuFilme.avaliarFilme(8);
        meuFilme.avaliarFilme(5);
        meuFilme.avaliarFilme(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());

        System.out.println(meuFilme.retornarMediaDasAvaliacoes());

        Serie minhaSerie = new Serie();

        minhaSerie.setNome("Lost");
        minhaSerie.setAnoDeLancamento(2000);
        minhaSerie.exibeFichaTecnica();
        minhaSerie.setTemporadas(10);
        minhaSerie.setEpisodiosPorTemporada(10);
        minhaSerie.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + minhaSerie.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();

        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.incluirTitulo(meuFilme);
        calculadora.incluirTitulo(outroFilme);
        calculadora.incluirTitulo(minhaSerie);

        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        filtro.filtrarFilme(meuFilme);

        Episodio episodio = new Episodio();
        
        episodio.setNumero(1);
        episodio.setSerie(minhaSerie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtrarFilme(episodio);
    }
}
