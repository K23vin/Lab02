import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Estadistica {

    private int size;
    private int[] arreglo;
    private double media;
    private double variance;

    public Estadistica() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\t\tEjercicio 1.");
        System.out.print(" " +"Ingrese el tamaño del arreglo: ");
        size = entrada.nextInt();
        arreglo_Aleatorio();
        System.out.println("\t-------------------------------");
        media = calcularMedia();
        System.out.printf("\tMedia: %.3f%n", media);
        System.out.println("\tMediana: " + calcularMediana());
        variance = calcularVarianza();
        System.out.printf("\tVarianza: %.3f%n", variance);
        System.out.printf("\tDesviacion: %.3f%n", calcularDesviacion());
        calcularModa();
        System.out.println("\t-------------------------------");

        entrada.close();
    }

    private void arreglo_Aleatorio() {
        Random chance = new Random();

        arreglo = new int[size];

        for (int n = 0; n < size; n++) {
            arreglo[n] = chance.nextInt(100);
        }

        System.out.println(" " +"Arreglo generado: " + Arrays.toString(arreglo) + "\n");
    }

    private double calcularMedia() {
        int suma = 0;
        for (int n : arreglo) {
            suma += n;
        }

        return (double) suma / arreglo.length;
    }

    private double calcularMediana() {
        Arrays.sort(arreglo);
        int mitad = arreglo.length / 2;

        if (arreglo.length % 2 == 0) {
            return (arreglo[mitad - 1] + arreglo[mitad]) / 2.0;
        } else {
            return arreglo[mitad];
        }
    }

    private double calcularVarianza() {
        Double suma = 0.0;
        for (int n : arreglo) {

            suma += Math.pow(n - media, 2);
        }

        return suma / (arreglo.length - 1);
    }

    private double calcularDesviacion() {
        return Math.sqrt(variance);
    }

    private void calcularModa(){
        int Maxcontain = 0;
        int moda = arreglo[0];
        boolean repiteids = false;

        for(int n = 0; n < arreglo.length; n++){
            int count = 0;
            for(int z = 0; z < arreglo.length; z++){
                if(arreglo[n] == arreglo[z]){
                    count ++;
                }
            }
            
            if (count > Maxcontain) {
                Maxcontain = count;
                moda = arreglo[n];
                repiteids = count > 1;
            }
        }

        if(repiteids){
            System.out.println("\tModa: " + moda);
        }
        else{
            System.out.println("\tNo hay una moda en este arreglo");
        }
    }

}
