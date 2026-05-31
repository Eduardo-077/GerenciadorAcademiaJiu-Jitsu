public interface Ialuno {
    void consultarAulasRealizadas(ListaAulas listaAulas);
    void agendarAula(int idAula, ListaAulas listaAulas);
    void cancelarAgendamento(int idAula, ListaAulas listaAulas);
    void consultarAulasAgendadas(ListaAulas listaAulas);
    void pagarMensalidade(double valor);
    void consultarMensalidade();
}