package modelos;

public class Serie extends Titulo {
    
    private boolean ativa;
    private int temporadas, episodiosPorTemporada, minutosPorEpisodio;
    
    // Getters
    public int getTemporadas() {
        return temporadas;
    }
    public boolean isAtiva() {
        return ativa;
    }
    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }
    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }
    
    // Setters
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }
    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

}
