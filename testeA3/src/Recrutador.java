import java.util.List;
import java.util.Scanner;

public class Recrutador implements IMenus {
    private String cargo;
    private String empresa;
    private List<Vaga> listaDeVagas = GerenciadorDeListas.getListaDeVagas();

    Scanner sc = new Scanner(System.in);
    Atalhos atalhos = new Atalhos();
    int opcaoMenuRecrutador;

    public Recrutador() {
        atalhos.escreverMensagem("Olá recrutador(a)! Você deseja: \n");
        atalhos.pularLinha();
        exibirMenu();
    }

    public void exibirOpcoesMenu() {
        atalhos.linhaTracejada();
        atalhos.pularLinha();

        atalhos.escreverMensagem("1-Criar vaga\n");
        atalhos.escreverMensagem("2-Visualizar vagas\n");
        atalhos.escreverMensagem("3-Atualizar vagas\n");
        atalhos.escreverMensagem("4-Deletar vagas\n");
        atalhos.escreverMensagem("5-Voltar ao menu inicial\n");

        atalhos.pularLinha();
    }

    public void validarOpcaoMenu() {
        atalhos.escreverMensagem("Escolha uma opção: ");
        opcaoMenuRecrutador = sc.nextInt();
        sc.nextLine(); // Consome a nova linha deixada pelo nextInt()

        atalhos.pularLinha();
        atalhos.linhaTracejada();

        switch (opcaoMenuRecrutador) {
            case 1:
                atalhos.escreverMensagem("Opção 1 | Criar vaga\n");
                Vaga novaVaga = new Vaga();
                novaVaga.criar();
                GerenciadorDeListas.adicionarVaga(novaVaga); // Adiciona a nova vaga ao GerenciadorDeListas
                exibirMenu();
                break;

            case 2:
                atalhos.escreverMensagem("Opção 2 | Visualizar vagas\n");
                if (listaDeVagas.isEmpty()) {
                    atalhos.escreverMensagem("Não há vagas criadas no momento. \n");
                } else {
                    for (Vaga vaga : listaDeVagas) {
                        vaga.visualizar();
                    }
                }
                exibirMenu();
                break;

            case 3:
                atalhos.escreverMensagem("Opção 3 | Atualizar vaga\n");
                if (listaDeVagas.isEmpty()) {
                    atalhos.escreverMensagem("Não há vagas criadas no momento. \n");
                } else {
                    atualizarVaga();
                }
                exibirMenu();
                break;

            case 4:
                atalhos.escreverMensagem("Opção 4 | Deletar vaga\n");
                if (listaDeVagas.isEmpty()) {
                    atalhos.escreverMensagem("Não há vagas criadas no momento. \n");
                } else {
                    deletarVaga();
                }
                exibirMenu();
                break;

            case 5:
                atalhos.iniciar();
                break;

            default:
                atalhos.escreverMensagem("Valor inválido! Tente novamente. \n");
                exibirMenu();
                break;
        }
    }

    public void atualizarVaga() {
        atalhos.escreverMensagem("Digite o ID da vaga que deseja atualizar: ");
        int idVaga = sc.nextInt();
        sc.nextLine(); // Consome a nova linha deixada pelo nextInt()

        for (Vaga vaga : listaDeVagas) {
            if (vaga.getId() == idVaga) {
                vaga.atualizar();
                return;
            }
        }
        atalhos.escreverMensagem("Vaga com ID " + idVaga + " não encontrada. \n");
    }

    public void deletarVaga() {
        atalhos.escreverMensagem("Digite o ID da vaga que deseja deletar: ");
        int idVaga = sc.nextInt();
        sc.nextLine(); // Consome a nova linha deixada pelo nextInt()

        for (Vaga vaga : listaDeVagas) {
            if (vaga.getId() == idVaga) {
                listaDeVagas.remove(vaga);
                return;
            }
        }
        atalhos.escreverMensagem("Vaga com ID " + idVaga + " não encontrada. \n");
    }

    public void exibirMenu() {
        exibirOpcoesMenu();
        validarOpcaoMenu();
    }
}
