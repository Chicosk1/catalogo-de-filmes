public class Main {
    public static void main(String[] args) throws Exception {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O Poderoso Chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibeFichaTecnica();

        meuFilme.avaliarFilme(8);
        meuFilme.avaliarFilme(9);
        meuFilme.avaliarFilme(10);
        
        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.retornarMediaDasAvaliacoes());

    }
}
