public class ejercicio {
    public class ModificarCadena {

    // Intenta modificar la cadena, pero solo afecta a la referencia local
    public static void modificarCadena(String texto) {
        texto = texto + " Mundo";
        texto = texto.toUpperCase();
        System.out.println("Dentro del método: " + texto);
    }

    public static void main(String[] args) {
        String saludo = "Hola";

        System.out.println("Antes de llamar al método: " + saludo);

        modificarCadena(saludo);

        System.out.println("Después de llamar al método: " + saludo);
    }
}
}
