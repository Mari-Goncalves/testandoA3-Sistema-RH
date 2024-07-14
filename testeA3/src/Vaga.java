import java.util.Scanner;

public class Vaga extends Cadastro {
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

    public void criar() {
        atalhos.linhaTracejada();

        atalhos.escreverMensagem("Título: ");
        this.titulo = sc.nextLine();
        atalhos.pularLinha();

        atalhos.escreverMensagem("Requisitos: ");
        this.requisito = sc.nextLine();
        atalhos.pularLinha();

        atalhos.escreverMensagem("Salário: ");
        this.salario = sc.nextLine();
        atalhos.pularLinha();

        atalhos.escreverMensagem("Carga horaria: ");
        this.cargaHoraria = sc.nextLine();
        atalhos.pularLinha();

        atalhos.escreverMensagem("Tipo de contrato: ");
        this.tipoContrato = sc.nextLine();
        atalhos.pularLinha();

        atalhos.escreverMensagem("Modalidade: ");
        this.modalidade = sc.nextLine();
        atalhos.pularLinha();

        atalhos.escreverMensagem("Empresa: ");
        this.empresa = sc.nextLine();
        atalhos.pularLinha();

        atalhos.escreverMensagem("Recrutador responsável: ");
        this.recrutador = sc.nextLine();
        atalhos.pularLinha();

        atalhos.escreverMensagem("Status da vaga (aberta, em andamento ou fechada): ");
        this.estadoVaga = sc.nextLine();
        atalhos.pularLinha();

        atalhos.escreverMensagem("Vaga criada com sucesso! \n");
        atalhos.linhaTracejada();
    }

    public void visualizar() {
        atalhos.linhaTracejada();

        System.out.printf("ID: %d \n", id);
        atalhos.pularLinha();
        System.out.printf("Título: %s \n", titulo);
        atalhos.pularLinha();
        System.out.printf("Requisito: %s \n", requisito);
        atalhos.pularLinha();
        System.out.printf("Salário: %s \n", salario);
        atalhos.pularLinha();
        System.out.printf("Carga horaria: %s \n", cargaHoraria);
        atalhos.pularLinha();
        System.out.printf("Tipo de contrato: %s \n", tipoContrato);
        atalhos.pularLinha();
        System.out.printf("Modalidade: %s \n", modalidade);
        atalhos.pularLinha();
        System.out.printf("Empresa: %s \n", empresa);
        atalhos.pularLinha();
        System.out.printf("Recrutador: %s \n", recrutador);
        atalhos.pularLinha();
        System.out.printf("Estado da vaga: %s \n", estadoVaga);
        atalhos.pularLinha();

        atalhos.linhaTracejada();
    }

    public void atualizar() {
        atalhos.linhaTracejada();

        atalhos.escreverMensagem("Título (" + this.titulo + "): ");
        this.titulo = sc.nextLine();
        atalhos.pularLinha();

        atalhos.escreverMensagem("Requisitos (" + this.requisito + "): ");
        this.requisito = sc.nextLine();
        atalhos.pularLinha();

        atalhos.escreverMensagem("Salário (" + this.salario + "): ");
        this.salario = sc.nextLine();
        atalhos.pularLinha();

        atalhos.escreverMensagem("Carga horaria (" + this.cargaHoraria + "): ");
        this.cargaHoraria = sc.nextLine();
        atalhos.pularLinha();

        atalhos.escreverMensagem("Tipo de contrato (" + this.tipoContrato + "): ");
        this.tipoContrato = sc.nextLine();
        atalhos.pularLinha();

        atalhos.escreverMensagem("Modalidade (" + this.modalidade + "): ");
        this.modalidade = sc.nextLine();
        atalhos.pularLinha();

        atalhos.escreverMensagem("Empresa (" + this.empresa + "): ");
        this.empresa = sc.nextLine();
        atalhos.pularLinha();

        atalhos.escreverMensagem("Recrutador responsável (" + this.recrutador + "): ");
        this.recrutador = sc.nextLine();
        atalhos.pularLinha();

        atalhos.escreverMensagem("Status da vaga (" + this.estadoVaga + "): ");
        this.estadoVaga = sc.nextLine();
        atalhos.pularLinha();

        atalhos.escreverMensagem("Vaga atualizada com sucesso! \n");
        atalhos.linhaTracejada();
    }
}