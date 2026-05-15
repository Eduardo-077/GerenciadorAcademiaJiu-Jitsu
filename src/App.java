public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Inicializando aplicativo!");

        //Criando professores
        Professor professorMatheus = new Professor("Matheus", 12345, "Faixa Marrom");
        System.out.println("Professor cadastrado: " + professorMatheus.getNome());
        Professor professorAlan = new Professor("Alan", 67890, "Faixa Marrom");
        System.out.println("Professor cadastrado: " + professorAlan.getNome());

        //Criando alunos
        Aluno alunoEduardo = new Aluno("Eduardo", 54321, "Faixa Branca");
        System.out.println("Aluno cadastrado: " + alunoEduardo.getNome());
        Aluno alunoLucas = new Aluno("Lucas", 98765, "Faixa Branca");
        System.out.println("Aluno cadastrado: " + alunoLucas.getNome());

        //Criando aulas
        professorMatheus.criarAula(15052025, "18:00", "Tatame SM");
        professorAlan.criarAula(16052025, "19:00", "Tatame SM");

        //Agendando aulas para alunos
        
    }
}
