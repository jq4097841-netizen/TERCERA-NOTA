public class ejercicio4 {
    public class IncrementarValor {

    public static int incrementar(int x) {
        x = x + 1;
        System.out.println("Dentro del método: x = " + x);
        return x;
    }

    public static void main(String[] args) {
        int x = 5;

        System.out.println("Antes de llamar al método: x = " + x);

        // Se llama al método pero se ignora el valor retornado
        incrementar(x);
        System.out.println("Después de llamar sin usar el retorno: x = " + x);

        x = incrementar(x);
        System.out.println("Después de asignar el valor retornado: x = " + x);
    }
}
}
