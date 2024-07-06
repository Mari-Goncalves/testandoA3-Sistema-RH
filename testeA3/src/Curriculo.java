public class Curriculo {
    private String formacao;
    private String nivelEscolaridade;
    private String objetivos;
    private String habilidades;
    private String experiencias;

    public Curriculo(String formacao, String nivelEscolaridade, String objetivos, String habilidades,
            String experiencias) {
        this.formacao = formacao;
        this.nivelEscolaridade = nivelEscolaridade;
        this.objetivos = formacao;
        this.habilidades = habilidades;
        this.experiencias = experiencias;
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