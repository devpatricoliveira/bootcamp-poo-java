package entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

// Classe que representa o bootcamp completo
public class Bootcamp {
    private String nome;
    private String descricao;
    
    // Datas fixas - começa hoje e dura 45 dias
    // Final porque não muda depois de criado
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    
    // Conjuntos pra evitar duplicatas
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    // Só getters pra datas porque são finais
    public LocalDate getDataInicial() {
        return dataInicial;
    }
    
    public LocalDate getDataFinal() {
        return dataFinal;
    }
    
    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }
    
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    @Override
    public String toString() {
        return "Bootcamp: " + nome + 
               " | Duração: " + dataInicial + " a " + dataFinal +
               " | Conteúdos: " + conteudos.size() +
               " | Devs: " + devsInscritos.size();
    }
}