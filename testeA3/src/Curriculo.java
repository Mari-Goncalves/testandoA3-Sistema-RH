import java.util.Scanner;

public class Curriculo extends Cadastro {
    private String formacao;
    private String nivelEscolaridade;
    private String objetivos;
    private String habilidades;
    private String experiencias;
    private String nome;
    private String email;
    private String telefone;
    private String linkLinkedIn;

    Atalhos atalhos = new Atalhos();
    Scanner sc = new Scanner(System.in);

    public void criar() {
        atalhos.linhaTracejada();

        atalhos.escreverMensagem("Nome: ");
        String nomeCandidato = sc.nextLine();

        atalhos.pularLinha();

        atalhos.escreverMensagem("Email: ");
        String emailCandidato = sc.nextLine();

        atalhos.pularLinha();

        atalhos.escreverMensagem("Telefone: ");
        String telefoneCandidato = sc.nextLine();

        atalhos.pularLinha();

        atalhos.escreverMensagem("LinkedIn: ");
        String linkLinkedInCandidato = sc.nextLine();

        atalhos.pularLinha();

        atalhos.escreverMensagem("Formação: ");
        String formacaoCandidato = sc.nextLine();

        atalhos.pularLinha();

        atalhos.escreverMensagem("Nível de escolaridade: ");
        String nivelEscolaridadeCandidato = sc.nextLine();

        atalhos.pularLinha();

        atalhos.escreverMensagem("Objetivos: ");
        String objetivosCandidato = sc.nextLine();

        atalhos.pularLinha();

        atalhos.escreverMensagem("Habilidades: ");
        String habilidadesCandidato = sc.nextLine();

        atalhos.pularLinha();

        atalhos.escreverMensagem("Experiências: ");
        String experienciasCandidato = sc.nextLine();

        atalhos.pularLinha();

        atalhos.escreverMensagem("Curriculo criado com sucesso! \n");
        atalhos.linhaTracejada();

        this.formacao = formacaoCandidato;
        this.nivelEscolaridade = nivelEscolaridadeCandidato;
        this.objetivos = objetivosCandidato;
        this.habilidades = habilidadesCandidato;
        this.experiencias = experienciasCandidato;
        this.nome = nomeCandidato;
        this.email = emailCandidato;
        this.telefone = telefoneCandidato;
        this.linkLinkedIn = linkLinkedInCandidato;
    }

    public void visualizar() {
        atalhos.linhaTracejada();

        System.out.printf("Nome: %s \n", nome);
        atalhos.pularLinha();

        System.out.printf("Email: %s \n", email);
        atalhos.pularLinha();

        System.out.printf("Telefone: %s \n", telefone);
        atalhos.pularLinha();
        
        System.out.printf("LinkedIn: %s \n", linkLinkedIn);
        atalhos.pularLinha();

        System.out.printf("Formação: %s \n", formacao);
        atalhos.pularLinha();

        System.out.printf("Nível de escolaridade: %s \n", nivelEscolaridade);
        atalhos.pularLinha();

        System.out.printf("Objetivos: %s \n", objetivos);
        atalhos.pularLinha();

        System.out.printf("Habilidades: %s \n", habilidades);
        atalhos.pularLinha();

        System.out.printf("Experiências: %s \n", experiencias);
        atalhos.pularLinha();

        atalhos.linhaTracejada();
    }

    public void atualizar(){
        atalhos.linhaTracejada();

        atalhos.escreverMensagem("Nome: ");
        String nome = sc.nextLine();
        setNome(nome);

        atalhos.pularLinha();

        atalhos.escreverMensagem("Email: ");
        String email = sc.nextLine();
        setNome(email);

        atalhos.pularLinha();

        atalhos.escreverMensagem("Telefone: ");
        String telefone = sc.nextLine();
        setNome(telefone);

        atalhos.pularLinha();

        atalhos.escreverMensagem("LinkedIn: ");
        String linkLinkedIn = sc.nextLine();
        setNome(linkLinkedIn);

        atalhos.pularLinha();

        atalhos.escreverMensagem("Formação: ");
        String formacaoCandidato = sc.nextLine();
        setFormacao(formacaoCandidato);

        atalhos.pularLinha();

        atalhos.escreverMensagem("Nível de escolaridade: ");
        String nivelEscolaridadeCandidato = sc.nextLine();
        setNivelEscolaridade(nivelEscolaridadeCandidato);

        atalhos.pularLinha();

        atalhos.escreverMensagem("Objetivos: ");
        String objetivosCandidato = sc.nextLine();
        setObjetivos(objetivosCandidato);

        atalhos.pularLinha();

        atalhos.escreverMensagem("Habilidades: ");
        String habilidadesCandidato = sc.nextLine();
        setHabilidades(habilidadesCandidato);

        atalhos.pularLinha();

        atalhos.escreverMensagem("Experiências: ");
        String experienciasCandidato = sc.nextLine();
        setExperiencias(experienciasCandidato);

        atalhos.pularLinha();

        atalhos.escreverMensagem("Curriculo atualizado com sucesso! \n");
        atalhos.linhaTracejada();

        this.formacao = formacaoCandidato;
        this.nivelEscolaridade = nivelEscolaridadeCandidato;
        this.objetivos = objetivosCandidato;
        this.habilidades = habilidadesCandidato;
        this.experiencias = experienciasCandidato;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getNivelEscolaridade() {
        return nivelEscolaridade;
    }

    public void setNivelEscolaridade(String nivelEscolaridade) {
        this.nivelEscolaridade = nivelEscolaridade;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public String getExperiencias() {
        return experiencias;
    }

    public void setExperiencias(String experiencias) {
        this.experiencias = experiencias;
    }
}