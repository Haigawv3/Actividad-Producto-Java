package biblioteca;

public class Libro {

    private int id;
    private String titulo;
    private String autor;
    private int ejemplaresDisponibles;

    public Libro(int id, String titulo, String autor, int ejemplaresDisponibles) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplaresDisponibles = ejemplaresDisponibles;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean estaDisponible() {
        return ejemplaresDisponibles > 0;
    }

    public void prestar() {
        ejemplaresDisponibles--;
    }

    public void devolver() {
        ejemplaresDisponibles++;
    }

    public int getEjemplaresDisponibles() {
        return ejemplaresDisponibles;
    }

    @Override
    public String toString() {
        return id + " - " + titulo + " | Autor: " + autor +
                " | Disponibles: " + ejemplaresDisponibles;
    }
}