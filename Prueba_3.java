package Prueba;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
public class Prueba_3 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese el número de filas (m): ");
	        int m = scanner.nextInt();

	        System.out.print("Ingrese el número de columnas (n): ");
	        int n = scanner.nextInt();

	        char[][] matriz = new char[m][n];

	        for (int i = 0; i < m; i++) {
	            Arrays.fill(matriz[i], ' ');
	        }

	        int filaActual = 0;
	        int direccion = 1;

	        for (int j = 0; j < n; j++) {
	            matriz[filaActual][j] = 'X';
	            if (filaActual + 1 < m) {
	                matriz[filaActual + 1][j] = 'X';
	            }

	            if (filaActual + direccion >= m - 1 || filaActual + direccion < 0) {
	                direccion *= -1;
	            } else {
	                filaActual += direccion;
	            }
	        }

	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.print("[" + matriz[i][j] + "]");
	            }
	            System.out.println();
	        }
	    }
	}