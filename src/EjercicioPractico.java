import java.util.Locale;

public class EjercicioPractico {

    // 1. Promedio anual
    public static double calcularPromedio(double[] t) {
        double suma = 0;
        for (int i = 0; i < t.length; i++) {
            suma += t[i];
        }
        return suma / t.length;
    }

    // 2. Índice de la temperatura mayor
    public static int indiceMayor(double[] t) {
        int indice = 0;
        for (int i = 1; i < t.length; i++) {
            if (t[i] > t[indice]) {
                indice = i;
            }
        }
        return indice;
    }

    // 2. Índice de la temperatura menor
    public static int indiceMenor(double[] t) {
        int indice = 0;
        for (int i = 1; i < t.length; i++) {
            if (t[i] < t[indice]) {
                indice = i;
            }
        }
        return indice;
    }

    // 3. Cuenta y muestra los meses por encima del promedio
    public static void mostrarSobrePromedio(double[] t, String[] meses) {
        double promedio = calcularPromedio(t);

        int cantidad = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] > promedio) {
                cantidad++;
            }
        }

        System.out.print("Meses sobre el promedio (" + cantidad + "): ");
        boolean primero = true;
        for (int i = 0; i < t.length; i++) {
            if (t[i] > promedio) {
                if (!primero) {
                    System.out.print(", ");
                }
                System.out.print(meses[i]);
                primero = false;
            }
        }
        System.out.println();
    }

    // 4. Nuevo arreglo con las temperaturas en Fahrenheit
    public static double[] convertirAFahrenheit(double[] t) {
        double[] f = new double[t.length];
        for (int i = 0; i < t.length; i++) {
            f[i] = t[i] * 9 / 5 + 32;
        }
        return f;
    }

    public static void main(String[] args) {
        double[] temperaturas = {28.5, 29.0, 30.2, 31.5, 30.8, 29.9, 29.5, 30.1, 30.6, 29.7, 28.9, 28.2};
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                          "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        // 1
        System.out.printf(Locale.US, "Promedio anual: %.2f °C%n", calcularPromedio(temperaturas));

        // 2
        int iMayor = indiceMayor(temperaturas);
        int iMenor = indiceMenor(temperaturas);
        System.out.println("Mes más caliente: " + meses[iMayor] + " (" + temperaturas[iMayor] + " °C)");
        System.out.println("Mes más frío: " + meses[iMenor] + " (" + temperaturas[iMenor] + " °C)");

        // 3
        mostrarSobrePromedio(temperaturas, meses);

        // 4
        double[] fahrenheit = convertirAFahrenheit(temperaturas);
        for (int i = 0; i < fahrenheit.length; i++) {
            System.out.printf(Locale.US, "%s: %.1f °F%n", meses[i], fahrenheit[i]);
        }
    }
}
