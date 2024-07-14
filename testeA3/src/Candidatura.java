public class Candidatura {
    private int idVaga;
    private String tituloVaga;

    public Candidatura(int idVaga, String tituloVaga) {
        this.idVaga = idVaga;
        this.tituloVaga = tituloVaga;
    }

    public void visualizar() {
        System.out.println("Id vaga: " + idVaga + ", Título vaga: " + tituloVaga);
    }
}
