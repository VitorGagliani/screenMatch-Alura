public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvalicoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;


    void exibeFichaTecnica(){
        System.out.println("Nome do filme: "+nome);
        System.out.println("Ano de lançamento: "+ anoDeLancamento);

    }

    void avalia(double nota){
        somaDasAvalicoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
        return somaDasAvalicoes/totalDeAvaliacoes;
    }
}

