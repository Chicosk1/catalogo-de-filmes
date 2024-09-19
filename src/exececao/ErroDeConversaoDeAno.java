package exececao;

public class ErroDeConversaoDeAno extends RuntimeException {
    
    private String mensagem;

    // Getters
    public ErroDeConversaoDeAno(String mensagem) {
        this.mensagem = mensagem;
    }

    // Setters
    @Override
    public String getMessage() {
        return this.mensagem;
    }
}