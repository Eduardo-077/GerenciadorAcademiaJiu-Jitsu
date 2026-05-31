public class ListaAulas {
    private Aula[] aulas;
    private int quantidadeAulas;

    public ListaAulas(int capacidade) {
        this.aulas = new Aula[capacidade];
        this.quantidadeAulas = 0;
    }

    public void adicionarAula(Aula aula) {
        if (quantidadeAulas < aulas.length) {
            aulas[quantidadeAulas] = aula;
            quantidadeAulas++;
        } else {
            throw new IllegalStateException("Capacidade máxima de aulas atingida.");
        }
    }

    public Aula getAula(int indice) { //Função procura na lista de aulas o indice q tu ta procurando, 
    // dps tem q adicionar uma forma de achar pelo id da aula em si, e não só pelo "id" na lista
        for (int i = 0; i < quantidadeAulas; i++) {
            if(i == indice){
                return aulas[i];
            }
            //if (aulas[i].getIdAula() == id) {
            //    return aulas[i];
            //}
        }
        throw new IllegalArgumentException("Aula com ID " + indice + " não encontrada.");
    }

    public int getQuantidadeAulas() {
        return quantidadeAulas;
    }

    public int getCapacidade() {
        return aulas.length;
    }

    public static Aula printAulas (ListaAulas lista){
        for (int i = 0; i < lista.getQuantidadeAulas(); i++) {
            System.out.println("Aula " + (i + 1) + ": " + lista.getAula(i).getIdAula());
        }
        return null;
    }
}
