public class ejercicio2 {
    class Rectangulo {
    int ancho;
    int alto;

    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "Rectangulo [ancho = " + ancho + ", alto = " + alto + "]";
    }
}

public class ModificarObjeto {

    public static void modificarRectangulo(Rectangulo r) {
        r.ancho = 50;
        r.alto = 30;
        System.out.println("Dentro del método: " + r);
    }

    public static void main(String[] args) {
        Rectangulo rect = new Rectangulo(10, 5);

        System.out.println("Antes de llamar al método: " + rect);

        modificarRectangulo(rect);

        System.out.println("Después de llamar al método: " + rect);
    }
}
}
