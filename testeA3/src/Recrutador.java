import java.util.Scanner;

public class Recrutador {
    private String cargo;
    private String empresa;
    private Vaga vaga = new Vaga(); 

    Scanner sc = new Scanner(System.in);
    boolean isVagaCriada = false;
    Atalhos atalhos = new Atalhos();
    int opcaoMenuRecrutador;
    String atualizarExperiencia;

    public Recrutador() {
        atalhos.EscreverMensagem("Olá recrutador(a)! Você deseja: \n");
        atalhos.PularLinha();
        ExibirMenuRecrutador();
    }

    public void ExibirOpcoesMenuRecrutador(){
        atalhos.LinhaTracejada();
        atalhos.PularLinha();

        atalhos.EscreverMensagem("1-Criar vaga\n");
        atalhos.EscreverMensagem("2-Visualizar vagas\n");
        atalhos.EscreverMensagem("3-Atualizar vagas\n");

        atalhos.PularLinha();
    }

    public void ValidarOpcaoMenurRecrutador(){
        atalhos.EscreverMensagem("Escolha uma opção: ");
        opcaoMenuRecrutador = sc.nextInt();

        atalhos.PularLinha();
        atalhos.LinhaTracejada();

        switch (opcaoMenuRecrutador) {
            case 1:
                atalhos.EscreverMensagem("Opção 1 | Criar vaga\n");
                vaga.CriarVaga();
                isVagaCriada = true;
                ExibirMenuRecrutador();
                break;

            case 2:
                atalhos.EscreverMensagem("Opção 2 | Visualizar vaga\n");
                if(isVagaCriada){
                    vaga.VisualizarVaga();
                } else {
                    atalhos.EscreverMensagem("Não há vagas criadas no momento. \n");
                }
                ExibirMenuRecrutador();
                break;

            case 3:
                atalhos.EscreverMensagem("Opção 3 | Atualizar vaga\n");
                if (isVagaCriada) {
                    vaga.AtualizarVaga();
                } else {
                    atalhos.EscreverMensagem("Não há vagas criadas no momento. \n");
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
        ValidarOpcaoMenurRecrutador();
    }

    // public String getCargo() {
    //     return cargo;
    // }

    // public void setCargo(String cargo) {
    //     this.cargo = cargo;
    // }

    // public String getEmpresa() {
    //     return empresa;
    // }

    // public void setEmpresa(String empresa) {
    //     this.empresa = empresa;
    // }

    // public void SelecionarCandidato(){

    // }
    // public void ExcluirCandidato(){

    // }
    // public void ListarCandidaturas(){

    // }
    // public void EditarStatusCandidatura(){

    // }
    // public void EditarVaga(){

    // }
    // public void ListarVagas(){

    // }
    // public void CadastrarEmpresa(){

    // }
    // public void AgendarEntrevista(){

    }