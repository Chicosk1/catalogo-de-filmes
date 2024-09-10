package modelos;

import calculos.*;

public class Episodio implements Classificavel {
    private String nome;
    private Serie serie;
    private int numero, totalVisualizacoes;

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public String getNome() {
        return nome;
    }
    
    public Serie getSerie() {
        return serie;
    }
    
    @Override
    public int getClassificacao() {
        if (totalVisualizacoes > 100) {
            return 4;
        } else {
            return 2;
        }
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

}