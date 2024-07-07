import java.util.Scanner;

public class Candidato extends Pessoa {
    private String endereco;
    private String cpf;
    private Curriculo curriculo;
    
    // *Como puxar enum?*
    // -ArrayList<Vagas>: Vaga

    Scanner sc = new Scanner(System.in);
    Curriculo curriculoCandidato = new Curriculo();
    boolean isCurriculoCriado = false;
    Atalhos atalhos = new Atalhos();
    int opcaoMenuCandidato;

    // Método construtor - 1º método chamado após a classe ser intanciada.
    public Candidato() {
        atalhos.EscreverMensagem("Olá candidato(a)! Você deseja: \n");
        atalhos.PularLinha();
        ExibirMenuCandidato();
    }

    public void ExibirOpcoesMenuCandidato(){
        atalhos.EscreverMensagem("1-Criar currículo \n");
        atalhos.EscreverMensagem("2-Atualizar curriculo \n");
        atalhos.EscreverMensagem("3-Ver vagas disponiveis \n");
        atalhos.EscreverMensagem("4-Listar candidaturas \n");

        atalhos.PularLinha();
    }

    public void ValidarOpcaoMenuCandidato(){
        atalhos.EscreverMensagem("Escolha uma opção: ");
        opcaoMenuCandidato = sc.nextInt();

        switch (opcaoMenuCandidato) {
            case 1:
                if (!isCurriculoCriado) {
                    CriarCurriculo();
                } else {
                    atalhos.EscreverMensagem("Seu curriculo já foi criado. \n");
                }
                break;

            case 2:
                AtualizarCurriculo();
                break;

            case 3:
                ListarVagasDisponiveis();
                break;

            case 4:
                ListarCandidaturas();
                break;

            default:
                atalhos.EscreverMensagem("Valor inválido! Tente novamente. \n");
                break;
        }
    }

    public void ExibirMenuCandidato() {
        ExibirOpcoesMenuCandidato();
        ValidarOpcaoMenuCandidato();
    }

    public void CriarCurriculo() {
        curriculoCandidato.CriarCurriculo();
        isCurriculoCriado = true;
        ExibirMenuCandidato();
    }

    public void AtualizarCurriculo() {

    }

    public void ListarVagasDisponiveis() {

    }
    
    public void ListarCandidaturas() {

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