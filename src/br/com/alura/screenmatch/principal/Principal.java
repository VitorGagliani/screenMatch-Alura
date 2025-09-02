package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalcularodaDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacoes;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1970, 180);
        System.out.println(meuFilme.getNome());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(5);

        //System.out.println(meuFilme.somaDasAvalicoes);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie(2000, "Lost", 10, 20);
        lost.setMinutosPorEpisodio(50);
        lost.exibeFichaTecnica();
        System.out.println("Duração para maratonar: "+lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2023, 200);

        CalcularodaDeTempo calculadora = new CalcularodaDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);

        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacoes filtro = new FiltroRecomendacoes();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        Filme filmeDoVitor = new Filme("Vitor",2005,200);


        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoVitor);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(meuFilme);
        System.out.println("Total de filmes na lista: " + listaDeFilmes.size());

        Filme novoFilme = new Filme("Filme do Vitor 2.0", 2025,190);

        System.out.println(listaDeFilmes);

    }
}
