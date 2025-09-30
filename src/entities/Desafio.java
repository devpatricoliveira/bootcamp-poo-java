package entities;

import java.time.LocalDate;

// Novo tipo de conteúdo para da mais originalidade ao código, porque gosto de tudo que faço personalizado- desafios práticos
public class Desafio extends Conteudo {
    private int dificuldade; // 1 a 5
    private LocalDate dataLimite;
    private boolean emEquipe;
    
    public Desafio() {
        // Valores padrão
        this.dificuldade = 3;
        this.emEquipe = false;
    }
    
    @Override
    public double calcularXp() {
        // Desafio dá mais XP - baseado na dificuldade
        double xpBase = XP_PADRAO * 2; // Desafio vale o dobro
        return xpBase * dificuldade;
    }
    
    // Getters e Setters com validações
    public int getDificuldade() {
        return dificuldade;
    }
    
    public void setDificuldade(int dificuldade) {
        if (dificuldade < 1) {
            this.dificuldade = 1;
        } else if (dificuldade > 5) {
            this.dificuldade = 5;
        } else {
            this.dificuldade = dificuldade;
        }
    }
    
    public LocalDate getDataLimite() {
        return dataLimite;
    }
    
    public void setDataLimite(LocalDate dataLimite) {
        // Não deixa colocar data no passado
        if (dataLimite != null && dataLimite.isBefore(LocalDate.now())) {
            System.out.println("[AVISO] Data limite não pode ser no passado.");
            this.dataLimite = LocalDate.now().plusDays(7); // Padrão: 7 dias
        } else {
            this.dataLimite = dataLimite;
        }
    }
    
    public boolean isEmEquipe() {
        return emEquipe;
    }
    
    public void setEmEquipe(boolean emEquipe) {
        this.emEquipe = emEquipe;
    }
    
    @Override
    public String toString() {
        String tipo = emEquipe ? "Desafio em Equipe" : "Desafio Individual";
        return tipo + ": " + getTitulo() + " (Dificuldade: " + dificuldade + "/5)";
    }
}