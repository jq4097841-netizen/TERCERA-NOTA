import java.util.Arrays;

public class Burbuja {

    // Ordena el array de menor a mayor con el método de la burbuja
    public static void ordenarBurbuja(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numeros = {9, 3, 7, 1, 8, 2, 6, 4};

        System.out.println("Antes:   " + Arrays.toString(numeros));

        ordenarBurbuja(numeros);

        System.out.println("Después: " + Arrays.toString(numeros));
    }
}
