package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1970, 180);
        Filme outroFilme = new Filme("Avatar", 2023, 200);
        Filme filmeDoVitor = new Filme("Vitor",2005,200);
        Serie lost = new Serie(2000, "Lost", 10, 20);

        //Lista de filmes
        ArrayList<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add(filmeDoVitor);
        filmeDoVitor.avalia(10);
        listaDeAssistidos.add(outroFilme);
        outroFilme.avalia(8);
        listaDeAssistidos.add(meuFilme);
        meuFilme.avalia(3);
        listaDeAssistidos.add(lost);
        lost.avalia(9);

        //for each
        for(Titulo titulo : listaDeAssistidos) {
            System.out.println("Nome: "+titulo.getNome());
            //filtra se titulo for uma instancia de filme
            if(titulo instanceof Filme filme){
                System.out.println(filme.getClassificacao());
            }
        }

        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Vitor");
        buscaPorArtista.add("Giulia");
        buscaPorArtista.add("Gagliani");
        buscaPorArtista.add("Souza");
        System.out.println(buscaPorArtista);

        //Ordena a lista por ordem alfabética
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        System.out.println("Lista de filmes assistidos ordenada: \n");
        Collections.sort(listaDeAssistidos);
        System.out.println(listaDeAssistidos);


        //como adicionamos o compareTo no titulo, podemos usar o sort e escolher pelo o que vamos ordenar
        listaDeAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(listaDeAssistidos);
    }
}
