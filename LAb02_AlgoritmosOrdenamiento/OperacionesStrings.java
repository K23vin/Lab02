import java.util.Scanner;

public class OperacionesStrings {
    private String texto;
    private String newopString;
    private char repeated;

    public OperacionesStrings() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\tEjercicio 2.");
        System.out.print("Ingrese una cadena de texto: ");
        texto = entrada.nextLine();
        newopString = texto.toLowerCase();
        repeated = repeatedChar();
        System.out.println("Reemplazando vocales por el caracter mas repetido: " + replaceVowels());
        System.out.println("texto invertido: " + reverseString());

        entrada.close();

    }

    private char repeatedChar() {
        int[] cadena = new int[256];
        int Maxcontain = 0;
        char count = newopString.charAt(0);

        for (int n = 0; n < texto.length(); n++) {
            char c = newopString.charAt(n);
            cadena[c]++;

            if (cadena[c] > Maxcontain) {
                Maxcontain = cadena[c];
                count = c;
            }
        }

        return count;
    }

    private String replaceVowels() {
        StringBuilder result = new StringBuilder();
        if (!"aeiou".contains(String.valueOf(repeated))) {
            return "No hay vocales repetidas en la cadena.";
        }

        for (char n : newopString.toCharArray()) {
            if ("aeiou".indexOf(n) != -1) {
                result.append(repeated);
            } else {
                result.append(n);
            }
        }

        return result.toString();
    }

    private String reverseString() {
        String empty = "";

        for (int n = newopString.length() - 1; n >= 0; n--) {
            empty += newopString.charAt(n);
        }
        return empty;
    }

}
