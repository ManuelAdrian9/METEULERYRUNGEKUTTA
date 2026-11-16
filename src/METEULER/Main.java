package METEULER;

public class Main {
    public static void main(String[] args) {
        // Condiciones iniciales y frontera
        double x0 = 0.0;
        double y0 = 1.0;
        double xFinal = 0.3;

        // Arreglo con los tamaños de paso solicitados en la nota experimental
        double[] pasosH = {0.1, 0.05, 0.01};

        // Ejecutar el método para cada tamaño de paso automáticamente
        for (double h : pasosH) {
            METODOEULER.resolver(x0, y0, h, xFinal);
        }
    }
}
