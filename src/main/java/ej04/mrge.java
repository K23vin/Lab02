/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej04;

public class mrge {
    public static void main(String[] args){
    int[] tamano = {100, 500, 1000, 5000, 10000};
    Orden calculos = new Orden();
        for (int largo : tamano) {
            double[] arreglo = calculos.random(largo);
            
            long startTime, endTime;
            long selecciontiempo;

            double[] copia = arreglo.clone();
            startTime = System.nanoTime();
            calculos.mergeSort(copia);
            endTime = System.nanoTime();
           selecciontiempo= (endTime - startTime)/1000;
            

            
            System.out.print("tamano arreglo " +largo+"\nbubble:  "+selecciontiempo+"  microsegundos\n" );
            
}}
}
