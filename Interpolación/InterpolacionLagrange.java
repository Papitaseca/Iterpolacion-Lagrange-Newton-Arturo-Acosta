package Interpolación;

/**
 * Implementación del método de interpolación polinomial de Lagrange.
 */
public class InterpolacionLagrange {

    private static void validarDatos(double[] x, double[] y) {
        if (x == null || y == null || x.length == 0 || y.length == 0) {
            throw new IllegalArgumentException(
                    "Los arreglos no pueden ser nulos ni estar vacíos.");
        }
        if (x.length != y.length) {
            throw new IllegalArgumentException(
                    "Los arreglos x y y deben tener el mismo tamaño.");
        }
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] == x[j]) {
                    throw new IllegalArgumentException(
                            "Nodos de x repetidos: " + x[i]);
                }
            }
        }
    }

    /**
     * Evalúa el polinomio interpolador de Lagrange en xEval.
     *
     * @param x nodos de interpolación
     * @param y valores de la función en los nodos
     * @param xEval punto donde se evalúa el polinomio
     * @return valor interpolado
     */
    public static double interpolacionLagrange(double[] x, double[] y, double xEval) {
        validarDatos(x, y);
        double resultado = 0.0;
        int n = x.length;

        for (int i = 0; i < n; i++) {
            double termino = y[i];
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    // L_i(x) = producto (xEval - x[j]) / (x[i] - x[j])
                    termino *= (xEval - x[j]) / (x[i] - x[j]);
                }
            }
            resultado += termino;
        }
        return resultado;
    }
}
