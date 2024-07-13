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

    // public void AtualizarVaga() {
    //     atalhos.LinhaTracejada();

    //     atalhos.EscreverMensagem("Título: ");
    //     String titulo = sc.nextLine();
    //     setTitulo(titulo);
    //     atalhos.PularLinha();

    //     atalhos.EscreverMensagem("Requisito: ");
    //     String requisito = sc.nextLine();
    //     setRequisito(requisito);
    //     atalhos.PularLinha();

    //     atalhos.EscreverMensagem("Salário: ");
    //     String salario = sc.nextLine();
    //     setSalario(salario);
    //     atalhos.PularLinha();

    //     atalhos.EscreverMensagem("Carga horaria: ");
    //     String cargaHoraria = sc.nextLine();
    //     setCargaHoraria(cargaHoraria);
    //     atalhos.PularLinha();

    //     atalhos.EscreverMensagem("Tipo de contrato: ");
    //     String tipoContrato = sc.nextLine();
    //     setTipoContrato(tipoContrato);
    //     atalhos.PularLinha();

    //     atalhos.EscreverMensagem("Modalidade: ");
    //     String modalidade = sc.nextLine();
    //     setModalidade(modalidade);
    //     atalhos.PularLinha();

    //     atalhos.EscreverMensagem("Empresa: ");
    //     String empresa = sc.nextLine();
    //     setEmpresa(empresa);
    //     atalhos.PularLinha();

    //     atalhos.EscreverMensagem("Recrutador: ");
    //     String recrutador = sc.nextLine();
    //     setRecrutador(recrutador);
    //     atalhos.PularLinha();

    //     atalhos.EscreverMensagem("Estado da vga: ");
    //     String estadoVaga = sc.nextLine();
    //     setEstadoVaga(estadoVaga);

    //     atalhos.PularLinha();

    //     this.titulo = titulo;
    //     this.requisito = requisito;
    //     this.salario = salario;
    //     this.cargaHoraria = cargaHoraria;
    //     this.tipoContrato = tipoContrato;
    //     this.modalidade = modalidade;
    //     this.empresa = empresa;
    //     this.recrutador = recrutador;
    //     this.estadoVaga = estadoVaga;
    // }

    // public void setTitulo(String titulo) {
    //     this.titulo = titulo;
    // }

    // public void setRequisito(String requisito) {
    //     this.requisito = requisito;
    // }

    // public void setSalario(String salario) {
    //     this.salario = salario;
    // }

    // public void setCargaHoraria(String cargaHoraria) {
    //     this.cargaHoraria = cargaHoraria;
    // }

    // public void setTipoContrato(String tipoContrato) {
    //     this.tipoContrato = tipoContrato;
    // }

    // public void setModalidade(String modalidade) {
    //     this.modalidade = modalidade;
    // }

    // public void setEmpresa(String empresa) {
    //     this.empresa = empresa;
    // }

    // public void setRecrutador(String recrutador) {
    //     this.recrutador = recrutador;
    // }

    // public void setEstadoVaga(String estadoVaga) {
    //     this.estadoVaga = estadoVaga;
    // }
}
