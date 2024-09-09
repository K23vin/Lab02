/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej04;

public class ORDBurbuja {
     public static void main(String[] args){
    int[] tamano = {100, 500, 1000, 5000, 10000};
    Orden calculos = new Orden();
        for (int largo : tamano) {
            double[] arreglo = calculos.random(largo);
            
            long startTime, endTime;
            long bubbletiempo;

            double[] copia = arreglo.clone();
            startTime = System.nanoTime();
            calculos.bubble(copia);
            endTime = System.nanoTime();
            bubbletiempo = (endTime - startTime)/1000;
            

            
            System.out.print("tamano arreglo " +largo+"\nbubble:  "+bubbletiempo+"  microsegundos\n" );
            
}}}
