package Prueba;
import java.util.Arrays;

public class Prueba_4 {
	public static double logNaturalAproximado(double x) {
        if (x <= 0) return Double.NaN; // El logaritmo no está definido para x <= 0

        // Reducción de rango para mejorar la convergencia cuando x > 2
        int k = 0;
        while (x > 2.0) {
            x /= Math.E; // Mantiene x cerca de 1
            k++;
        }

        // Cambio de variable: z = (x - 1) / (x + 1)
        double z = (x - 1) / (x + 1);
        double z2 = z * z;
        double suma = 0.0;
        double termino = z;

        // Suma de la serie para ln((1+z)/(1-z)) = 2 * (z + z^3/3 + z^5/5 + ...)
        for (int i = 1; i <= 100; i += 2) {
            suma += termino / i;
            termino *= z2;
        }

        return 2 * suma + k;
    }

    public static double[] calcularLogaritmoArray(double[] numeros) {
        double[] resultado = new double[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            resultado[i] = logNaturalAproximado(numeros[i]);
        }
        return resultado;
    }

    public static void main(String[] args) {
        double[] entrada = {1.0, 2.0, 10.0, 100.0};
        double[] resultado = calcularLogaritmoArray(entrada);

        System.out.println("Arreglo original: " + Arrays.toString(entrada));
        System.out.println("Logaritmo aproximado: " + Arrays.toString(resultado));
    }
}
