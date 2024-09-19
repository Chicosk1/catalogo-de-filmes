package principal;

import exececao.*;
import calculos.*;
import modelos.*;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.GsonBuilder;
import com.google.gson.Gson;

import java.net.http.HttpResponse;
import java.net.http.HttpRequest;
import java.net.http.HttpClient;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.net.URI;

public class MainSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        
        List<Titulo> titulos = new ArrayList<>();
        Scanner leitura = new Scanner(System.in);

        String busca = "";


        while (!busca.equalsIgnoreCase("sair")){

            System.out.println("Digite um filme para busca: ");
            var busca = leitura.nextLine();

            if(busca.equalsIgnoraCase("sair")){
                break;
            }

            String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=4b0eae4e";

            try {

                HttpClient  client  = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);

                Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();

                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmdb);

                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println("Titulo já convertido: ");
                System.out.println(meuTitulo);

                titulos.add(meuTitulo);

            } catch (NumberFormatException e) {

                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());

            } catch (IllegalArgumentException e) {

                System.out.println("Algum erro de argumento na busca, verifique o endereço");

            } catch (ErroDeConversaoDeAnoException e) {

                System.out.println(e.getMessage());

            }
        }

        System.out.println(titulos)

        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close()

        System.out.println("O programa finalizou corretamente!");

    }
}
