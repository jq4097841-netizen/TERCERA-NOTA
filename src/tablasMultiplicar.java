import java.util.Scanner;

public class tablasMultiplicar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número n: ");
        int n = sc.nextInt();

        for (int tabla = 1; tabla <= n; tabla++) {
            System.out.println("Tabla del " + tabla);
            for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
                System.out.println(tabla + " x " + multiplicador + " = " + (tabla * multiplicador));
            }
            System.out.println();
        }

        sc.close();
    }
}

