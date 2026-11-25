# QUIZ - Algoritmos e Linguagem de Programação II

Projeto de Quiz desenvolvido em Java para a disciplina **Algoritmos e Linguagem de Programação II**, destinado aos alunos do 2º período dos cursos de Engenharia de Software e Segurança da Informação.

O programa roda no console e apresenta 15 questões sobre conceitos básicos da linguagem Java.

## Funcionalidades

- 15 questões representadas por objetos da classe `Questao`
- Armazenamento das questões em um array
- Apresentação das alternativas no terminal
- Uso de estruturas de repetição e condicionais
- Validação das respostas digitadas
- Total de acertos ao final
- Porcentagem de aproveitamento e mensagem final conforme o desempenho
- Respostas aceitas em letras maiúsculas ou minúsculas

## Como o projeto funciona

1. `Main.java` cria e percorre o array com as 15 questões.
2. `Questao.java` exibe o enunciado e valida a alternativa digitada pelo usuário.
3. Cada alternativa correta soma um ponto.
4. Ao final, o programa calcula a porcentagem de acertos e apresenta o resultado.

## Estrutura do projeto

```text
Quiz-main/
|-- src/
|   |-- Main.java
|   `-- Questao.java
|-- .gitignore
|-- Quiz.iml
`-- README.md
```

## Executando pelo terminal

Na pasta do projeto, compile e execute:

```powershell
javac -encoding UTF-8 -d out src/*.java
java -cp out Main
```

## Executando no IntelliJ IDEA

1. Abra o projeto no IntelliJ IDEA.
2. Aguarde a configuração do projeto Java.
3. Abra o arquivo `src/Main.java`.
4. Execute o método `main`.

## Formato das respostas

Digite uma das letras correspondentes a uma alternativa:

```text
A
B
C
D
E
```

Respostas inválidas fazem o programa solicitar outra alternativa.

## Exemplo de resultado

```text
=================================
          RESULTADO FINAL
=================================
Acertos: 15 de 15
Aproveitamento: 100.0%
Perfeito! Você gabaritou o quiz.
```

## Tecnologias

- Java
- Console/Terminal
- IntelliJ IDEA ou qualquer IDE compatível com Java
