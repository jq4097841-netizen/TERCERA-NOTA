public class IntercambioValores {

    public static void intercambiar(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("Dentro del método intercambiar: x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Antes de llamar al método: a = " + a + ", b = " + b);

        intercambiar(a, b);

        System.out.println("Después de llamar al método: a = " + a + ", b = " + b);
    }
}