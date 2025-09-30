import entities.Bootcamp;
import entities.Curso;
import entities.Dev;
import entities.Mentoria;
import entities.Desafio; // Novo conteúdo já att para versão final 

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== B O O T C A M P  P O O - VERSÃO OZZY ===");
        System.out.println();
        
        System.out.println("Ozzy aqui! Papai ama vocês filhas...");
        System.out.println();
        
        // Cursos básicos
        Curso cursoJava = criarCurso("Java Básico", "Começando com Java", 8);
        Curso cursoPOO = criarCurso("POO com Java", "Orientação a Objetos na prática", 6);
        Curso cursoSpring = criarCurso("Spring Boot", "Criando APIs REST", 10);
        
        // Mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Carreira Dev");
        mentoria.setDescricao("Como conseguir o primeiro emprego");
        mentoria.setData(LocalDate.now().plusDays(5));
        
        // NOVO: Desafios práticos!
        Desafio desafioLogica = new Desafio();
        desafioLogica.setTitulo("Desafio de Lógica");
        desafioLogica.setDescricao("Resolva problemas algoritmos divertidos");
        desafioLogica.setDificuldade(2);
        desafioLogica.setDataLimite(LocalDate.now().plusDays(14));
        desafioLogica.setEmEquipe(false);
        
        Desafio desafioProjeto = new Desafio();
        desafioProjeto.setTitulo("Projeto Final - API REST");
        desafioProjeto.setDescricao("Crie uma API completa do zero");
        desafioProjeto.setDificuldade(4);
        desafioProjeto.setDataLimite(LocalDate.now().plusDays(30));
        desafioProjeto.setEmEquipe(true);
        
        System.out.println("Conteúdos criados com sucesso!");
        System.out.println("- 3 Cursos");
        System.out.println("- 1 Mentoria"); 
        System.out.println("- 2 Desafios Práticos");
        System.out.println();
        
        // Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Family");
        bootcamp.setDescricao("Aprendendo Java em família - edição Ozzy");
        
        // Adiciona tudo
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoPOO);
        bootcamp.getConteudos().add(cursoSpring);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(desafioLogica);
        bootcamp.getConteudos().add(desafioProjeto);
        
        System.out.println("Bootcamp: " + bootcamp.getNome());
        System.out.println("Conteúdos totais: " + bootcamp.getConteudos().size());
        System.out.println("Duração: " + bootcamp.getDataInicial() + " a " + bootcamp.getDataFinal());
        System.out.println();
        
        // A família - agora com construtores melhorados
        Dev ozzy = new Dev();
        ozzy.setNome("Ozzy Oliveira");
        
        Dev satira = new Dev();
        satira.setNome("Sátira Oliveira");
        
        Dev sophia = new Dev();
        sophia.setNome("Sophia Oliveira");
        
        System.out.println("=== A FAMÍLIA OLIVEIRA ===");
        System.out.println("Eu, Ozzy - Pai e mentor de Java");
        System.out.println("Sátira - Minha filha mais velha, expert em tech");
        System.out.println("Sophia - Minha filha mais nova, futura dev");
        System.out.println("Data de inscrição: " + ozzy.getDataInscricao());
        System.out.println();
        
        // Inscrições
        System.out.println("=== INSCRIÇÕES ===");
        ozzy.inscreverBootcamp(bootcamp);
        satira.inscreverBootcamp(bootcamp);
        sophia.inscreverBootcamp(bootcamp);
        System.out.println();
        
        // Progresso - agora com sistema de níveis!
        System.out.println("=== NOSSA EVOLUÇÃO ===");
        
        System.out.println("--- Sátira (a dedicada) ---");
        for (int i = 0; i < 4; i++) {
            satira.progredir();
        }
        
        System.out.println("--- Sophia (aplicada) ---");
        for (int i = 0; i < 3; i++) {
            sophia.progredir();
        }
        
        System.out.println("--- Eu, Ozzy (ensinando) ---");
        for (int i = 0; i < 2; i++) {
            ozzy.progredir();
        }
        System.out.println();
        
        // Resultados finais
        System.out.println("=== RESULTADOS DA FAMÍLIA ===");
        System.out.println("🥇 " + satira.getNome() + " - " + satira.getNivel() + " - " + satira.calcularTotalXp() + " XP");
        System.out.println("🥈 " + sophia.getNome() + " - " + sophia.getNivel() + " - " + sophia.calcularTotalXp() + " XP");
        System.out.println("👨‍🏫 " + ozzy.getNome() + " - " + ozzy.getNivel() + " - " + ozzy.calcularTotalXp() + " XP");
        System.out.println();
        
        // Detalhes
        System.out.println("=== DETALHES ===");
        System.out.println(satira);
        System.out.println(sophia);
        System.out.println(ozzy);
        System.out.println();
        
        System.out.println("Estou orgulhoso das minhas filhas! 🥹");
        System.out.println("Elas estão evoluindo mais rápido que eu, mas é porque tô ensinando! 😄");
    }
    
    // Método auxiliar - mais organizado e sem preguiça
    private static Curso criarCurso(String titulo, String descricao, int cargaHoraria) {
        Curso curso = new Curso();
        curso.setTitulo(titulo);
        curso.setDescricao(descricao);
        curso.setCargaHoraria(cargaHoraria);
        return curso;
    }
}