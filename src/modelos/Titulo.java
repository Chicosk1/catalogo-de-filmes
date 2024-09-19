package modelos;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {

    private String nome;
    private boolean incluidoNoPlano;
    private int duracaoEmMinutos, anoDeLancamento, totalDeAvaliacoes, somaDasAvaliacoes;

    // Construtor
    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    // Conversor de JSON para váriaveis
    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();

        if(meuTituloOmdb.year().length() > 4) {
            throw new ErroDeConversaoDeAnoException("Não consegui converter o ano " +
                    "porque tem mais de 04 caracteres.");
        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0, 2));
    }

    // Getters
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

    // Setters
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

    // Métodos
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

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "(nome = " + nome +
                ", anoDeLancamento = " + anoDeLancamento + "," +
                " duração = " + duracaoEmMinutos + ")";
    }
}
