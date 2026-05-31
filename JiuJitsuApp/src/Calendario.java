import java.time.LocalDateTime;

public class Calendario {
    private static Calendario instance;
    private LocalDateTime dataHoraAtual;

    private Calendario() {
        dataHoraAtual = LocalDateTime.now();
    }

    public static Calendario getInstance() {
        if (instance == null) {
            instance = new Calendario();
        }
        return instance;
    }

    public LocalDateTime getDataHoraAtual() {
        return dataHoraAtual;
    }

    // Método para avançar o tempo num mês para simnular cobrança
    public void avancarTempo(int meses) {
        dataHoraAtual = dataHoraAtual.plusMonths(meses);
    }
}
