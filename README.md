# QUIZ - Algoritmos e Linguagem de Programação II

Sistema de perguntas e respostas desenvolvido em Java para a disciplina **Algoritmos e Linguagem de Programação II**. O quiz roda no console e aborda conceitos básicos de Java.

## Requisitos da atividade

- Exibe no início o nome do aluno, do professor e da faculdade.
- Armazena 15 objetos `Questao` em uma `ArrayList` (declarada pela interface `List`).
- Apresenta cada pergunta e suas alternativas, aceitando respostas de A a E.
- Valida a entrada e aceita letras maiúsculas ou minúsculas.
- Exibe o total de acertos e a porcentagem com duas casas decimais.
- Agradece ao participante ao final.

## Identificação exibida

- **Aluno:** Luis Renato Silva Fernandes
- **Professor:** Brenno Pimenta
- **Curso:** Engenharia de Software
- **Turma:** ESNB
- **Faculdade:** UNIFAN

## Estrutura do projeto

```text
Quiz/
|-- src/
|   |-- Main.java
|   `-- Questao.java
|-- .gitignore
|-- Quiz.iml
`-- README.md
```

`Main.java` monta a lista de questões, conduz o quiz e calcula o resultado. `Questao.java` guarda os dados de cada pergunta, exibe as alternativas e valida a resposta.

## Como executar pelo terminal

Com o JDK instalado, abra o terminal na pasta do projeto e execute:

```powershell
javac -encoding UTF-8 -d out src/*.java
java -cp out Main
```

Também é possível abrir o projeto no IntelliJ IDEA e executar o método `main` de `src/Main.java`.

## Exemplo do resultado final

```text
=================================
          RESULTADO FINAL
=================================
Acertos: 15 de 15
Aproveitamento: 100,00%
Perfeito! Você gabaritou o quiz.
Obrigado por participar do Quiz!
```

## Tecnologias

- Java
- `ArrayList` e `List`
- Console/Terminal
