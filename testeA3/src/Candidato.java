import java.util.Scanner;

public class Candidato extends Pessoa {
    private String endereco;
    private String cpf;
    Curriculo curriculoCandidato = new Curriculo();
    // *Como puxar enum?*
    // -ArrayList<Vagas>: Vaga

    Scanner sc = new Scanner(System.in);
    boolean isCurriculoCriado = false;
    Atalhos atalhos = new Atalhos();
    int opcaoMenuCandidato;
    String atualizarExperiencia;

    // Método construtor - 1º método chamado após a classe ser intanciada.
    public Candidato() {
        atalhos.EscreverMensagem("Olá candidato(a)! Você deseja: \n");
        atalhos.PularLinha();
        ExibirMenuCandidato();
    }

    public void ExibirOpcoesMenuCandidato(){
        atalhos.LinhaTracejada();
        atalhos.PularLinha();

        atalhos.EscreverMensagem("1-Criar currículo\n");
        atalhos.EscreverMensagem("2-Visualiar currículo\n");
        atalhos.EscreverMensagem("3-Atualizar currículo\n");
        atalhos.EscreverMensagem("4-Ver vagas disponiveis\n");
        atalhos.EscreverMensagem("5-Listar candidaturas\n");

        atalhos.PularLinha();
    }

    public void ValidarOpcaoMenuCandidato(){
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
        curriculoCandidato.CriarCurriculo();
        isCurriculoCriado = true;
        ExibirMenuCandidato();
    }

    public void VisualizarCurriculo() {
        if (isCurriculoCriado) {
            atalhos.EscreverMensagem("Opção 2 | Visualizar currículo\n");
            curriculoCandidato.VerResultadoCurriculo();
        } else {
            atalhos.EscreverMensagem("Seu currículo ainda não foi criado. \n");
        }
        
        ExibirMenuCandidato();
    }

    public void AtualizarCurriculo() {
        if (isCurriculoCriado) {
            atalhos.EscreverMensagem("Opção 3 | Atualizar currículo\n");
            curriculoCandidato.AtualizarCurriculo();

        } else {
            atalhos.EscreverMensagem("Seu currículo ainda não foi criado. \n");
        }

        ExibirMenuCandidato();
        
    }

    public void ListarVagasDisponiveis() {
        atalhos.EscreverMensagem("ListarVagasDisponiveis... \n");
        ExibirMenuCandidato();
    }
    
    public void ListarCandidaturas() {
        atalhos.EscreverMensagem("ListarCandidaturas... \n");
        ExibirMenuCandidato();
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}