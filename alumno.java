public class alumno {

    private String matricula;
    private String nombre;
    private int edad;
    private curso curso;

    public alumno() {}

    public alumno(String matricula, String nombre, int edad, curso curso) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    public alumno(alumno a) {
        this.matricula = a.matricula;
        this.nombre = a.nombre;
        this.edad = a.edad;
        this.curso = a.curso;
    }

    public void mostrarDatos() {
        System.out.println("alumno: " + nombre);
        System.out.println("curso: " + curso.getNombre());
    }
}
