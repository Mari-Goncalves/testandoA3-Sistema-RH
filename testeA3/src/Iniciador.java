import java.util.Scanner;

public class Iniciador {
    public Iniciador(){
        
        Atalhos atalhos = new Atalhos();
        Scanner sc = new Scanner(System.in);

        atalhos.PularLinha();
        atalhos.EscreverMensagem("1 - Sou recrutador \n");
        atalhos.EscreverMensagem("2 - Sou candidato \n");
        atalhos.PularLinha();
        atalhos.EscreverMensagem("Escolha uma opção: ");
        int opcao = sc.nextInt();

        atalhos.PularLinha();

        switch (opcao) {
            case 1:
                Recrutador recrutadorUm = new Recrutador();
                break;
            case 2:
                Candidato candidatoUm = new Candidato();
                break;
            default:
                atalhos.EscreverMensagem("Opção inválida!");
                break;
        }
    }
}
