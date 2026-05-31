public abstract class Praticante {
    protected String nome;
    protected int matricula;
    protected String graduacao;
    protected int numAulas;

    public Praticante(String nome, int matricula, String graduacao) {
        this.nome = nome;
        this.matricula = matricula;
        this.graduacao = graduacao;
        this.numAulas = 0;
    }

    public String getNome() {
        return nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public String getGraduacao() {
        return graduacao;
    }
}
