package ej04;

import java.util.Random;
public class Organizar {
    
   
    
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