public class ListaAulas {
    private Aula[] aulas;
    private int quantidadeAulas;

    public ListaAulas(int capacidade) {
        this.aulas = new Aula[capacidade];
        this.quantidadeAulas = 0;
    }

    void adicionarAula(Aula aula) {
        if (quantidadeAulas < aulas.length) {
            aulas[quantidadeAulas] = aula;
            quantidadeAulas++;
        } else {
            throw new IllegalStateException("Capacidade máxima de aulas atingida.");
        }
    }

    Aula getAula(int id) {
        for (int i = 0; i < quantidadeAulas; i++) {
            if (aulas[i].getIdAula() == id) {
                return aulas[i];
            }
        }
        throw new IllegalArgumentException("Aula com ID " + id + " não encontrada.");
    }

    int getQuantidadeAulas() {
        return quantidadeAulas;
    }
}
