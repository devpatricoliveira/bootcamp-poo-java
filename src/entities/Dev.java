package entities;
import java.time.LocalDate; // Tinha me esquecido na versão anterior 
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
    private String nivel; // Novo: sistema de níveis
    private LocalDate dataInscricao; // Novo: data de inscrição
    
    // Construtor pra forçar nome e data
    public Dev() {
        this.dataInscricao = LocalDate.now();
        this.nivel = "Iniciante"; // Todo mundo começa como iniciante
    }
    
    public void inscreverBootcamp(Bootcamp bootcamp) {
        if (bootcamp == null) {
            System.out.println("[ERRO] Bootcamp não pode ser nulo!");
            return;
        }
        
        if (bootcamp.getConteudos().isEmpty()) {
            System.out.println("[AVISO] Este bootcamp não tem conteúdos ainda.");
        }
        
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
        
        System.out.println(this.nome + " se inscreveu no bootcamp " + bootcamp.getNome());
    }
    
    public void progredir() {
        if (this.conteudosInscritos.isEmpty()) {
            System.out.println(this.nome + ", você não tem conteúdos para concluir!");
            return;
        }
        
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        
        if(conteudo.isPresent()) {
            Conteudo conteudoConcluido = conteudo.get();
            this.conteudosConcluidos.add(conteudoConcluido);
            this.conteudosInscritos.remove(conteudoConcluido);
            
            // Atualiza o nível baseado no XP
            atualizarNivel();
            
            System.out.println(this.nome + " concluiu: " + conteudoConcluido.getTitulo());
        }
    }
    
    // Método novo: atualiza o nível do dev
    private void atualizarNivel() {
        double xpAtual = calcularTotalXp();
        String novoNivel;
        
        if (xpAtual >= 300) {
            novoNivel = "Avançado";
        } else if (xpAtual >= 150) {
            novoNivel = "Intermediário";
        } else {
            novoNivel = "Iniciante";
        }
        
        // Só mostra mensagem se o nível mudou
        if (!this.nivel.equals(novoNivel)) {
            System.out.println("🎉 " + this.nome + " subiu para nível " + novoNivel + "!");
            this.nivel = novoNivel;
        }
    }
    
    public double calcularTotalXp() {
        return this.conteudosConcluidos.stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("[AVISO] Nome não pode ser vazio. Usando 'Dev Anônimo'");
            this.nome = "Dev Anônimo";
        } else {
            this.nome = nome;
        }
    }
    
    public String getNivel() {
        return nivel;
    }
    
    public LocalDate getDataInscricao() {
        return dataInscricao;
    }
    
    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }
    
    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    @Override
    public String toString() {
        return "Dev: " + nome + 
               " | Nível: " + nivel +
               " | Inscritos: " + conteudosInscritos.size() + 
               " | Concluídos: " + conteudosConcluidos.size() +
               " | XP: " + calcularTotalXp();
    }
}