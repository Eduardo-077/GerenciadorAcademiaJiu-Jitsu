import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public class AcademiaJiuJitsu {
    private List<Aluno> alunos;
    private List<Professor> professores;
    private List<Aula> aulas;

    public AcademiaJiuJitsu() {
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
        this.aulas = new ArrayList<>();
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    //IlhaJiuJitsu.getProfessores().forEach(professor -> System.out.println("Professor: " + professor.getNome()));
    public List<String> getNomesProfessores() {
        List<String> nomes = new ArrayList<>();
        for (Professor professor : professores) {
            nomes.add(professor.getNome());
        }
        return nomes;
    }

    public List<String> getNomesAlunos() {
        List<String> nomes = new ArrayList<>();
        for (Aluno aluno : alunos) {
            nomes.add(aluno.getNome());
        }
        return nomes;
    }

    public List<String> getInformacoesAlunos() {
        List<String> informacoes = new ArrayList<>();
        for (Aluno aluno : alunos) {
            informacoes.add("Nome: " + aluno.getNome() + ", Matrícula: " + aluno.getMatricula() + ", Graduação: " + aluno.getGraduacao() + ", Mensalidade: " + aluno.getMensalidade());
        }
        return informacoes;
    }

    public List<String> getInformacoesProfessores() {
        List<String> informacoes = new ArrayList<>();
        for (Professor professor : professores) {
            informacoes.add("Nome: " + professor.getNome() + ", Matrícula: " + professor.getMatricula() + ", Graduação: " + professor.getGraduacao() + ", Salário: " + professor.getSalario());
        }
        return informacoes;
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    public List<String> getInformacoesAulas() {
        List<String> informacoes = new ArrayList<>();
        for (Aula aula : aulas) {
            informacoes.add(aula.getInformacoesAula());
        }
        return informacoes;
    }

    public void adicionarAula(Aula aula) {
        this.aulas.add(aula);
    }
    public void adicionarProfessor(Professor professor) {
        this.professores.add(professor);
    }
    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }
}
