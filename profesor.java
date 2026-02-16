public class profesor {

    private String nombre;
    private String numeroNomina;
    private double sueldoHora;
    private materia materia;

    public profesor() {}

    public profesor(String nombre, String nomina, double sueldoHora, materia materia) {
        this.nombre = nombre;
        this.numeroNomina = nomina;
        this.sueldoHora = sueldoHora;
        this.materia = materia;
    }

    public profesor(profesor p) {
        this.nombre = p.nombre;
        this.numeroNomina = p.numeroNomina;
        this.sueldoHora = p.sueldoHora;
        this.materia = p.materia;
    }

    public double calcularSueldoSemanal() {
        if (materia == null) return 0;
        return sueldoHora * materia.getHorasSemanales();
    }
}
