public class Professor extends Praticante {
    private double salario;

    public Professor(String nome, int matricula, String graduacao) {
        super(nome, matricula, graduacao);
    }

    
    void criarAula(int data, String horario, String local) {
        Aula aula = new Aula(data, horario, local, this);
        
        
    }
}
