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
        ExibirMenuCandidato();
    }

    public void ExibirOpcoesMenuCandidato() {
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

    public void ValidarOpcaoMenuCandidato() {
        atalhos.escreverMensagem("Escolha uma opção: ");
        opcaoMenuCandidato = sc.nextInt();

        atalhos.pularLinha();
        atalhos.linhaTracejada();

        switch (opcaoMenuCandidato) {
            case 1:
                if (!isCurriculoCriado) {
                    CriarCurriculo();
                } else {
                    atalhos.escreverMensagem("Seu currículo já foi criado. \n");
                    ExibirMenuCandidato();
                }
                break;
            case 2:
                VisualizarCurriculo();
                break;
            case 3:
                AtualizarCurriculo();
                break;
            case 4:
                ListarVagasDisponiveis();
                break;
            case 5:
                ListarCandidaturas();
                break;
            case 6:
                atalhos.iniciar();
                break;
            default:
                atalhos.escreverMensagem("Valor inválido! Tente novamente. \n");
                ExibirMenuCandidato();
                break;
        }
    }

    public void ExibirMenuCandidato() {
        ExibirOpcoesMenuCandidato();
        ValidarOpcaoMenuCandidato();
    }

    public void CriarCurriculo() {
        atalhos.escreverMensagem("Opção 1 | Criar currículo\n");
        curriculoCandidato.Criar();
        isCurriculoCriado = true;
        ExibirMenuCandidato();
    }

    public void VisualizarCurriculo() {
        if (isCurriculoCriado) {
            atalhos.escreverMensagem("Opção 2 | Visualizar currículo\n");
            curriculoCandidato.Visualizar();
        } else {
            atalhos.escreverMensagem("Seu currículo ainda não foi criado. \n");
        }

        ExibirMenuCandidato();
    }

    public void AtualizarCurriculo() {
        if (isCurriculoCriado) {
            atalhos.escreverMensagem("Opção 3 | Atualizar currículo\n");
            curriculoCandidato.Atualizar();

        } else {
            atalhos.escreverMensagem("Seu currículo ainda não foi criado. \n");
        }

        ExibirMenuCandidato();

    }

    public void ListarVagasDisponiveis() {
        atalhos.escreverMensagem("Opção 4 | Ver vagas disponiveis\n");
        if (listaDeVagas.isEmpty()) {
            atalhos.escreverMensagem("Não há vagas disponíveis no momento. \n");
        } else {
            for (Vaga vaga : listaDeVagas) {
                vaga.Visualizar();
            }
        }

        // atalhos.escreverMensagem("Você deseja se candidatar a esta vaga? (1-SIM ou 2-NAO): ");
        // int opcaoCandidatarVaga = sc.nextInt();
        // if(opcaoCandidatarVaga == 1){
        //     // adcionar uma nova candidatura a listaDeCandidaturas
        // }

        ExibirMenuCandidato();
    }

    public void ListarCandidaturas() {
        atalhos.escreverMensagem("ListarCandidaturas... \n");
        ExibirMenuCandidato();
    }
}
