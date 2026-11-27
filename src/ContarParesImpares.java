public class ContarParesImpares {

    public static void main(String[] args) {
        int[] numeros = {3, 8, 12, 7, 20, 15, 4, 9, 6, 11};

        int pares = 0;
        int impares = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);

        System.out.print("Números pares: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
            }
        }
        System.out.println();
    }
}

