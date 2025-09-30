🚀 Bootcamp POO Java – Implementação com Toque Pessoal

Um projeto criado para o desafio “Aprenda na Prática Programação Orientada a Objetos” da Digital Innovation One
, mas com um tempero a mais: melhorias reais, validações inteligentes e uma vibe mais próxima de um sistema usado de verdade. Tudo isso feito com muito código, café e paixão por Java ☕💻.

📚 Sobre o Projeto

Aqui você encontra a implementação de um sistema completo de Bootcamp em Java, totalmente baseado em Programação Orientada a Objetos (POO). Todos os pilares da POO foram aplicados com clareza — e claro, fui além dos requisitos do desafio, deixando o sistema mais robusto, intuitivo e funcional.

A ideia foi não só cumprir o desafio, mas também ir além, testando soluções mais reais, prevendo problemas e criando experiências que poderiam, sim, ser usadas num projeto real de onboarding devs.

✅ Requisitos Originais Atendidos

Abstração do domínio Bootcamp

Criação das principais classes:

Bootcamp

Curso

Mentoria

Dev

Aplicação dos 4 Pilares da POO:

Abstração

Encapsulamento

Herança

Polimorfismo

Transformação das classes em objetos com comportamentos reais

🔧 Melhorias Implementadas
✔️ Validações mais inteligentes

Validação de carga horária nos cursos

Verificação de campos obrigatórios (nome, descrição, etc.)

Datas futuras obrigatórias em mentorias e desafios

Mensagens de erro mais amigáveis e explicativas

🧠 Sistema de Níveis

Devs evoluem conforme ganham XP:

Iniciante: 0 - 149 XP

Intermediário: 150 - 299 XP

Avançado: 300+ XP

Notificações aparecem quando o dev sobe de nível

⏱️ Datas e Prazos

Inscrição com data automática

Prazo para completar os desafios

Checagem para evitar datas inválidas ou no passado

🆕 Novos Tipos de Conteúdo

Desafios Práticos com níveis de dificuldade

Pode ser feito sozinho ou em equipe

Geração de XP variável conforme a dificuldade

🗂️ Estrutura do Projeto
```bash
bootcamp-poo-java/
├── src/
│   ├── entities/
│   │   ├── Conteudo.java         # Classe abstrata base
│   │   ├── Curso.java            # Cursos com carga horária
│   │   ├── Mentoria.java         # Mentorias com data
│   │   ├── Desafio.java          # NOVO - Desafios práticos
│   │   ├── Dev.java              # Devs com sistema de nível e XP
│   │   └── Bootcamp.java         # Gerencia tudo
│   └── Main.java                 # Classe principal (execução)
├── .gitignore
└── README.md                     # Este arquivo aqui :)
```
▶️ Como Executar
🔑 Pré-requisitos

Java JDK 11+

Git instalado

Alguma IDE (IntelliJ, VS Code...) ou editor de sua preferência

📥 Passo a Passo
```bash
# Clone o repositório
git clone https://github.com/seu-usuario/bootcamp-poo-java.git

cd bootcamp-poo-java

# Compile os arquivos .java
javac -d bin src/entities/*.java src/Main.java

# Execute a aplicação
java -cp bin Main
```
💡 Funcionalidades Demonstradas
🔹 Pilares da POO

Abstração
```java
public abstract class Conteudo {
    public abstract double calcularXp();
}
```
Encapsulamento
```java
private String nome;

public String getNome() {
    return nome;
}
```
Herança
```java
public class Curso extends Conteudo { }
public class Mentoria extends Conteudo { }
```
Polimorfismo
```java
// Mesmo método, comportamento diferente
curso.calcularXp();    // XP baseado na carga horária
mentoria.calcularXp(); // XP fixo
desafio.calcularXp();  // XP baseado na dificuldade
```
🧭 Sistema de Progresso

Inscrição do Dev em Bootcamps

Progressão sequencial pelos conteúdos

Cálculo automático de XP

Evolução de Nível conforme o desempenho

Ranking dos participantes com base no XP

🧾 Exemplo de Saída
```txt
=== BOOTCAMP POO ===

Conteúdos criados com sucesso!
- 3 Cursos
- 1 Mentoria
- 2 Desafios

=== EVOLUÇÃO ===
Dev subiu para nível Intermediário!
Dev subiu para nível Avançado!

=== RESULTADOS ===
1º Dev1 - Avançado - 350.0 XP
2º Dev2 - Intermediário - 240.0 XP
3º Dev3 - Iniciante - 140.0 XP
```

🛠️ Tecnologias e Conceitos Utilizados

Java 11+ – Linguagem principal

POO – Paradigma central

Collections Framework – Listas, Sets, Maps, etc.

Java Time API – Manipulação de datas

Boas práticas de código – Mas sem exagerar na perfeição 😄

🔮 Próximos Passos

Algumas ideias para continuar evoluindo o projeto:

🎖️ Sistema de conquistas (badges)

💾 Persistência com banco de dados

🌐 Interface Web com Spring Boot

📡 API REST para integração

🧾 Geração automática de certificados

🤝 Contribuições

Contribuir é sempre bem-vindo! Sinta-se à vontade para:

Fazer um fork do projeto

Criar uma branch com sua feature ou correção

Comitar suas mudanças

Abrir um Pull Request

---

## 👨‍💻 Autor

Desenvolvido por [**Patric Oliveira**](https://patricoliveira.com.br) 

