package METRUNGEKUTTA;

public class MetodoRungeKutta {
    // Evaluación de la ecuación diferencial dy/dx = x + y
    public static double evaluarFuncion(double x, double y) {
        return x + y;
    }

    // Solución analítica exacta y(x) = 2e^x - x - 1
    public static double evaluarSolucionExacta(double x) {
        return 2.0 * Math.exp(x) - x - 1.0;
    }

    // Cálculo de un paso del algoritmo RK4
    public static double pasoRK4(double x, double y, double h) {
        double k1 = evaluarFuncion(x, y);
        double k2 = evaluarFuncion(x + 0.5 * h, y + 0.5 * h * k1);
        double k3 = evaluarFuncion(x + 0.5 * h, y + 0.5 * h * k2);
        double k4 = evaluarFuncion(x + h, y + h * k3);

        return y + (h / 6.0) * (k1 + 2.0 * k2 + 2.0 * k3 + k4);
    }

    // Método modular para ejecutar toda la simulación y mostrar la tabla
    public static void resolverEDO(double x0, double y0, double h, double xFinal) {
        int nPasos = (int) Math.round((xFinal - x0) / h);
        double x = x0;
        double y = y0;

        System.out.println("n\t x_n\t y_n (RK4)\t y_n (Exacta)\t Error Abs.");
        System.out.println("------------------------------------------------------------------");

        double yExacta = evaluarSolucionExacta(x);
        double error = Math.abs(yExacta - y);
        System.out.printf("%d\t %.4f\t %.6f\t %.6f\t %.2e\n", 0, x, y, yExacta, error);

        for (int i = 0; i < nPasos; i++) {
            y = pasoRK4(x, y, h);
            x = x + h;

            yExacta = evaluarSolucionExacta(x);
            error = Math.abs(yExacta - y);
            System.out.printf("%d\t %.4f\t %.6f\t %.6f\t %.2e\n", (i + 1), x, y, yExacta, error);
        }
    }
}
