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
        atalhos.EscreverMensagem("Olá candidato(a)! Você deseja: \n");
        atalhos.PularLinha();
        ExibirMenuCandidato();
    }

    public void ExibirOpcoesMenuCandidato() {
        atalhos.LinhaTracejada();
        atalhos.PularLinha();

        atalhos.EscreverMensagem("1-Criar currículo\n");
        atalhos.EscreverMensagem("2-Visualiar currículo\n");
        atalhos.EscreverMensagem("3-Atualizar currículo\n");
        atalhos.EscreverMensagem("4-Ver vagas disponiveis\n");
        atalhos.EscreverMensagem("5-Listar candidaturas\n");
        atalhos.EscreverMensagem("6-Voltar ao menu inicial\n");

        atalhos.PularLinha();
    }

    public void ValidarOpcaoMenuCandidato() {
        atalhos.EscreverMensagem("Escolha uma opção: ");
        opcaoMenuCandidato = sc.nextInt();

        atalhos.PularLinha();
        atalhos.LinhaTracejada();

        switch (opcaoMenuCandidato) {
            case 1:
                if (!isCurriculoCriado) {
                    CriarCurriculo();
                } else {
                    atalhos.EscreverMensagem("Seu currículo já foi criado. \n");
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
                atalhos.Iniciar();
                break;
            default:
                atalhos.EscreverMensagem("Valor inválido! Tente novamente. \n");
                ExibirMenuCandidato();
                break;
        }
    }

    public void ExibirMenuCandidato() {
        ExibirOpcoesMenuCandidato();
        ValidarOpcaoMenuCandidato();
    }

    public void CriarCurriculo() {
        atalhos.EscreverMensagem("Opção 1 | Criar currículo\n");
        curriculoCandidato.Criar();
        isCurriculoCriado = true;
        ExibirMenuCandidato();
    }

    public void VisualizarCurriculo() {
        if (isCurriculoCriado) {
            atalhos.EscreverMensagem("Opção 2 | Visualizar currículo\n");
            curriculoCandidato.Visualizar();
        } else {
            atalhos.EscreverMensagem("Seu currículo ainda não foi criado. \n");
        }

        ExibirMenuCandidato();
    }

    public void AtualizarCurriculo() {
        if (isCurriculoCriado) {
            atalhos.EscreverMensagem("Opção 3 | Atualizar currículo\n");
            curriculoCandidato.Atualizar();

        } else {
            atalhos.EscreverMensagem("Seu currículo ainda não foi criado. \n");
        }

        ExibirMenuCandidato();

    }

    public void ListarVagasDisponiveis() {
        atalhos.EscreverMensagem("Opção 4 | Ver vagas disponiveis\n");
        if (listaDeVagas.isEmpty()) {
            atalhos.EscreverMensagem("Não há vagas disponíveis no momento. \n");
        } else {
            for (Vaga vaga : listaDeVagas) {
                vaga.Visualizar();
            }
        }

        // atalhos.EscreverMensagem("Você deseja se candidatar a esta vaga? (1-SIM ou 2-NAO): ");
        // int opcaoCandidatarVaga = sc.nextInt();
        // if(opcaoCandidatarVaga == 1){
        //     // adcionar uma nova candidatura a listaDeCandidaturas
        // }

        ExibirMenuCandidato();
    }

    public void ListarCandidaturas() {
        atalhos.EscreverMensagem("ListarCandidaturas... \n");
        ExibirMenuCandidato();
    }
}
