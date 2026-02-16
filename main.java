public class main {

    public static void main(String[] args) {

        materia m1 = new materia("Matematicas", "MAT01", 8, 5);
        materia m2 = new materia("Programacion", "PRO01", 10, 6);
        materia m3 = new materia("Fisica", "FIS01", 7, 4);

        curso curso = new curso("Ingenieria", m1, m2, m3);

        profesor prof = new profesor("Carlos Lopez", "1234", 120, m2);

        alumno alumno = new alumno("A001", "Juan Perez", 20, curso);

        alumno.mostrarDatos();

        System.out.println("Creditos del curso: " + curso.calcularCreditosTotales());
        System.out.println("Sueldo profesor: " + prof.calcularSueldoSemanal());
    }
}
