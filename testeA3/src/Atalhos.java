import java.util.Scanner;

public class Atalhos {
    // Funções que auxiliam no layout do terminal.
    public void PularLinha() {
        System.out.println(" ");
    }

    public void EscreverMensagem(String mensagem) {
        System.out.print(mensagem);
    }

    public void LinhaTracejada() {
        System.out.println("--------------------------------------------------");
    }

    public void Iniciar() {
        Scanner sc = new Scanner(System.in);

        PularLinha();
        EscreverMensagem("1 - Sou recrutador \n");
        EscreverMensagem("2 - Sou candidato \n");
        PularLinha();
        EscreverMensagem("Escolha uma opção: ");
        int opcao = sc.nextInt();

        PularLinha();

        switch (opcao) {
            case 1:
                Recrutador recrutadorUm = new Recrutador();
                break;
            case 2:
                Candidato candidatoUm = new Candidato();
                break;
            default:
                EscreverMensagem("Opção inválida!");
                break;
        }
    }
}
