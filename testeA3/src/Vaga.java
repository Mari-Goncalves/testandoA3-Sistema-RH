import java.util.Scanner;

public class Vaga {
    private String titulo;
    private String requisito;
    private String salario;
    private String cargaHoraria;
    private String tipoContrato;
    private String modalidade;
    private String empresa; 
    private String recrutador; 
    private String estadoVaga; 

    Atalhos atalhos = new Atalhos();
    Scanner sc = new Scanner(System.in);

    public void CriarVaga(){
        atalhos.LinhaTracejada();

        atalhos.EscreverMensagem("Título: ");
        String tituloVaga = sc.nextLine();

        atalhos.PularLinha();
        
        atalhos.EscreverMensagem("Requisitos: ");
        String requisitoVaga = sc.nextLine();

        atalhos.PularLinha();

        atalhos.EscreverMensagem("Salário: ");
        String salarioVaga = sc.nextLine();

        atalhos.PularLinha();

        atalhos.EscreverMensagem("Carga horaria: ");
        String cargaHorariaVaga = sc.nextLine();

        atalhos.PularLinha();

        atalhos.EscreverMensagem("Tipo de contrato: ");
        String tipoContratoVaga = sc.nextLine();

        atalhos.PularLinha();

        atalhos.EscreverMensagem("Modalidade: ");
        String modalidadeVaga = sc.nextLine();

        atalhos.PularLinha();

        atalhos.EscreverMensagem("Empresa: ");
        String empresaVaga = sc.nextLine();

        atalhos.PularLinha();

        atalhos.EscreverMensagem("Recrutador responsável: ");
        String recrutadorVaga = sc.nextLine();

        atalhos.PularLinha();

        atalhos.EscreverMensagem("Status da vaga (aberta, em andamento ou fechada): ");
        String estadoVagaVaga = sc.nextLine();

        atalhos.PularLinha();
        
        this.titulo = tituloVaga;
        this.requisito = requisitoVaga;
        this.salario = salarioVaga;
        this.cargaHoraria = cargaHorariaVaga;
        this.tipoContrato = tipoContratoVaga;
        this.modalidade = modalidadeVaga;
        this.empresa = empresaVaga;
        this.recrutador = recrutadorVaga;
        this.estadoVaga = estadoVagaVaga;
    }
    
    // public void VisualizarVaga(){

    // }
    // public void AtualizarVaga(){

    // }
}