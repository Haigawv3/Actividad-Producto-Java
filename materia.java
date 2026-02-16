public class materia {

    private String nombre;
    private String clave;
    private int creditos;
    private int horasSemanales;

    // Constructor por defecto
    public materia() {
        nombre = "";
        clave = "";
        creditos = 0;
        horasSemanales = 0;
    }

    // Constructor con parámetros
    public materia(String nombre, String clave, int creditos, int horasSemanales) {
        this.nombre = nombre;
        this.clave = clave;
        this.creditos = creditos;
        this.horasSemanales = horasSemanales;
    }

    // Constructor copia
    public materia(materia m) {
        this.nombre = m.nombre;
        this.clave = m.clave;
        this.creditos = m.creditos;
        this.horasSemanales = m.horasSemanales;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getClave() { return clave; }
    public void setClave(String clave) { this.clave = clave; }

    public int getCreditos() { return creditos; }
    public void setCreditos(int creditos) { this.creditos = creditos; }

    public int getHorasSemanales() { return horasSemanales; }
    public void setHorasSemanales(int horasSemanales) { this.horasSemanales = horasSemanales; }
}
