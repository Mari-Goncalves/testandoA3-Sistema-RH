import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Recrutador {
    private String cargo;
    private String empresa;
    private List<Vaga> listaDeVagas = new ArrayList<>(); // Lista para armazenar as vagas criadas

    Scanner sc = new Scanner(System.in);
    Atalhos atalhos = new Atalhos();
    int opcaoMenuRecrutador;

    public Recrutador() {
        atalhos.EscreverMensagem("Olá recrutador(a)! Você deseja: \n");
        atalhos.PularLinha();
        ExibirMenuRecrutador();
    }

    public void ExibirOpcoesMenuRecrutador() {
        atalhos.LinhaTracejada();
        atalhos.PularLinha();

        atalhos.EscreverMensagem("1-Criar vaga\n");
        atalhos.EscreverMensagem("2-Visualizar vagas\n");
        atalhos.EscreverMensagem("3-Atualizar vagas\n");

        atalhos.PularLinha();
    }

    public void ValidarOpcaoMenuRecrutador() {
        atalhos.EscreverMensagem("Escolha uma opção: ");
        opcaoMenuRecrutador = sc.nextInt();
        sc.nextLine(); // Consome a nova linha deixada pelo nextInt()

        atalhos.PularLinha();
        atalhos.LinhaTracejada();

        switch (opcaoMenuRecrutador) {
            case 1:
                atalhos.EscreverMensagem("Opção 1 | Criar vaga\n");
                Vaga novaVaga = new Vaga();
                novaVaga.CriarVaga();
                listaDeVagas.add(novaVaga); // Adiciona a nova vaga à lista
                ExibirMenuRecrutador();
                break;

            case 2:
                atalhos.EscreverMensagem("Opção 2 | Visualizar vagas\n");
                if (listaDeVagas.isEmpty()) {
                    atalhos.EscreverMensagem("Não há vagas criadas no momento. \n");
                } else {
                    for (Vaga vaga : listaDeVagas) {
                        vaga.VisualizarVaga();
                    }
                }
                ExibirMenuRecrutador();
                break;

            case 3:
                atalhos.EscreverMensagem("Opção 3 | Atualizar vaga\n");
                if (listaDeVagas.isEmpty()) {
                    atalhos.EscreverMensagem("Não há vagas criadas no momento. \n");
                } else {
                    // Você pode adicionar lógica aqui para atualizar uma vaga específica
                    // Por exemplo, pedir ao usuário para selecionar uma vaga e então atualizar essa
                    // vaga
                }
                ExibirMenuRecrutador();
                break;

            default:
                atalhos.EscreverMensagem("Valor inválido! Tente novamente. \n");
                ExibirMenuRecrutador();
                break;
        }
    }

    public void ExibirMenuRecrutador() {
        ExibirOpcoesMenuRecrutador();
        ValidarOpcaoMenuRecrutador();
    }
}
