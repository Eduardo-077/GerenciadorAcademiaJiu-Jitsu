public class Praticante {
    private String nome;
    private int matricula;
    private String graduacao;
    private int numAulas;

    public Praticante(String nome, int matricula, String graduacao) {
        this.nome = nome;
        this.matricula = matricula;
        this.graduacao = graduacao;
        this.numAulas = 0;
    }

    public String getNome() {
        return nome;
    }
    
}
