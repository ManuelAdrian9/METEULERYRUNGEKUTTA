package METRUNGEKUTTA;

public class Main {
    public static void main(String[] args) {
        // Condiciones iniciales y parámetros del problema
        double x0 = 0.0;
        double y0 = 1.0;
        double h = 0.1;
        double xFinal = 0.3;

        // Invocación del método modular RK4
        System.out.println("=== RESOLUCIÓN DE EDO CON RUNGE-KUTTA 4TO ORDEN ===\n");
        MetodoRungeKutta.resolverEDO(x0, y0, h, xFinal);
    }
}
