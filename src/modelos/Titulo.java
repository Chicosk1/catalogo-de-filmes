package modelos;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    
    private String nome;
    private boolean incluidoNoPlano;
    private int duracaoEmMinutos, anoDeLancamento, totalDeAvaliacoes, somaDasAvaliacoes; 

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public int getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public String getNome() {
        return nome;
    }
    
    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }
    
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
    
    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void exibeFichaTecnica(){

        System.out.println("Nome do filme:" + nome);
        System.out.println("Ano de lançamento:" + anoDeLancamento);
   
    }

    public void avaliarFilme(double notaFilme) {

        somaDasAvaliacoes += notaFilme;
        totalDeAvaliacoes++;

    }

    public double retornarMediaDasAvaliacoes() {

        return somaDasAvaliacoes / totalDeAvaliacoes;
    
    }
}
