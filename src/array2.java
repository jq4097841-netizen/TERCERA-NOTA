public class array2 {

    public static int buscar(int[] arr, int valor) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numeros = {8, 15, 4, 25, 31, 12, 7, 40};

        int valor1 = 25;
        int valor2 = 99;

        int posicion1 = buscar(numeros, valor1);
        if (posicion1 != -1) {
            System.out.println("El valor " + valor1 + " está en la posición " + posicion1);
        } else {
            System.out.println("El valor " + valor1 + " no se encontró en el array");
        }

        int posicion2 = buscar(numeros, valor2);
        if (posicion2 != -1) {
            System.out.println("El valor " + valor2 + " está en la posición " + posicion2);
        } else {
            System.out.println("El valor " + valor2 + " no se encontró en el array");
        }
    }
}
