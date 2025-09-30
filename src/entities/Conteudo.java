package entities;

// Essa vai ser nossa classe mãe de todos os conteúdos
// Coloquei como abstract porque não faz sentido criar um "Conteudo" genérico
// É tipo dizer "coisa" - muito vago, precisa ser mais específico
public abstract class Conteudo {
    // XP padrão que todo conteúdo dá
    // Usei protected pra que as classes filhas possam acessar também
    // static final porque é uma constante que vale pra todos
    protected static final double XP_PADRAO = 10.0;
    
    // Atributos básicos que todo conteúdo vai ter
    // Private mesmo - ninguém mexe direto
    private String titulo;
    private String descricao;
    
    // Método abstrato - cada filho implementa do seu jeito
    // Curso calcula baseado na carga horária, Mentoria é fixo, etc
    public abstract double calcularXp();
    
    // Getters e Setters - o básico do encapsulamento
    // Às vezes acho meio repetitivo, mas é importante pra controlar o acesso
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
        // Aqui poderia validar se o título não é vazio, mas depois a gente melhora
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}