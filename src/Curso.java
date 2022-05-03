public class Curso extends Conteudo{  // > Conceito de Herança
   private int cargaHoraria;

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" + "Título= " + getTitulo() + "" +
                ", Descrição= " + getDescricao() +
                ", Carga Horaria= " + getCargaHoraria() + "}";
    }

    @Override
    public double CalcularXP() {
        return XP * cargaHoraria;
    }
}
