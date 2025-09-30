package entities;

import java.time.LocalDate;

// Mentoria também é um Conteudo, mas com regras diferentes
public class Mentoria extends Conteudo {
    private LocalDate data;
    
    // Polimorfismo: mesmo método, implementação diferente do Curso
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20.0; // Mentoria sempre dá 30 XP
        // Pensei em deixar fixo porque mentoria é mais valiosa
    }
    
    public LocalDate getData() {
        return data;
    }
    
    public void setData(LocalDate data) {
        this.data = data;
    }
    
    @Override
    public String toString() {
        return "Mentoria: " + getTitulo() + " - " + data;
    }
}