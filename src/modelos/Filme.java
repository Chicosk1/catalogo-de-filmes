package modelos;

import calculos.*;

public class Filme extends Titulo implements Classificavel {

    private String diretor;

    // Getters
    public String getDiretor() {
        return diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) retornarMediaDasAvaliacoes() / 2;
    }

    // Setters
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }


    // Métodos
     @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
