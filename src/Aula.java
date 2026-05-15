import java.util.List;
import java.util.ArrayList;

public class Aula {
    private int data;
    private String horario;
    private String local;
    private Professor professor;
    private int idAula;

    public Aula(int data, String horario, String local, Professor professor) {
        setData(data);
        setHorario(horario);
        setLocal(local);
        setProfessor(professor);
        idAula = gerarIdAula();
        List<Aluno> alunosAgendados = new ArrayList<Aluno>();
    }

    public int gerarIdAula() {
        return (int) (Math.random() * 10000); // Gera um ID aleatório entre 0 e 9999
    }
    public int getIdAula() {
        return idAula;
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



    //Lista alunos agendados
}
