package Interpolación;

/**
 * Programa principal para comparar Lagrange y Newton con los mismos datos.
 */
public class Main {
    public static void main(String[] args) {
        // Datos de prueba: (1, 2), (2, 3), (4, 10)
        double[] x = {1.0, 2.0, 4.0};
        double[] y = {2.0, 3.0, 10.0};
        double xEval = 3.0;

        // Método de Newton: tabla, coeficientes y evaluación.
        double[][] tablaDiferencias =
                InterpolacionNewton.calcularDiferenciasDivididas(x, y);
        InterpolacionNewton.imprimirTabla(x, tablaDiferencias);

        System.out.println("\n--- COEFICIENTES DEL POLINOMIO DE NEWTON ---");
        for (int k = 0; k < x.length; k++) {
            System.out.printf("a_%d = %.4f%n", k, tablaDiferencias[0][k]);
        }

        double resultadoNewton =
                InterpolacionNewton.evaluarPolinomio(x, tablaDiferencias, xEval);
        double resultadoLagrange =
                InterpolacionLagrange.interpolacionLagrange(x, y, xEval);

        System.out.println("\n--- RESULTADOS DE LA INTERPOLACIÓN ---");
        System.out.printf("Lagrange: P(%.2f) = %.6f%n", xEval, resultadoLagrange);
        System.out.printf("Newton:   P(%.2f) = %.6f%n", xEval, resultadoNewton);
        System.out.printf("Diferencia absoluta: %.12f%n",
                Math.abs(resultadoLagrange - resultadoNewton));
    }
}
