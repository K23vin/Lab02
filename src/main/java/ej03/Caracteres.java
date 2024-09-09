package ej03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Caracteres {
    public static void main(String[] args){
        Opera calculos = new Opera();
     Scanner scanner2 = new Scanner(System.in);
      System.out.println("Introduzca una linea de caracteres:");
    
        String linea = scanner2.nextLine();
       
        // cuenta la frecuencia de los caracteres
        Map<Character, Integer> frecuencia = new HashMap<>();
        for (char c : linea.toCharArray()) {
            frecuencia.put(c, frecuencia.getOrDefault(c, 0) + 1);
        }

        // Encontra la frecuencia
        char caracterMasFrecuente = calculos.frecuencia(frecuencia);

        // Cambia las vocales por caracteres
        String resultadoSustitucion = calculos.sustituirvocales(linea, caracterMasFrecuente);

        // Intercambia el orden de las letras
        String resultadoFinal = calculos.invertirorden(resultadoSustitucion);

        System.out.println("Resultado final: "+resultadoFinal);

        scanner2.close();
}}
