public class Professor extends Praticante {
    private double salario;

    public Professor(String nome, int matricula, String graduacao) {
        super(nome, matricula, graduacao);
    }

    
    public void criarAula(int data, String horario, String local, ListaAulas listaAulas) {
        Aula aula = new Aula(data, horario, local, this, listaAulas);
        System.out.println("Aula criada com ID: " + aula.getIdAula());
    }
}
