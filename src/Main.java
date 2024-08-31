import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        /**
         * Exercício 1 - Observe o trecho de código abaixo: int INDICE = 13, SOMA = 0, K = 0;
         * Enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; }
         * Imprimir(SOMA);
         * Ao final do processamento, qual será o valor da variável SOMA?
         */
        System.out.println("==========================================");
        Soma soma = new Soma();
        System.out.println("\n " + soma.somador(13,0,0));
        System.out.println("==========================================");
        /**
         * Exercício 2 -
         * Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será
         * a soma dos 2 valores anteriores
         * (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que
         * desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma
         * mensagem avisando se o número informado pertence ou não a sequência.
         * IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua
         * preferência ou pode ser previamente definido no código;
         */
        System.out.println("==========================================");
          System.out.println(Fibonnaci.fibonnaci(13));
        System.out.println("==========================================");
        /**
         * Exerciíco 3
         * Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
         * • O menor valor de faturamento ocorrido em um dia do mês;
         * • O maior valor de faturamento ocorrido em um dia do mês;
         * • Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.
         */
        System.out.println("==========================================");
        double[] faturamento = {100, 0, 150, 80, 0, 200, 120};
        FaturamentoMensal calculadora = new FaturamentoMensal(faturamento);
        System.out.println("Menor valor de faturamento: " + calculadora.calcularMenorFaturamento());
        System.out.println("Maior valor de faturamento: " + calculadora.calcularMaiorFaturamento());
        System.out.println("Dias com faturamento acima da média: " + calculadora.calcularDiasAcimaMedia());
        System.out.println("==========================================");
    /**
     * Exercício 5
     * Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
    * • SP – R$67.836,43
    * • RJ – R$36.678,66
    * • MG – R$29.229,88
     * • ES – R$27.165,48
    * • Outros – R$19.849,53
     *
     * Escreva um programa na linguagem que desejar onde calcule
    * o percentual de representação que cada estado teve dentro do
    * valor total mensal da distribuidora.
     */
    double sp = 67836.43;
    double rj = 36678.66;
    double mg = 29229.88;
    double es = 27165.48;
    double outros = 19849.53;

    double total = sp + rj + mg + es + outros;

    double percentualSP = (sp / total) * 100;
    double percentualRJ = (rj / total) * 100;
    double percentualMG = (mg / total) * 100;
    double percentualES = (es / total) * 100;
    double percentualOutros = (outros / total) * 100;
 
        System.out.println("Percentual de representação por estado:");
        System.out.printf("SP: %.2f%%\n", percentualSP);
        System.out.printf("RJ: %.2f%%\n", percentualRJ);
        System.out.printf("MG: %.2f%%\n", percentualMG);
        System.out.printf("ES: %.2f%%\n", percentualES);
        System.out.printf("Outros: %.2f%%\n", percentualOutros);
        System.out.println("==========================================");

        /** Exercicio 4 
         *  Escreva um programa que inverta os caracteres de um string
         * IMPORTANTE:
         * a) Essa string pode ser informada através de qualquer entrada de sua preferência
         * ou pode ser previamente definida no código;
         * b) Evite usar funções prontas, como, por exemplo, reverse;
         */
        writer.write("Digite uma string:");
        writer.flush();
        String palavra = reader.readLine();
        System.out.println("Palavra: " + palavra);
        System.out.println("String invertida:" + Inverted.inverterString(palavra));
        System.out.println("==========================================");
    }
}











