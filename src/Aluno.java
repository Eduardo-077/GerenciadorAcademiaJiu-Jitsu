public class Aluno extends Praticante {
    private double mensalidade;
    private boolean mensalidadePaga;
    private int frequenciaSemanal;  
    
    public Aluno(String nome, int matricula, String graduacao) {
        super(nome, matricula, graduacao);
        this.mensalidade = 0.0;
        this.mensalidadePaga = false;
        this.frequenciaSemanal = 0;
    }

    void pagarMensalidade(double valor) {
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
    
    int getFrequenciaSemanal() {
        return frequenciaSemanal;
    }
    
    
    double getMensalidade() {
        return mensalidade;
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
    
    void agendarAula(int idAula){
        // Lógica para agendar aula com base no ID da aula
        // Exemplo: alunosAgendados.add(this);
        //Nave
    }
    
}


//Tabela valores e dias por semana
// 1x por semana - R$ 100,00
// 2x por semana - R$ 120,00
// 3x por semana - R$ 140,00
// Livre - R$ 160,00
