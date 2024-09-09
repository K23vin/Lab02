package ej03;



import java.util.Map;

public class Operaciones {
        public char frecuencia(Map<Character, Integer> frecuencia) {
        char caractermasFrecuente = ' ';
        int maxFrecuencia = 0;
        for (Map.Entry<Character, Integer> entry : frecuencia.entrySet()) {
            if (entry.getValue() > maxFrecuencia) {
                maxFrecuencia = entry.getValue();
                caractermasFrecuente = entry.getKey();
            }
        }
        return caractermasFrecuente;
    }

    // Función para cambiar las vocales por el carácter más frecuente
    public String sustituirvocales(String texto, char sustituto) {
        return texto.replaceAll("[aeiouAEIOU]", String.valueOf(sustituto));
    }

    // Función para intercambiar el orden de las letras
    public String invertirorden(String texto) {
        return new StringBuilder(texto).reverse().toString();
    }
    
   
}