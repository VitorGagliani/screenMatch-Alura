package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Titulo;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca  {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do filme ");
        var busca = scanner.nextLine();
        String endereco = "http://www.omdbapi.com/?t="+busca+"&apikey=4a56fd2";
        String endConcad = endereco.replaceAll(" ", "+");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endConcad))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
       // System.out.println(json);

        Gson gson = new Gson();
        Titulo titulo = gson.fromJson(json, Titulo.class);
        System.out.println(titulo);
    }

    
}
