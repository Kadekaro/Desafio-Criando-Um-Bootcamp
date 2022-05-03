import java.time.LocalDate;

public class Mentoria extends Conteudo {         // -> Conceito de HERANÇA

    private LocalDate data;
    public void setData(LocalDate data) {
        this.data = data;
    }
    public LocalDate getData() {
        return data;
    }


    @Override
    public String toString() {
        return "Mentoria{" +
                "Título= '" + getTitulo() + '\'' +
                ", Descrição= '" + getDescricao() + '\'' +
                ", Data= " + getData() +
                '}';
    }

    @Override
    public double CalcularXP() {
        return XP + 10d;
    }
}
