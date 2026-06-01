import java.time.LocalDateTime;


public interface Iprofessor {
    //public void setSalario(double valor);
    //public void pagarSalario(double valor);
    void receberSalario(double valor);
    void calcularSalario(int aulasDadas, int valorPorAula);
    void criarAula(LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim, String local);
    void getAulasCriadas(ListaAulas listaAulas);
    void getAulasDadas(ListaAulas listaAulas);
}
