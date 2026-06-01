import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class Aula {
    private LocalDateTime dataHoraInicio;
    private LocalDateTime dataHoraFim;
    private String local;
    private Professor professor;
    private List<Aluno> alunosAgendados;
    private int idAula;
    private int quantidadeAlunos;
    private boolean cancelada;

    public Aula(LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim, String local, Professor professor) {
        //setData(data);
        //setHorario(horario);
        setDataHoraInicio(dataHoraInicio);
        setDataHoraFim(dataHoraFim);
        setLocal(local);
        setProfessor(professor);
        idAula = gerarIdAula();
        alunosAgendados = new ArrayList<Aluno>();
        // listaAulas.adicionarAula(this);
        setQuantidadeAlunos(0);
        setCancelada(false);
    }

    public int gerarIdAula() {
        return (int) (Math.random() * 10000); // Gera um ID aleatório entre 0 e 9999
    }
    
    public String getLocal() {
        return local;
    }
    public Professor getProfessor() {
        return professor;
    }
    public String getInformacoesAula() {
        return "Aula ID: " + idAula + ", Local: " + local + ", Professor: " + professor.getNome() + ", Data e Hora: " + dataHoraInicio;
    }
    public int getIdAula() { 
        return idAula;
    }
    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }
    public boolean isCancelada() {
        return cancelada;
    }
    public void setQuantidadeAlunos(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }
    public void setIdAula(int idAula) {
        this.idAula = idAula;
    }
    public void setDataHoraInicio(LocalDateTime dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }
    public void setDataHoraFim(LocalDateTime dataHoraFim) {
        this.dataHoraFim = dataHoraFim;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public void setCancelada(boolean cancelada) {
        this.cancelada = cancelada;
    }
    public LocalDateTime getDataHoraInicio() {
        return dataHoraInicio;
    }
    public LocalDateTime getDataHoraFim() {
        return dataHoraFim;
    }
    public Aluno getAluno(int matricula){
        for(Aluno aluno : alunosAgendados) {
            if(aluno.getMatricula() == matricula) {
                return aluno;
            }
        }
        throw new IllegalArgumentException("Aluno com matrícula " + matricula + " não agendado.");
    }
    public Aluno getAluno(String nome){
        for(Aluno aluno : alunosAgendados) {
            if(aluno.getNome().equals(nome)) {
                return aluno;
            }
        }
        throw new IllegalArgumentException("Aluno com nome " + nome + " não agendado.");
    }
    public List<Aluno> getAlunosAgendados(){
        return alunosAgendados;
    }

    //Printar alunos agendados
    public static  void printarAlunos(Aula aula){
        // Implementação para printar alunos agendados
        if(aula.getQuantidadeAlunos() == 0) {
            System.out.println("Nenhum aluno agendado para esta aula.");
            return;
        }
        for (Aluno aluno : aula.getAlunosAgendados()) {
            System.out.println("Aluno: " + aluno.getNome() + ", Matrícula: " + aluno.getMatricula());
        }
    }

    public void adicionarAluno(Aluno aluno) {
        alunosAgendados.add(aluno);
        setQuantidadeAlunos(getQuantidadeAlunos() + 1);
    }

    public void removerAluno(Aluno aluno) {
        if(alunosAgendados.remove(aluno)) {
            setQuantidadeAlunos(getQuantidadeAlunos() - 1);
        } else {
            System.out.println("Aluno " + aluno.getNome() + " não encontrado na lista de agendamento.");
        }
    }

    //public void aulaAconteceu() {
    //    setCancelada(false);
    //   //Aumentar em 1 a quantidade de aulas que o aluno teve
    //    for(Aluno aluno : alunosAgendados){
    //        aluno.setQuantidadeAulas(aluno.getQuantidadeAulas() + 1); 
    //        // Talvez adicionar uma "chamada" para ver se o aluno foi, fazer uma comparação entre listas.
    //    }
    // }

    public StatusAula getStatus() {
        if(cancelada) return StatusAula.CANCELADA;

        LocalDateTime agora = LocalDateTime.now();
        if(agora.isBefore(dataHoraInicio)){
            return StatusAula.AGENDADA;
        } else if(agora.isAfter(dataHoraInicio) && agora.isBefore(dataHoraFim)){
            return StatusAula.EM_ANDAMENTO;
        } else {
            for(Aluno aluno : alunosAgendados){
            System.out.println("sla");
            aluno.setQuantidadeAulas(aluno.getQuantidadeAulas() + 1); 
            // Talvez adicionar uma "chamada" para ver se o aluno foi, fazer uma comparação entre listas.
            }
            return StatusAula.REALIZADA;
        }
    }
        public boolean aceitaAgendamento(){
            return getStatus() == StatusAula.AGENDADA;
        }
}
