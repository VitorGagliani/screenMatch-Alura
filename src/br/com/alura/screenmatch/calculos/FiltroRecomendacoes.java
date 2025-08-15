package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacoes {
    private String recomendacao;

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Está entre os preferidos");
        }else if (classificavel.getClassificacao() >= 2){
            System.out.println("Está muito avaliado");
        }else {
            System.out.println("Não deixe fora da sua lista");
        }
    }
}
