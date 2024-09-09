/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class CalculosEstadisticos {
   public static void main(String[] args) {
        //primer programa 

        Scanner scanner = new Scanner(System.in);
        
        Random random = new Random();
        Calculos calculos = new Calculos();
        
        
        System.out.print("Ingrese lo grande del arreglo: ");
        int tamaño = scanner.nextInt();
        if (tamaño <= 0) {
            System.out.println("lo grande del arreglo debe ser mayor que 0.");
            return;
        }

        
        int[] arreglo = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            arreglo[i] = random.nextInt(100); 
        }

        System.out.println("Arreglo generado: " + Arrays.toString(arreglo));

      
        double media = calculos.media(arreglo);
        double mediana = calculos.mediana(arreglo);
        double varianza = calculos.varianza(arreglo, media);
        double desviacionEstandar = Math.sqrt(varianza);
        int moda = calculos.moda(arreglo);

        
        System.out.println("Media: " + media);
        System.out.println("Mediana: " + mediana);
        System.out.println("Varianza: " + varianza);
        System.out.println("Desviacion Estandar: " + desviacionEstandar);
        System.out.println("Moda: " + moda); 
}}
