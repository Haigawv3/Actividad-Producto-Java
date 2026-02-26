package biblioteca;

import java.time.LocalDate;

public class Prestamo {

    private Libro libro;
    private Usuario usuario;
    private LocalDate fecha;

    public Prestamo(Libro libro, Usuario usuario) {
        this.libro = libro;
        this.usuario = usuario;
        this.fecha = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Libro: " + libro.getTitulo() +
                " | Usuario: " + usuario.getNombre() +
                " | Fecha: " + fecha;
    }
}