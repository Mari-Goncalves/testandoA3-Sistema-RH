import java.util.List;
import java.util.Scanner;

public class Recrutador {
    private String cargo;
    private String empresa;
    private List<Vaga> listaDeVagas = GerenciadorDeVagas.getListaDeVagas();

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
        atalhos.EscreverMensagem("4-Voltar ao menu inicial\n");

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
                GerenciadorDeVagas.adicionarVaga(novaVaga); // Adiciona a nova vaga ao GerenciadorDeVagas
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
                    AtualizarVaga();
                }
                ExibirMenuRecrutador();
                break;

            case 4:
                atalhos.Iniciar();
                break;

            default:
                atalhos.EscreverMensagem("Valor inválido! Tente novamente. \n");
                ExibirMenuRecrutador();
                break;
        }
    }

    public void AtualizarVaga() {
        atalhos.EscreverMensagem("Digite o ID da vaga que deseja atualizar: ");
        int idVaga = sc.nextInt();
        sc.nextLine(); // Consome a nova linha deixada pelo nextInt()

        for (Vaga vaga : listaDeVagas) {
            if (vaga.getId() == idVaga) {
                vaga.AtualizarVaga();
                return;
            }
        }
        atalhos.EscreverMensagem("Vaga com ID " + idVaga + " não encontrada. \n");
    }

    public void ExibirMenuRecrutador() {
        ExibirOpcoesMenuRecrutador();
        ValidarOpcaoMenuRecrutador();
    }
}
