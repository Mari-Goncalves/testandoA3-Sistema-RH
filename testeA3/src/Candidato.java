import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Candidato implements IMenus {
    Curriculo curriculoCandidato = new Curriculo();
    private List<Vaga> listaDeVagas = GerenciadorDeVagas.getListaDeVagas();
    private List<Candidatura> listaDeCandidaturas = new ArrayList<>();

    Scanner sc = new Scanner(System.in);
    boolean isCurriculoCriado = false;
    Atalhos atalhos = new Atalhos();
    int opcaoMenuCandidato;
    String atualizarExperiencia;
    int idVagaEscolhida;

    // Método construtor - 1º método chamado após a classe ser instanciada.
    public Candidato() {
        atalhos.escreverMensagem("Olá candidato(a)! Você deseja: \n");
        atalhos.pularLinha();
        exibirMenu();
    }

    public void exibirOpcoesMenu() {
        atalhos.linhaTracejada();
        atalhos.pularLinha();

        atalhos.escreverMensagem("1-Criar currículo\n");
        atalhos.escreverMensagem("2-Visualizar currículo\n");
        atalhos.escreverMensagem("3-Atualizar currículo\n");
        atalhos.escreverMensagem("4-Ver vagas disponiveis\n");
        atalhos.escreverMensagem("5-Listar candidaturas\n");
        atalhos.escreverMensagem("6-Voltar ao menu inicial\n");

        atalhos.pularLinha();
    }

    public void validarOpcaoMenu() {
        atalhos.escreverMensagem("Escolha uma opção: ");
        opcaoMenuCandidato = sc.nextInt();

        atalhos.pularLinha();
        atalhos.linhaTracejada();

        switch (opcaoMenuCandidato) {
            case 1:
                if (!isCurriculoCriado) {
                    criarCurriculo();
                } else {
                    atalhos.escreverMensagem("Seu currículo já foi criado. \n");
                    exibirMenu();
                }
                break;
            case 2:
                visualizarCurriculo();
                break;
            case 3:
                atualizarCurriculo();
                break;
            case 4:
                listarVagasDisponiveis();
                break;
            case 5:
                listarCandidaturas();
                break;
            case 6:
                atalhos.iniciar();
                break;
            default:
                atalhos.escreverMensagem("Valor inválido! Tente novamente. \n");
                exibirMenu();
                break;
        }
    }

    public void exibirMenu() {
        exibirOpcoesMenu();
        validarOpcaoMenu();
    }

    public void criarCurriculo() {
        atalhos.escreverMensagem("Opção 1 | Criar currículo\n");
        curriculoCandidato.criar();
        isCurriculoCriado = true;
        exibirMenu();
    }

    public void visualizarCurriculo() {
        if (isCurriculoCriado) {
            atalhos.escreverMensagem("Opção 2 | Visualizar currículo\n");
            curriculoCandidato.visualizar();
        } else {
            atalhos.escreverMensagem("Seu currículo ainda não foi criado. \n");
        }

        exibirMenu();
    }

    public void atualizarCurriculo() {
        if (isCurriculoCriado) {
            atalhos.escreverMensagem("Opção 3 | Atualizar currículo\n");
            curriculoCandidato.atualizar();

        } else {
            atalhos.escreverMensagem("Seu currículo ainda não foi criado. \n");
        }

        exibirMenu();

    }

    public void listarVagasDisponiveis() {
        atalhos.escreverMensagem("Opção 4 | Ver vagas disponiveis\n");

        if (listaDeVagas.isEmpty()) {
            atalhos.escreverMensagem("Não há vagas disponíveis no momento. \n");
        } else {
            for (Vaga vaga : listaDeVagas) {
                vaga.visualizar();

                atalhos.escreverMensagem("Deseja se candidatar a vaga (1-SIM ou 2-NAO): ");
                int opcaoCandidatarVaga = sc.nextInt();

                switch (opcaoCandidatarVaga) {
                    case 1:
                        Candidatura candidatura = new Candidatura(vaga.getId(), vaga.getTitulo());
                        listaDeCandidaturas.add(candidatura);
                        atalhos.escreverMensagem("Candidatura feita com sucesso! \n");
                        break;

                    case 2:
                        break;

                    default:
                        atalhos.escreverMensagem("Valor inválido! Tente novamente. \n");
                        exibirMenu();
                        break;
                }
            }
        }

        exibirMenu();
    }

    public void listarCandidaturas() {
        atalhos.escreverMensagem("Opção 5 | Listar candidaturas\n");
        atalhos.pularLinha();

        if (listaDeCandidaturas.isEmpty()) {
            atalhos.escreverMensagem("Você ainda não se candidatou a nenhuma vaga. \n");
        } else {
            for (Candidatura candidatura : listaDeCandidaturas) {
                candidatura.visualizar();
            }
        }

        exibirMenu();
    }
}
