import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Professor extends Praticante implements Iprofessor {
    private double salario;
    private List<Aula> aulasCriadas;
    private List<Aula> aulasDadas;
    private boolean salarioPago;

    public Professor(String nome, int matricula, String graduacao, double salario) {
        super(nome, matricula, graduacao);
        this.aulasCriadas = new ArrayList<Aula>();
        this.aulasDadas = new ArrayList<Aula>();
        this.salario = salario;
        this.salarioPago = false;
    }
    
    @Override
    public void receberSalario(double valor) {
        this.salario = valor;
        this.salarioPago = true;
        System.out.println("Salário recebido: R$ " + valor);
    }

    @Override
    public void calcularSalario(int aulasDadas, int valorPorAula) {
        // Lógica para calcular o salário do professor
        this.salario = aulasDadas * valorPorAula;
    }

    @Override
    public void criarAula(LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim, String local) {
        Aula aula = new Aula(dataHoraInicio, dataHoraFim, local, this);
        System.out.println("Aula criada com ID: " + aula.getIdAula());
    }

    @Override
    public void getAulasCriadas(ListaAulas listaAulas) {
        // Lógica para obter as aulas criadas pelo professor
        System.out.println("Aulas criadas pelo professor " + getNome() + ":");
        for(Aula aula : aulasCriadas) {
            System.out.println(" - ID: " + aula.getIdAula() + ", Horário: " + aula.getDataHoraInicio());
        }
    }

    @Override
    public void getAulasDadas(ListaAulas listaAulas) {
        // Lógica para obter as aulas dadas pelo professor
        System.out.println("Aulas dadas pelo professor " + getNome() + ":");
        for(Aula aula : aulasDadas) {
            System.out.println(" - ID: " + aula.getIdAula() + ", Horário: " + aula.getDataHoraInicio());
        }
    }

    public double getSalario() {
        return salario;
    }
}
