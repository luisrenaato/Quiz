public class Main {

    public static void main(String[] args) {
        Questao[] questoes = criarQuestoes();
        int acertos = 0;

        System.out.println("=================================");
        System.out.println("   QUIZ - PROGRAMAÇÃO EM JAVA");
        System.out.println("=================================");
        System.out.println("São " + questoes.length + " questões. Responda com A, B, C, D ou E.");
        System.out.println();

        for (int i = 0; i < questoes.length; i++) {
            System.out.println("Questão " + (i + 1) + " de " + questoes.length);
            questoes[i].escrevaQuestao();

            String resposta = questoes[i].leiaResposta();
            if (questoes[i].isCorreta(resposta)) {
                acertos++;
            }
        }

        double porcentagem = (acertos * 100.0) / questoes.length;

        System.out.println("=================================");
        System.out.println("          RESULTADO FINAL");
        System.out.println("=================================");
        System.out.println("Acertos: " + acertos + " de " + questoes.length);
        System.out.printf("Aproveitamento: %.1f%%%n", porcentagem);
        System.out.println(mensagemFinal(porcentagem));
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

    private static Questao[] criarQuestoes() {
        Questao[] lista = new Questao[15];

        lista[0] = nova("Qual tipo primitivo do Java armazena números inteiros de 32 bits?",
                "byte", "short", "int", "long", "float", "C");

        lista[1] = nova("Qual palavra-chave é usada para criar um novo objeto em Java?",
                "this", "new", "class", "static", "void", "B");

        lista[2] = nova("Qual é o resultado da expressão 10 / 4 quando os dois valores são do tipo int?",
                "2", "2.5", "3", "2.0", "Dá erro de compilação", "A");

        lista[3] = nova("Qual estrutura de repetição executa o bloco pelo menos uma vez, testando a condição só no final?",
                "for", "while", "foreach", "if", "do-while", "E");

        lista[4] = nova("Qual é o índice do primeiro elemento de um array em Java?",
                "1", "-1", "2", "0", "Depende do tipo do array", "D");

        lista[5] = nova("Qual método serve como ponto de entrada de um programa Java?",
                "start", "init", "main", "run", "execute", "C");

        lista[6] = nova("Qual modificador de acesso permite que um atributo seja usado apenas dentro da própria classe?",
                "private", "public", "protected", "static", "final", "A");

        lista[7] = nova("Qual operador compara se dois valores primitivos são iguais?",
                "=", ":=", "===", "equals", "==", "E");

        lista[8] = nova("Qual é a forma correta de comparar o conteúdo de duas Strings?",
                "Usando o operador ==", "Usando o método equals()", "Usando o operador =",
                "Usando o método length()", "Usando o método compare()", "B");

        lista[9] = nova("Qual comando encerra imediatamente um laço de repetição?",
                "stop", "exit", "continue", "break", "skip", "D");

        lista[10] = nova("Como se obtém a quantidade de elementos de um array chamado numeros?",
                "numeros.size()", "numeros.length()", "numeros.length", "numeros.count", "len(numeros)", "C");

        lista[11] = nova("Qual palavra-chave indica que uma classe herda de outra?",
                "extends", "implements", "inherits", "super", "import", "A");

        lista[12] = nova("Qual é o valor padrão de um atributo int que não foi inicializado?",
                "null", "0", "1", "-1", "Indefinido", "B");

        lista[13] = nova("Qual classe é usada neste projeto para ler dados digitados no teclado?",
                "Reader", "Input", "Console", "Keyboard", "Scanner", "E");

        lista[14] = nova("Qual é o resultado de 7 % 3?",
                "0", "2", "2.33", "1", "3", "D");

        return lista;
    }
}
