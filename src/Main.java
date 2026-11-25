import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        List<Questao> questoes = criarQuestoes();
        int acertos = 0;

        System.out.println("=================================");
        System.out.println("   QUIZ - PROGRAMAÇÃO EM JAVA");
        System.out.println("Aluno: Luis Renato Silva Fernandes");
        System.out.println("Professor: Brenno Pimenta");
        System.out.println("Curso: Engenharia de Software");
        System.out.println("Turma: ESNB");
        System.out.println("Faculdade: UNIFAN");
        System.out.println("=================================");
        System.out.println("São " + questoes.size() + " questões. Responda com A, B, C, D ou E.");
        System.out.println();

        for (int i = 0; i < questoes.size(); i++) {
            System.out.println("Questão " + (i + 1) + " de " + questoes.size());
            questoes.get(i).escrevaQuestao();

            String resposta = questoes.get(i).leiaResposta();
            if (questoes.get(i).isCorreta(resposta)) {
                acertos++;
            }
        }

        double porcentagem = (acertos * 100.0) / questoes.size();

        System.out.println("=================================");
        System.out.println("          RESULTADO FINAL");
        System.out.println("=================================");
        System.out.println("Acertos: " + acertos + " de " + questoes.size());
        System.out.printf(Locale.forLanguageTag("pt-BR"), "Aproveitamento: %.2f%%%n", porcentagem);
        System.out.println(mensagemFinal(porcentagem));
        System.out.println("Obrigado por participar do Quiz!");
    }

    // Devolve um comentário de acordo com o desempenho do usuário
    private static String mensagemFinal(double porcentagem) {
        if (porcentagem == 100) {
            return "Perfeito! Você gabaritou o quiz.";
        } else if (porcentagem >= 70) {
            return "Muito bem! Você tem uma boa base de Java.";
        } else if (porcentagem >= 50) {
            return "Na média. Vale revisar alguns conteúdos.";
        } else {
            return "Ainda precisa estudar mais, mas não desanime!";
        }
    }

    // Monta uma questão já preenchida, para não repetir código 15 vezes
    private static Questao nova(String pergunta, String a, String b, String c,
                                String d, String e, String correta) {
        Questao q = new Questao();
        q.pergunta = pergunta;
        q.opcaoA = "A) " + a;
        q.opcaoB = "B) " + b;
        q.opcaoC = "C) " + c;
        q.opcaoD = "D) " + d;
        q.opcaoE = "E) " + e;
        q.correta = correta;
        return q;
    }

    private static List<Questao> criarQuestoes() {
        List<Questao> lista = new ArrayList<>();

        lista.add(nova("Qual tipo primitivo do Java armazena números inteiros de 32 bits?",
                "byte", "short", "int", "long", "float", "C"));

        lista.add(nova("Qual palavra-chave é usada para criar um novo objeto em Java?",
                "this", "new", "class", "static", "void", "B"));

        lista.add(nova("Qual é o resultado da expressão 10 / 4 quando os dois valores são do tipo int?",
                "2", "2.5", "3", "2.0", "Dá erro de compilação", "A"));

        lista.add(nova("Qual estrutura de repetição executa o bloco pelo menos uma vez, testando a condição só no final?",
                "for", "while", "foreach", "if", "do-while", "E"));

        lista.add(nova("Qual é o índice do primeiro elemento de um array em Java?",
                "1", "-1", "2", "0", "Depende do tipo do array", "D"));

        lista.add(nova("Qual método serve como ponto de entrada de um programa Java?",
                "start", "init", "main", "run", "execute", "C"));

        lista.add(nova("Qual modificador de acesso permite que um atributo seja usado apenas dentro da própria classe?",
                "private", "public", "protected", "static", "final", "A"));

        lista.add(nova("Qual operador compara se dois valores primitivos são iguais?",
                "=", ":=", "===", "equals", "==", "E"));

        lista.add(nova("Qual é a forma correta de comparar o conteúdo de duas Strings?",
                "Usando o operador ==", "Usando o método equals()", "Usando o operador =",
                "Usando o método length()", "Usando o método compare()", "B"));

        lista.add(nova("Qual comando encerra imediatamente um laço de repetição?",
                "stop", "exit", "continue", "break", "skip", "D"));

        lista.add(nova("Como se obtém a quantidade de elementos de um array chamado numeros?",
                "numeros.size()", "numeros.length()", "numeros.length", "numeros.count", "len(numeros)", "C"));

        lista.add(nova("Qual palavra-chave indica que uma classe herda de outra?",
                "extends", "implements", "inherits", "super", "import", "A"));

        lista.add(nova("Qual é o valor padrão de um atributo int que não foi inicializado?",
                "null", "0", "1", "-1", "Indefinido", "B"));

        lista.add(nova("Qual classe é usada neste projeto para ler dados digitados no teclado?",
                "Reader", "Input", "Console", "Keyboard", "Scanner", "E"));

        lista.add(nova("Qual é o resultado de 7 % 3?",
                "0", "2", "2.33", "1", "3", "D"));

        return lista;
    }
}
