public class curso {

    private String nombre;
    private materia materia1;
    private materia materia2;
    private materia materia3;

    public curso() {}

    public curso(String nombre, materia m1, materia m2, materia m3) {
        this.nombre = nombre;
        this.materia1 = new materia(m1);
        this.materia2 = new materia(m2);
        this.materia3 = new materia(m3);
    }

    public curso(curso c) {
        this.nombre = c.nombre;
        this.materia1 = new materia(c.materia1);
        this.materia2 = new materia(c.materia2);
        this.materia3 = new materia(c.materia3);
    }

    public int calcularCreditosTotales() {
        return materia1.getCreditos() + 
               materia2.getCreditos() + 
               materia3.getCreditos();
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
}
