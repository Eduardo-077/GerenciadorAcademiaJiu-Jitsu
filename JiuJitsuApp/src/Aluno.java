import java.util.List;
import java.util.ArrayList;

public class Aluno extends Praticante implements Ialuno {
    private double mensalidade;
    private boolean mensalidadePaga;
    private int frequenciaSemanal;
    private List<Aula> aulasAgendadas;  
    private List<Aula> aulasRealizadas;
    
    public Aluno(String nome, int matricula, String graduacao, int quantidadeAulas) {
        super(nome, matricula, graduacao);
        this.mensalidade = 0.0;
        this.mensalidadePaga = false;
        this.frequenciaSemanal = 0;
        this.aulasAgendadas = new ArrayList<Aula>();
        this.aulasRealizadas = new ArrayList<Aula>();
        setQuantidadeAulas(quantidadeAulas);
    }

    
    
    int getFrequenciaSemanal() {
        return frequenciaSemanal;
    }
    int getQuantidadeAulas() {
        return numAulas;
    }
    
    double getMensalidade() {
        return mensalidade;
    }
    void setQuantidadeAulas(int quantidadeAulas) {
        this.numAulas = quantidadeAulas;
    }
    boolean isMensalidadePaga() {
        return mensalidadePaga;
    }
   
    void setFrequenciaSemanal(int frequenciaSemanal) {
        this.frequenciaSemanal = frequenciaSemanal;
    }
    
    void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }
    
    @Override
    public void consultarAulasRealizadas(ListaAulas listaAulas) {
        // Lógica para consultar aulas realizadas pelo aluno
        // Exemplo: iterar sobre a lista de aulas e verificar quais aulas têm o aluno agendado e já passaram
        System.out.println("Aulas realizadas para o aluno " + getNome() + ":");
        for(Aula aula : aulasRealizadas) {
                System.out.println(" - ID: " + aula.getIdAula() + ", Horário: " + aula.getDataHoraInicio());
        }
    }
    @Override
    public void agendarAula(int idAula, ListaAulas listaAulas) {
        // Lógica para agendar aula com base no ID da aula
        // Exemplo: alunosAgendados.add(this);
        //Navegar pela lista de aulas disponíveis e verificar se a aula com o ID fornecido existe
        //Se existir, adicionar o aluno à lista de alunos agendados para essa aula
        for(int i = 0; i < listaAulas.getQuantidadeAulas(); i++) {
            if(listaAulas.getAula(i).getIdAula() == idAula) {
                if(!listaAulas.getAula(i).aceitaAgendamento()) {
                    System.out.println("Não é possível agendar para a aula com ID: " + idAula + " pois ela já aconteceu.");
                    return;
                }
                listaAulas.getAula(i).adicionarAluno(this);
                aulasAgendadas.add(listaAulas.getAula(i));
                System.out.println("Aluno " + getNome() + " agendado para aula com ID: " + idAula);
                return;
            }
        }
        System.out.println("Aula com ID: " + idAula + " não encontrada.");

    }
    
    @Override
    public void cancelarAgendamento(int idAula, ListaAulas listaAulas) {
        // Lógica para cancelar agendamento de aula com base no ID da aula
        // Exemplo: alunosAgendados.remove(this);
        for(int i = 0; i < listaAulas.getQuantidadeAulas(); i++) {
            if(listaAulas.getAula(i).getIdAula() == idAula) {
                if(!listaAulas.getAula(i).aceitaAgendamento()) {
                    System.out.println("Não é possível agendar para a aula com ID: " + idAula + " pois ela já aconteceu.");
                    return;
                }
                listaAulas.getAula(i).removerAluno(this);
                aulasAgendadas.remove(listaAulas.getAula(i));
                System.out.println("Agendamento do aluno " + getNome() + " para aula com ID: " + idAula + " cancelado.");
                return;
            }
        }
        System.out.println("Aula com ID: " + idAula + " não encontrada.");
    }

    @Override
    public void consultarAulasAgendadas(ListaAulas listaAulas) {
        // Lógica para consultar aulas agendadas para o aluno
        // Exemplo: iterar sobre a lista de aulas e verificar quais aulas têm o aluno agendado
        System.out.println("Aulas agendadas para o aluno " + getNome() + ":");
        for(Aula aula : aulasAgendadas) {
            System.out.println(" - ID: " + aula.getIdAula() + ", Horário: " + aula.getDataHoraInicio());
        }
    }

    @Override
    public void pagarMensalidade(double valor) {
        if(valor == 100.00) {
            setMensalidade(valor);
            this.mensalidadePaga = true;
            setFrequenciaSemanal(1);
        } else if(valor == 120.00) {
            setMensalidade(valor);
            this.mensalidadePaga = true;
            setFrequenciaSemanal(2);
        } else if(valor == 140.00) {
            setMensalidade(valor);
            this.mensalidadePaga = true;
            setFrequenciaSemanal(3);    
        } else if(valor == 160.00) {
            setMensalidade(valor);
            this.mensalidadePaga = true;
            setFrequenciaSemanal(4);
        } else {
            throw new IllegalArgumentException("Valor inválido para mensalidade: " + valor);
        }
    }

    @Override
    public void consultarMensalidade() {
        if(mensalidadePaga) {
            System.out.println("Mensalidade paga: R$ " + mensalidade);
        } else {
            System.out.println("Mensalidade pendente. Valor a pagar: R$ " + mensalidade);
        }
    }
}


