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

        atalhos.EscreverMensagem("Vaga criada com sucesso! \n");
        atalhos.LinhaTracejada();
        
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

    public void VisualizarVaga(){
        atalhos.LinhaTracejada();

        System.out.printf("Título: %s \n", titulo);
        atalhos.PularLinha();
        System.out.printf("Requisito: %s \n", requisito);
        atalhos.PularLinha();
        System.out.printf("Salário: %s \n", salario);
        atalhos.PularLinha();
        System.out.printf("Carga horaria: %s \n", cargaHoraria);
        atalhos.PularLinha();
        System.out.printf("Tipo de contrato: %s \n", tipoContrato);
        atalhos.PularLinha();
        System.out.printf("Modalidade: %s \n", modalidade);
        atalhos.PularLinha();
        System.out.printf("Empresa: %s \n", empresa);
        atalhos.PularLinha();
        System.out.printf("Eecrutador: %s \n", recrutador);
        atalhos.PularLinha();
        System.out.printf("Estado da vga: %s \n", estadoVaga);
        atalhos.PularLinha();

        atalhos.LinhaTracejada();
    }

    // public void AtualizarVaga(){

    // }
}