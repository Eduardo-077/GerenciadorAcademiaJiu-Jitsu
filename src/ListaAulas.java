import java.util.List;
import java.util.stream.Collectors;

public class ListaAulas {
    public static List<Aula> filtrarPorMes(List<Aula> aulas, int mes, int ano) {
        return aulas.stream()
                .filter(aula -> aula.getDataHoraInicio().getMonthValue() == mes && aula.getDataHoraInicio().getYear() == ano)
                .collect(Collectors.toList());
    }

    public static List<Aula> filtrarPorProfessor(List<Aula> aulas, Professor professor) {
        return aulas.stream()
                .filter(aula -> aula.getProfessor().equals(professor))
                .collect(Collectors.toList());
    }
}
