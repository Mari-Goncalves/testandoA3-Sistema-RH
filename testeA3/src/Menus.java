import java.util.Scanner;

public class Menus {
    Scanner sc = new Scanner(System.in);

    int opcaoMenuInicial;
    int opcaoRecrutador;
    int opcaoCandidato;

    // Funções que auxiliam no layout do terminal.
    public void PularLinha(){
        System.out.println(" ");
    }
    public void EscreverMensagem(String mensagem){
        System.out.print(mensagem);
    }
    public void LinhaTracejada(){
        System.out.println("--------------------------------------------------");
    }

    // Primeiro menu que é exibido ao iniciar o sistema.
    public void MostrarMenuInicial(){
        PularLinha();

        EscreverMensagem("Qual seu nome? ");
        String nomeUsuario = sc.nextLine();
        
        LinhaTracejada();

        EscreverMensagem("1-Recrutador \n");
        EscreverMensagem("2-Candidato \n");

        PularLinha();

        EscreverMensagem("Escolha uma opção: ");
        opcaoMenuInicial = sc.nextInt();

        LinhaTracejada();
        
        PularLinha();

        
        switch (opcaoMenuInicial) {
            case 1:
                System.out.printf("Olá recrutador(a) %s! Você deseja: \n", nomeUsuario);
                PularLinha();
                EscreverMensagem("1-Cadastrar nova vaga \n");
                EscreverMensagem("2-Ver vagas já cadastradas \n");
                PularLinha();
                EscreverMensagem("Escolha uma opção: ");
                opcaoRecrutador = sc.nextInt();
                break;

            case 2:
                System.out.printf("Olá candidato(a) %s! Você deseja: \n", nomeUsuario);
                PularLinha();
                EscreverMensagem("1-Cadastrar currículo \n");
                EscreverMensagem("2-Ver vagas disponiveis \n");
                EscreverMensagem("3-Listar candidaturas \n");
                PularLinha();
                EscreverMensagem("Escolha uma opção: ");
                opcaoCandidato = sc.nextInt();
                break;
        
            default:
                EscreverMensagem("Valor inválido! Tente novamente.");
                break;
        }

        PularLinha();
    }

    // Menu exibido ao recrutador.
    public void MostrarMenuRecrutador(){

    }
}