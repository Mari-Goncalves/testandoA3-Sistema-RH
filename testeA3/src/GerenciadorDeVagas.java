import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeVagas {
    private static List<Vaga> listaDeVagas = new ArrayList<>();

    public static List<Vaga> getListaDeVagas() {
        return listaDeVagas;
    }

    public static void adicionarVaga(Vaga vaga) {
        listaDeVagas.add(vaga);
    }
}
