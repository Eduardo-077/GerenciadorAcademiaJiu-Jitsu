import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public class AcademiaJiuJitsu {
    private List<Aluno> alunos;
    private List<Professor> professores;
    private List<Aula> aulas;


    
    public static void main(String[] args) throws Exception {
        System.out.println("Inicializando aplicativo!");

        //Criando professores
        Professor professorMatheus = new Professor("Matheus", 12345, "Faixa Marrom", 2000.00);
        System.out.println("Professor cadastrado: " + professorMatheus.getNome());
        Professor professorAlan = new Professor("Alan", 67890, "Faixa Marrom", 1800.00);
        System.out.println("Professor cadastrado: " + professorAlan.getNome());

        //Criando alunos
        Aluno alunoEduardo = new Aluno("Eduardo", 54321, "Faixa Branca", 0);
        System.out.println("Aluno cadastrado: " + alunoEduardo.getNome());
        Aluno alunoLucas = new Aluno("Lucas", 98765, "Faixa Branca", 0);
        System.out.println("Aluno cadastrado: " + alunoLucas.getNome());

        //Cruiando lista de aulas
        ListaAulas listaAulas1 = new ListaAulas(10);
        System.out.println("Lista de aulas criada com capacidade para " + listaAulas1.getCapacidade() + " aulas."  );
        

        System.out.println("Criei a lista");

        //Criando aulas
        professorMatheus.criarAula(LocalDateTime.of(2026, 5, 31, 11, 30), LocalDateTime.of(2026, 5, 31, 12, 30), "Tatame SM", listaAulas1);

        System.out.println("Criei a aula do matheus");
        System.out.println("ID aula:" + listaAulas1.getAula(0).getIdAula());

        System.out.println("Aula criada pelo professor " + professorMatheus.getNome() + " com ID: " + listaAulas1.getAula(0).getIdAula()    );
        professorAlan.criarAula(LocalDateTime.of(2026, 5, 31, 13, 0), LocalDateTime.of(2026, 5, 31, 14, 0), "Tatame SM", listaAulas1);

        System.out.println("Criei a aula do Alan");
        System.out.println("ID aula:" + listaAulas1.getAula(1).getIdAula());

        System.out.println("Aula criada pelo professor " + professorAlan.getNome() + " com ID: " + listaAulas1.getAula(1).getIdAula()    ); 
        ListaAulas.printAulas(listaAulas1);
        System.out.println("Printou a lista");

        //Ver se a aula esta vazia msm
        Aula.printarAlunos(listaAulas1.getAula(0));
        System.err.println("Ta vazia?");
        //Agendando aulas para alunos
        alunoEduardo.agendarAula(listaAulas1.getAula(0).getIdAula(), listaAulas1);
        alunoLucas.agendarAula(listaAulas1.getAula(0).getIdAula(), listaAulas1);

        System.out.println("Alunos agendados para a aula do professor " + professorMatheus.getNome() + ":");
        Aula.printarAlunos(listaAulas1.getAula(0));

        System.out.println("Status da aula: " + listaAulas1.getAula(0).getStatus());
        Aula.printarAlunos(listaAulas1.getAula(0));


        System.out.println("Eduardo - Quantidade de aulas: " + alunoEduardo.getQuantidadeAulas());
        System.out.println("Lucas - Quantidade de aulas: " + alunoLucas.getQuantidadeAulas());


    }
}
