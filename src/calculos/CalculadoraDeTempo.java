package calculos;

import modelos.*;

public class CalculadoraDeTempo {
    
    private int tempoTotal;

    // Getters
    public int getTempoTotal() {
        return this.tempoTotal;
    }

    // Metodos
    public void incluirTitulo(Titulo titulo) {
        System.out.println("Adicionando duração em minutos de " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
