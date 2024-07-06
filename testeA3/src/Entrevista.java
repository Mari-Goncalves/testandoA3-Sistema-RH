public class Entrevista  {
    private Candidato candidato;
    private Recrutador recrutador;
    private String resultado;
    private String horario;
    private String data;
    private String modalidade;


    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public Recrutador getRecrutador() {
        return recrutador;
    }

    public void setRecrutador(Recrutador recrutador) {
        this.recrutador = recrutador;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }
}