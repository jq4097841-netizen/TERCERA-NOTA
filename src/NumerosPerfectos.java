import java.util.Scanner;

public class NumerosPerfectos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Ingresa un número n (mayor que 0): ");
            n = sc.nextInt();
            if (n < 1) {
                System.out.println("El número debe ser mayor que 0.");
            }
        } while (n < 1);

        int total = 0;

        System.out.print("Números perfectos: ");
        for (int candidato = 1; candidato <= n; candidato++) {
            int suma = 0; // se reinicia en cada candidato

            for (int i = 1; i < candidato; i++) {
                if (candidato % i == 0) {
                    suma += i;
                }
            }

            if (suma == candidato) {
                System.out.print(candidato + " ");
                total++;
            }
        }
        System.out.println();
        System.out.println("Total: " + total);

        sc.close();
    }
}