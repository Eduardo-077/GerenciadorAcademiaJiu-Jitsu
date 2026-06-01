import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inicializando aplicativo!");
        //Criando academia
        AcademiaJiuJitsu IlhaJiuJitsu = new AcademiaJiuJitsu();

        Calendario calendario = new Calendario(); //Criando o calendário para simular a passagem do tempo e cobrança mensal
        System.out.println("Calendário criado com data e hora atual: " + calendario.getDataHoraAtual());
        

        //Criando professores
        Professor professorMatheus = new Professor("Matheus", 12345, "Faixa Marrom", 2000.00);
        System.out.println("Professor cadastrado: " + professorMatheus.getNome());
        Professor professorAlan = new Professor("Alan", 67890, "Faixa Marrom", 1800.00);
        System.out.println("Professor cadastrado: " + professorAlan.getNome());

        IlhaJiuJitsu.adicionarProfessor(professorMatheus);
        IlhaJiuJitsu.adicionarProfessor(professorAlan);

        //Criando alunos
        Aluno alunoEduardo = new Aluno("Eduardo", 54321, "Faixa Branca", 0);
        IlhaJiuJitsu.adicionarAluno(alunoEduardo);
        alunoEduardo.pagarMensalidade(160.00); // Pagando a mensalidade do aluno
        alunoEduardo.consultarMensalidade();
        System.out.println("Aluno cadastrado: " + alunoEduardo.getNome());
        Aluno alunoLucas = new Aluno("Lucas", 98765, "Faixa Branca", 0);
        IlhaJiuJitsu.adicionarAluno(alunoLucas);
        alunoLucas.pagarMensalidade(120.00); // Pagando a mensalidade do aluno
        alunoLucas.consultarMensalidade();
        System.out.println("Aluno cadastrado: " + alunoLucas.getNome());

        //Cruiando lista de aulas
        //ListaAulas listaAulas1 = new ListaAulas(10);
        //System.out.println("Lista de aulas criada com capacidade para " + listaAulas1.getCapacidade() + " aulas."  );
        

        //System.out.println("Criei a lista");

        //Criando aulas
        professorMatheus.criarAula(LocalDateTime.of(2026, 5, 31, 11, 30), LocalDateTime.of(2026, 5, 31, 12, 30), "Tatame SM");
        Aula aula01 = new Aula(LocalDateTime.of(2026, 5, 31, 11, 30), LocalDateTime.of(2026, 5, 31, 12, 30), "Tatame SM", professorMatheus);
        System.out.println("Criei a aula do matheus");
        IlhaJiuJitsu.adicionarAula(aula01);
        

        System.out.println("Aula criada pelo professor " + professorMatheus.getNome() + " com ID: " + aula01.getIdAula());
        professorAlan.criarAula(LocalDateTime.of(2026, 5, 31, 13, 0), LocalDateTime.of(2026, 5, 31, 14, 0), "Tatame SM");
        Aula aula02 = new Aula(LocalDateTime.of(2026, 5, 31, 13, 0), LocalDateTime.of(2026, 5, 31, 14, 0), "Tatame SM", professorAlan);
        IlhaJiuJitsu.adicionarAula(aula02);

        System.out.println("Criei a aula do Alan");
        System.out.println("ID aula:" + aula02.getIdAula());

        IlhaJiuJitsu.getAulas().forEach(aula -> System.out.println("Aula: " + aula.getIdAula()));
        System.out.println("Printou a lista");

        System.out.println(IlhaJiuJitsu.getAulas());

        System.out.println("Cipa foi");

        //Ver se a aula esta vazia msm
        Aula.printarAlunos(IlhaJiuJitsu.getAulas().get(0));
        System.err.println("Ta vazia?");
        
        
        //Agendando aulas para alunos
        System.out.println(alunoEduardo.isMensalidadePaga());
        alunoEduardo.agendarAula(aula01);
        alunoLucas.agendarAula(aula01);
        //alunoLucas.agendarAula(IlhaJiuJitsu.getAulas().get(0).getIdAula(), IlhaJiuJitsu.getAulas());

        //System.out.println("Alunos agendados para a aula do professor " + professorMatheus.getNome() + ":");
        //Aula.printarAlunos(listaAulas1.getAula(0));

        //System.out.println("Status da aula: " + listaAulas1.getAula(0).getStatus());
        //Aula.printarAlunos(listaAulas1.getAula(0));


        System.out.println("Eduardo - Quantidade de aulas: " + alunoEduardo.getQuantidadeAulas());
        System.out.println("Lucas - Quantidade de aulas: " + alunoLucas.getQuantidadeAulas());

        




    }
}