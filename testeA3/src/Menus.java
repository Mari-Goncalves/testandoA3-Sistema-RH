import java.util.Scanner;

public class Menus {
    Scanner sc = new Scanner(System.in);

    public void PularLinha(){
        System.out.println(" ");
    }
    public void EscreverMensagem(String mensagem){
        System.out.print(mensagem);
    }
    public void LinhaTracejada(){
        System.out.println("--------------------------------------------------");
    }

    public void MostrarMenuInicial(){
        PularLinha();

        EscreverMensagem("Qual seu nome? ");
        String nomeUsuario = sc.nextLine();
        
        LinhaTracejada();

        EscreverMensagem("1-Recrutador \n");
        EscreverMensagem("2-Candidato \n");

        PularLinha();

        EscreverMensagem("Digite a opção em que deseja se cadastrar: ");
        int opcaoMenuInicial = sc.nextInt();

        LinhaTracejada();
        
        PularLinha();

        
        switch (opcaoMenuInicial) {
            case 1:
                System.out.printf("Olá recrutador(a) %s! \n", nomeUsuario);
                break;

            case 2:
                System.out.printf("Olá candidato(a) %s! \n", nomeUsuario);
                break;
        
            default:
                EscreverMensagem("Valor inválido! Tente novamente.");
                break;
        }
    }
}
