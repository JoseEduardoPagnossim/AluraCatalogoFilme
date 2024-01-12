package br.com.alura.screenmatch.modelos;

public class Titulo {

    private String nome;
    private int anoLancamento;
    private boolean incluidoNoPlano;
    private double somaDasNotas;
    private int totalNotasEnviadas;
    private int duracaoEmMinutos;


    //Conhecido como método acessor serve para acessar informações que estão como private, apenas para serem lidas e não alteradas

    public int getTotalNotasEnviadas(){
        return totalNotasEnviadas;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Titulo do titulo: " + nome);
        System.out.println("Ano de lancamento: " + anoLancamento);
        System.out.println("Duracao: " + duracaoEmMinutos);
    }

    public void avalie(double nota){
        somaDasNotas += nota;
        totalNotasEnviadas++;
    }

    public double media(){
        return somaDasNotas / totalNotasEnviadas;

    }
}
