public class FuncionSort {
    
    public static Double[] bubbleSort(Double[] xDoubles){
        int n = xDoubles.length;
        for (int z = 0; z < n; z++){
            for(int j = 0; j < n - z - 1 ; j++){
                if(xDoubles[j] > xDoubles[j + 1]){
                    double temp = xDoubles[j];
                    xDoubles[j] = xDoubles[j + 1];
                    xDoubles[j + 1] = temp; 
                }
            }
        }
        return xDoubles;
    }

    public static Double[] insertioSort(Double[] x){
        int n = x.length;
        for(int z = 1; z < n; z++){
            double key = x[z];
            int j = z - 1;
            while(j >= 0 && x[j] > key){
                x[j + 1] = x[j];
                j--;
            }
            x[j + 1] = key;
        }
        return x;
    }

    public static Double[] selectionSort(Double[] array) {
        int n = array.length;
    
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            double temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        
        return array; 
    }
    

    public static Double[] mergeSort(Double[] array) {
        if (array.length < 2) {
            return array;
        }
        
        int mid = array.length / 2;
        Double[] left = new Double[mid];
        Double[] right = new Double[array.length - mid];
        
        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);
    
        mergeSort(left);
        mergeSort(right);
    
        merge(array, left, right);
    
        return array;  
    }
    
    private static void merge(Double[] array, Double[] left, Double[] right) {
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

}