import java.util.Scanner;

public class Candidato extends Pessoa {
    private String endereco;
    private String cpf;
    private Curriculo curriculo;

    Scanner sc = new Scanner(System.in);

    // *Como puxar enum?*
    // -ArrayList<Vagas>: Vaga

    public Candidato() {
        MenuCandidato();
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

    public void MenuCandidato() {
        Atalhos atalhos = new Atalhos();

        System.out.print("Olá candidato(a)! Você deseja: \n");

        atalhos.PularLinha();

        atalhos.EscreverMensagem("1-Criar currículo \n");
        atalhos.EscreverMensagem("2-Atualizar curriculo \n");
        atalhos.EscreverMensagem("3-Ver vagas disponiveis \n");
        atalhos.EscreverMensagem("4-Listar candidaturas \n");

        atalhos.PularLinha();

        atalhos.EscreverMensagem("Escolha uma opção: ");
        int opcaoMenuCandidato = sc.nextInt();

        switch (opcaoMenuCandidato) {
            case 1:
                CriarCurriculo();
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
    // Acho que o candidato só podeá ver uma lista com vagas, sem pesquisar.
    // public void PesquisarVagas() {

    // }

    public void CriarCurriculo() {
        // Curriculo curriculoCandidato = new Curriculo();
    }

    public void AtualizarCurriculo() {

    }

    public void ListarVagasDisponiveis() {

    }
    public void ListarCandidaturas() {

    }

    public Curriculo getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(Curriculo curriculo) {
        this.curriculo = curriculo;
    }
}