import java.util.Arrays;

public class ModificarArray {

    // Recibe una referencia al array y modifica sus valores (duplica cada elemento)
    public static void modificarArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
        System.out.println("Dentro del método: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        System.out.println("Antes de llamar al método: " + Arrays.toString(numeros));

        modificarArray(numeros);

        System.out.println("Después de llamar al método: " + Arrays.toString(numeros));
    }
}