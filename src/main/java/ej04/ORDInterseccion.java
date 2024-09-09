/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej04;

public class ORDInterseccion {
    public static void main(String[] args){
    int[] tamano = {100, 500, 1000, 5000, 10000};
    Orden calculos = new Orden();
        for (int largo : tamano) {
            double[] arreglo = calculos.random(largo);
            
            long startTime, endTime;
            long inserciontiempo;

            double[] copia = arreglo.clone();
            startTime = System.nanoTime();
            calculos.insertion(copia);
            endTime = System.nanoTime();
           inserciontiempo= (endTime - startTime)/1000;
            

            
            System.out.print("tamano arreglo " +largo+"\nbubble:  "+inserciontiempo+"  microsegundos\n" );
            
}}
}
