public class Fibonnaci {
    public static boolean pertenceFibonacci(long num) {
        if (num < 0) {
            return false; // Negativos não pertencem à sequência de Fibonacci
        }

        // Inicia a sequência de Fibonacci
        long a = 0;
        long b = 1;

        // Se o número é 0 ou 1, pertence à sequência
        if (num == a || num == b) {
            return true;
        }

        // Calcula a sequência até encontrar o número ou ultrapassar
        while (b < num) {
            long temp = a;
            a = b;
            b = temp + b;
        }

        // Verifica se encontramos o número
        return b == num;
    }
}
