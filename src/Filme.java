public class Filme {
    
    String nome;
    boolean incluidoNoPlano;
    int totalDeAvaliacoes, duracaoEmMinutos, anoDeLancamento, somaDasAvaliacoes; 

    void exibeFichaTecnica(){

        System.out.println("Nome do filme:" + nome);
        System.out.println("Ano de lançamento:" + anoDeLancamento);
   
    }

    void avaliarFilme(double notaFilme) {

        somaDasAvaliacoes += notaFilme;
        totalDeAvaliacoes++;

    }

    double retornarMediaDasAvaliacoes() {

        return somaDasAvaliacoes / totalDeAvaliacoes;
    
    }

}