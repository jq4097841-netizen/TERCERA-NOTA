class Estudiante {
    private String nombre;
    private String codigo;
    private double nota1;
    private double nota2;
    private double nota3;

    public Estudiante(String nombre, String codigo, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public double calcularPromedio() {
        return (nota1 + nota2 + nota3) / 3.0;
    }

    public boolean estaAprobado() {
        return calcularPromedio() >= 3.0;
    }
}

public class PruebaEstudiante {

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Laura Gómez", "A001", 4.0, 3.5, 4.5);
        Estudiante e2 = new Estudiante("Carlos Pérez", "A002", 2.0, 3.0, 2.5);

        mostrarResultado(e1);
        System.out.println();
        mostrarResultado(e2);
    }

    public static void mostrarResultado(Estudiante e) {
        System.out.println("Nombre: " + e.getNombre());
        System.out.println("Código: " + e.getCodigo());
        System.out.printf("Promedio: %.2f%n", e.calcularPromedio());
        if (e.estaAprobado()) {
            System.out.println("Estado: Aprobó");
        } else {
            System.out.println("Estado: Reprobó");
        }
    }
}
