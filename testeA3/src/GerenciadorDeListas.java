import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeListas {
    private static List<Vaga> listaDeVagas = new ArrayList<>();
    private static List<Candidatura> listaDeCandidaturas = new ArrayList<>();

    public static List<Vaga> getListaDeVagas() {
        return listaDeVagas;
    }

    public static void adicionarVaga(Vaga vaga) {
        listaDeVagas.add(vaga);
    }

    public static List<Candidatura> getListaDeCandidaturas() {
        return listaDeCandidaturas;
    }

    public static void adicionarCandidatura(Candidatura candidatura) {
        listaDeCandidaturas.add(candidatura);
    }
}
