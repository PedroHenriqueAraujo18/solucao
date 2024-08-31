public class Inverted {
    public static String inverterString(String str) {
        // Converter a string em um array de caracteres
        char[] caracteres = str.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;

        // Trocar os caracteres nas extremidades até o meio
        while (inicio < fim) {
            // Trocar caracteres
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;

            // Avançar e retroceder os índices
            inicio++;
            fim--;
        }

        // Converter o array de volta para uma string
        return new String(caracteres);
    }
}
