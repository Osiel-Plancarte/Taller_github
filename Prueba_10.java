package Prueba;

import java.util.Arrays;

public class Prueba_10 {

    public static void main(String[] args) {
        int cantidadDatos = 1000000; 
        int[] arreglo = new int[cantidadDatos];
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 1000000);
        }
        
        QS(arreglo, 0, arreglo.length - 1);

        System.out.println("Resultado Quick Sort: " + Arrays.toString(arreglo));
    }

    private static int buscarPivote(int[] arr, int i, int f) {
        boolean estado = true;
        while (i != f) {
            if (arr[i] > arr[f]) {
                swap(arr, i, f);
                estado = !estado;
            }
            if (estado) {
                i++;
            } else {
                f--;
            }
        }
        return i;
    }

    private static void QS(int[] arr, int s1, int s2) {
        if (s1 < s2) {
            int pivot = buscarPivote(arr, s1, s2);
            QS(arr, s1, pivot - 1);
            QS(arr, pivot + 1, s2);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}