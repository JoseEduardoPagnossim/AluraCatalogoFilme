import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();

        meuFilme.setNome("Meu cunhado e um vampiro");
        meuFilme.setAnoLancamento(2023);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();

        meuFilme.avalie(8);
        meuFilme.avalie(10);
        meuFilme.avalie(5);
        //System.out.println(meuFilme.somaDasNotas); => disrespeito a encapsulamento, a partir do momento que deixo este atributo como private ele não pode ser lido nem sobrescrito.
        System.out.println("Total de pessoas que avaliaram: " + meuFilme.getTotalNotasEnviadas());
        System.out.printf("Media deste filme e: %.2f ", meuFilme.media());

        Serie serie1 = new Serie();

    }
}
