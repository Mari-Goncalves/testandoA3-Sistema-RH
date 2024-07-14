import java.util.Scanner;

public class Atalhos {
    // Funções que auxiliam no layout do terminal.
    public void pularLinha() {
        System.out.println(" ");
    }

    public void escreverMensagem(String mensagem) {
        System.out.print(mensagem);
    }

    public void linhaTracejada() {
        System.out.println("--------------------------------------------------");
    }

    public void iniciar() {
        Scanner sc = new Scanner(System.in);

        pularLinha();
        escreverMensagem("1 - Sou recrutador \n");
        escreverMensagem("2 - Sou candidato \n");
        pularLinha();
        escreverMensagem("Escolha uma opção: ");
        int opcao = sc.nextInt();

        pularLinha();

        switch (opcao) {
            case 1:
                Recrutador recrutadorUm = new Recrutador();
                break;
            case 2:
                Candidato candidatoUm = new Candidato();
                break;
            default:
                escreverMensagem("Opção inválida!");
                break;
        }
    }
}
