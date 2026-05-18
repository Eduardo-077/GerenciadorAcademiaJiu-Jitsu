import java.util.List;
import java.util.ArrayList;

public class Aula {
    private int data;
    private String horario;
    private String local;
    private Professor professor;
    private List<Aluno> alunosAgendados;
    private int idAula;
    private int quantidadeAlunos;

    public Aula(int data, String horario, String local, Professor professor, ListaAulas listaAulas) {
        setData(data);
        setHorario(horario);
        setLocal(local);
        setProfessor(professor);
        idAula = gerarIdAula();
        alunosAgendados = new ArrayList<Aluno>();
        listaAulas.adicionarAula(this);
        setQuantidadeAlunos(0);
    }

    public int gerarIdAula() {
        return (int) (Math.random() * 10000); // Gera um ID aleatório entre 0 e 9999
    }
    
    
    public int getIdAula() {
        return idAula;
    }
    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }
    
    public void setQuantidadeAlunos(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }
    public void setIdAula(int idAula) {
        this.idAula = idAula;
    }
    public void setData(int data) {
        this.data = data;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
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
}
