package ej01;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Calculos {
    
    public double media(int[] arreglo) {
        double suma = 0;
        for (int num : arreglo) {
            suma += num;
        }
        //.lenght sirve para tomar el dato entero de la longitud del arreglo para utilizarlo
        return suma / arreglo.length;
    }

    public double mediana(int[] arreglo) {
        //el objeto es copia para que cada valor entero dentro de un arreglo unidimensional, aparte de tomas su longitud
        int[] copia = Arrays.copyOf(arreglo, arreglo.length);
        Arrays.sort(copia);
        int n = copia.length;
        if (n % 2 == 0) {
            return (copia[n / 2 - 1] + copia[n / 2]) / 2.0;
        } else {
            return copia[n / 2];
        }
    }

    public double varianza(int[] arreglo, double media) {
        double suma = 0;
        for (int num : arreglo) {
            suma += Math.pow(num - media, 2);
        }
        return suma / arreglo.length;
    }

    public int moda(int[] arreglo) {
        // libreria map se uso para almacenar individualmente y usar cada valor individualmente
        Map<Integer, Integer> frecuencia = new HashMap<>();
        for (int num : arreglo) {
            frecuencia.put(num, frecuencia.getOrDefault(num, 0) + 1);
        }

        int moda = arreglo[0];
        int maxFrecuencia = 0;
        for (Map.Entry<Integer, Integer> entry : frecuencia.entrySet()) {
            if (entry.getValue() > maxFrecuencia) {
                maxFrecuencia = entry.getValue();
                moda = entry.getKey();
            }
        }

        return moda;
    }
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
    
    public void bubble(double[] array) {
    int n = array.length;
       for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    public void insertion(double[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            double key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
    
    public void seleccion(double[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }
            double temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }
    }
    
    public void mergeSort(double[] array) {
        if (array.length < 2) return;
        int mid = array.length / 2;
        double[] left = new double[mid];
        double[] right = new double[array.length - mid];

        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);

        mergeSort(left);
        mergeSort(right);

        merge(array, left, right);
    }
    public void merge(double[] array, double[] left, double[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        while (i < left.length) {
            array[k++] = left[i++];
        }

        while (j < right.length) {
            array[k++] = right[j++];
        }
    }
    public double[] random(int size) {
        Random rand = new Random();
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextDouble() * 1000; 
        }
        return array;
    }
}