package entities;

public class Curso extends Conteudo {
    private int cargaHoraria;
    
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    
    public void setCargaHoraria(int cargaHoraria) {
        // Validação simples - não deixa colocar carga horária negativa
        if (cargaHoraria < 0) {
            System.out.println("[AVISO] Carga horária não pode ser negativa. Definindo como 0.");
            this.cargaHoraria = 0;
        } else if (cargaHoraria > 100) {
            System.out.println("[AVISO] Carga horária muito alta. Limitando para 100h.");
            this.cargaHoraria = 100;
        } else {
            this.cargaHoraria = cargaHoraria;
        }
    }
    
    @Override
    public String toString() {
        return "Curso: " + getTitulo() + " (" + cargaHoraria + "h)";
    }
}