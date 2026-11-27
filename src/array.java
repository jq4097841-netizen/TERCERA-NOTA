 public class array {

    public static void main(String[] args) {
        int[] numeros = {12, 7, 25, 18, 9, 14};

        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        double promedio = (double) suma / numeros.length;

        System.out.println("Suma de los elementos: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}
    

