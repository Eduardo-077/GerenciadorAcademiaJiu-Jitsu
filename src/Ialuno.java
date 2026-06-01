public interface Ialuno {
    void consultarAulasRealizadas(ListaAulas listaAulas);
    void agendarAula(Aula aula);
    void cancelarAgendamento(Aula aula);
    void consultarAulasAgendadas();
    void pagarMensalidade(double valor);
    void consultarMensalidade();
}