import java.util.Scanner;

public class Curriculo {
    private String formacao;
    private String nivelEscolaridade;
    private String objetivos;
    private String habilidades;
    private String experiencias;
    private String nome;

    Atalhos atalhos = new Atalhos();
    Scanner sc = new Scanner(System.in);

    public void CriarCurriculo() {
        atalhos.LinhaTracejada();

        atalhos.EscreverMensagem("Nome: ");
        String nome = sc.nextLine();

        atalhos.PularLinha();

        atalhos.EscreverMensagem("Formação: ");
        String formacaoCandidato = sc.nextLine();

        atalhos.PularLinha();

        atalhos.EscreverMensagem("Nível de escolaridade: ");
        String nivelEscolaridadeCandidato = sc.nextLine();

        atalhos.PularLinha();

        atalhos.EscreverMensagem("Objetivos: ");
        String objetivosCandidato = sc.nextLine();

        atalhos.PularLinha();

        atalhos.EscreverMensagem("Habilidades: ");
        String habilidadesCandidato = sc.nextLine();

        atalhos.PularLinha();

        atalhos.EscreverMensagem("Experiências: ");
        String experienciasCandidato = sc.nextLine();

        atalhos.PularLinha();

        atalhos.EscreverMensagem("Curriculo criado com sucesso! \n");
        atalhos.LinhaTracejada();

        this.formacao = formacaoCandidato;
        this.nivelEscolaridade = nivelEscolaridadeCandidato;
        this.objetivos = objetivosCandidato;
        this.habilidades = habilidadesCandidato;
        this.experiencias = experienciasCandidato;
        this.nome = nome;
    }

    public void VerResultadoCurriculo() {
        atalhos.LinhaTracejada();

        System.out.printf("Nome: %s \n", nome);
        atalhos.PularLinha();

        System.out.printf("Formação: %s \n", formacao);
        atalhos.PularLinha();

        System.out.printf("Nível de escolaridade: %s \n", nivelEscolaridade);
        atalhos.PularLinha();

        System.out.printf("Objetivos: %s \n", objetivos);
        atalhos.PularLinha();

        System.out.printf("Habilidades: %s \n", habilidades);
        atalhos.PularLinha();

        System.out.printf("Experiências: %s \n", experiencias);
        atalhos.PularLinha();

        atalhos.LinhaTracejada();
    }

    public void AtualizarCurriculo(){
        atalhos.LinhaTracejada();

        atalhos.EscreverMensagem("Nome: ");
        String nome = sc.nextLine();
        setNome(nome);

        atalhos.PularLinha();

        atalhos.EscreverMensagem("Formação: ");
        String formacaoCandidato = sc.nextLine();
        setFormacao(formacaoCandidato);

        atalhos.PularLinha();

        atalhos.EscreverMensagem("Nível de escolaridade: ");
        String nivelEscolaridadeCandidato = sc.nextLine();
        setNivelEscolaridade(nivelEscolaridadeCandidato);

        atalhos.PularLinha();

        atalhos.EscreverMensagem("Objetivos: ");
        String objetivosCandidato = sc.nextLine();
        setObjetivos(objetivosCandidato);

        atalhos.PularLinha();

        atalhos.EscreverMensagem("Habilidades: ");
        String habilidadesCandidato = sc.nextLine();
        setHabilidades(habilidadesCandidato);

        atalhos.PularLinha();

        atalhos.EscreverMensagem("Experiências: ");
        String experienciasCandidato = sc.nextLine();
        setExperiencias(experienciasCandidato);

        atalhos.PularLinha();

        atalhos.EscreverMensagem("Curriculo atualizado com sucesso! \n");
        atalhos.LinhaTracejada();

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