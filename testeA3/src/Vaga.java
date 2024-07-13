import java.util.Scanner;

public class Vaga {
    private static int contadorId = 1; // Contador para gerar IDs únicos
    private int id;
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

    public Vaga() {
        this.id = contadorId++;
    }

    public int getId() {
        return id;
    }

    public void CriarVaga() {
        atalhos.LinhaTracejada();

        atalhos.EscreverMensagem("Título: ");
        this.titulo = sc.nextLine();
        atalhos.PularLinha();

        atalhos.EscreverMensagem("Requisitos: ");
        this.requisito = sc.nextLine();
        atalhos.PularLinha();

        atalhos.EscreverMensagem("Salário: ");
        this.salario = sc.nextLine();
        atalhos.PularLinha();

        atalhos.EscreverMensagem("Carga horaria: ");
        this.cargaHoraria = sc.nextLine();
        atalhos.PularLinha();

        atalhos.EscreverMensagem("Tipo de contrato: ");
        this.tipoContrato = sc.nextLine();
        atalhos.PularLinha();

        atalhos.EscreverMensagem("Modalidade: ");
        this.modalidade = sc.nextLine();
        atalhos.PularLinha();

        atalhos.EscreverMensagem("Empresa: ");
        this.empresa = sc.nextLine();
        atalhos.PularLinha();

        atalhos.EscreverMensagem("Recrutador responsável: ");
        this.recrutador = sc.nextLine();
        atalhos.PularLinha();

        atalhos.EscreverMensagem("Status da vaga (aberta, em andamento ou fechada): ");
        this.estadoVaga = sc.nextLine();
        atalhos.PularLinha();

        atalhos.EscreverMensagem("Vaga criada com sucesso! \n");
        atalhos.LinhaTracejada();
    }

    public void VisualizarVaga() {
        atalhos.LinhaTracejada();

        System.out.printf("ID: %d \n", id);
        atalhos.PularLinha();
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
        System.out.printf("Recrutador: %s \n", recrutador);
        atalhos.PularLinha();
        System.out.printf("Estado da vaga: %s \n", estadoVaga);
        atalhos.PularLinha();

        atalhos.LinhaTracejada();
    }

    public void AtualizarVaga() {
        atalhos.LinhaTracejada();

        atalhos.EscreverMensagem("Título (" + this.titulo + "): ");
        this.titulo = sc.nextLine();
        atalhos.PularLinha();

        atalhos.EscreverMensagem("Requisitos (" + this.requisito + "): ");
        this.requisito = sc.nextLine();
        atalhos.PularLinha();

        atalhos.EscreverMensagem("Salário (" + this.salario + "): ");
        this.salario = sc.nextLine();
        atalhos.PularLinha();

        atalhos.EscreverMensagem("Carga horaria (" + this.cargaHoraria + "): ");
        this.cargaHoraria = sc.nextLine();
        atalhos.PularLinha();

        atalhos.EscreverMensagem("Tipo de contrato (" + this.tipoContrato + "): ");
        this.tipoContrato = sc.nextLine();
        atalhos.PularLinha();

        atalhos.EscreverMensagem("Modalidade (" + this.modalidade + "): ");
        this.modalidade = sc.nextLine();
        atalhos.PularLinha();

        atalhos.EscreverMensagem("Empresa (" + this.empresa + "): ");
        this.empresa = sc.nextLine();
        atalhos.PularLinha();

        atalhos.EscreverMensagem("Recrutador responsável (" + this.recrutador + "): ");
        this.recrutador = sc.nextLine();
        atalhos.PularLinha();

        atalhos.EscreverMensagem("Status da vaga (" + this.estadoVaga + "): ");
        this.estadoVaga = sc.nextLine();
        atalhos.PularLinha();

        atalhos.EscreverMensagem("Vaga atualizada com sucesso! \n");
        atalhos.LinhaTracejada();
    }
}