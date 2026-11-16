package METEULER;

public class METODOEULER {
    // Evalúa la ecuación diferencial f(x, y) = x - y
    public static double evaluarFuncion(double x, double y) {
        return x - y;
    }

    // Evalúa la solución analítica exacta y(x) = x - 1 + 2e^(-x)
    public static double solucionExacta(double x) {
        return x - 1.0 + 2.0 * Math.exp(-x);
    }

    // Ejecuta el algoritmo de Euler para un tamaño de paso h dado
    public static void resolver(double x0, double y0, double h, double xFinal) {
        int nPasos = (int) Math.round((xFinal - x0) / h);
        double x = x0;
        double y = y0;

        System.out.println("\n=== RESULTADOS PARA h = " + h + " ===");
        System.out.println("n\t x_n\t y_n (Euler)\t y_n (Exacta)\t Error Abs.");
        System.out.println("------------------------------------------------------------");
        System.out.printf("%d\t %.4f\t %.6f\t %.6f\t %.6f\n", 0, x, y, solucionExacta(x), 0.0);

        for (int i = 0; i < nPasos; i++) {
            double pendiente = evaluarFuncion(x, y);
            y = y + h * pendiente;
            x = x + h;

            double yExacta = solucionExacta(x);
            double errorAbsoluto = Math.abs(yExacta - y);

            System.out.printf("%d\t %.4f\t %.6f\t %.6f\t %.6f\n", (i + 1), x, y, yExacta, errorAbsoluto);
        }
    }
}
