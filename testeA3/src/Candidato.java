import java.util.List;
import java.util.Scanner;

public class Candidato {
    Curriculo curriculoCandidato = new Curriculo();
    private List<Vaga> listaDeVagas = GerenciadorDeListas.getListaDeVagas();
    // private List<Candidatura> listaDeCandidaturas = GerenciadorDeListas.getListaDeCandidaturas();

    Scanner sc = new Scanner(System.in);
    boolean isCurriculoCriado = false;
    Atalhos atalhos = new Atalhos();
    int opcaoMenuCandidato;
    String atualizarExperiencia;

    // Método construtor - 1º método chamado após a classe ser instanciada.
    public Candidato() {
        atalhos.escreverMensagem("Olá candidato(a)! Você deseja: \n");
        atalhos.pularLinha();
        exibirMenuCandidato();
    }

    public void exibirOpcoesMenuCandidato() {
        atalhos.linhaTracejada();
        atalhos.pularLinha();

        atalhos.escreverMensagem("1-Criar currículo\n");
        atalhos.escreverMensagem("2-Visualiar currículo\n");
        atalhos.escreverMensagem("3-Atualizar currículo\n");
        atalhos.escreverMensagem("4-Ver vagas disponiveis\n");
        atalhos.escreverMensagem("5-Listar candidaturas\n");
        atalhos.escreverMensagem("6-Voltar ao menu inicial\n");

        atalhos.pularLinha();
    }

    public void validarOpcaoMenuCandidato() {
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
                    exibirMenuCandidato();
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
                exibirMenuCandidato();
                break;
        }
    }

    public void exibirMenuCandidato() {
        exibirOpcoesMenuCandidato();
        validarOpcaoMenuCandidato();
    }

    public void criarCurriculo() {
        atalhos.escreverMensagem("Opção 1 | Criar currículo\n");
        curriculoCandidato.criar();
        isCurriculoCriado = true;
        exibirMenuCandidato();
    }

    public void visualizarCurriculo() {
        if (isCurriculoCriado) {
            atalhos.escreverMensagem("Opção 2 | Visualizar currículo\n");
            curriculoCandidato.visualizar();
        } else {
            atalhos.escreverMensagem("Seu currículo ainda não foi criado. \n");
        }

        exibirMenuCandidato();
    }

    public void atualizarCurriculo() {
        if (isCurriculoCriado) {
            atalhos.escreverMensagem("Opção 3 | Atualizar currículo\n");
            curriculoCandidato.atualizar();

        } else {
            atalhos.escreverMensagem("Seu currículo ainda não foi criado. \n");
        }

        exibirMenuCandidato();

    }

    public void listarVagasDisponiveis() {
        atalhos.escreverMensagem("Opção 4 | Ver vagas disponiveis\n");
        if (listaDeVagas.isEmpty()) {
            atalhos.escreverMensagem("Não há vagas disponíveis no momento. \n");
        } else {
            for (Vaga vaga : listaDeVagas) {
                vaga.visualizar();
            }
        }

        // atalhos.escreverMensagem("Você deseja se candidatar a esta vaga? (1-SIM ou 2-NAO): ");
        // int opcaoCandidatarVaga = sc.nextInt();
        // if(opcaoCandidatarVaga == 1){
        //     // adcionar uma nova candidatura a listaDeCandidaturas
        // }

        exibirMenuCandidato();
    }

    public void listarCandidaturas() {
        atalhos.escreverMensagem("listarCandidaturas... \n");
        exibirMenuCandidato();
    }
}
