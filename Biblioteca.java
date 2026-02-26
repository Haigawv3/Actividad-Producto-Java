package biblioteca;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> libros;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Prestamo> prestamos;

    public Biblioteca() {
        libros = new ArrayList<>();
        usuarios = new ArrayList<>();
        prestamos = new ArrayList<>();
    }

    public void registrarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro registrado correctamente.");
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario registrado correctamente.");
    }

    public Libro buscarLibro(int id) {
        for (Libro l : libros) {
            if (l.getId() == id) {
                return l;
            }
        }
        return null;
    }

    public Usuario buscarUsuario(int id) {
        for (Usuario u : usuarios) {
            if (u.getId() == id) {
                return u;
            }
        }
        return null;
    }

    public void prestarLibro(int idLibro, int idUsuario) {

        Libro libro = buscarLibro(idLibro);
        Usuario usuario = buscarUsuario(idUsuario);

        if (libro == null) {
            System.out.println("Libro no encontrado.");
            return;
        }

        if (usuario == null) {
            System.out.println("Usuario no encontrado.");
            return;
        }

        if (!usuario.puedePrestar()) {
            System.out.println("El usuario ya tiene 2 préstamos.");
            return;
        }

        if (!libro.estaDisponible()) {
            System.out.println("No hay ejemplares disponibles.");
            return;
        }

        libro.prestar();
        Prestamo p = new Prestamo(libro, usuario);
        usuario.agregarPrestamo(p);
        prestamos.add(p);

        System.out.println("Préstamo realizado con éxito.");
    }

    public void generarReporte() {
        System.out.println("\n===== REPORTE GENERAL =====");
        System.out.println("Total libros: " + libros.size());
        System.out.println("Total usuarios: " + usuarios.size());
        System.out.println("Total préstamos: " + prestamos.size());
    }

    public void mostrarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados.");
        } else {
            for (Libro l : libros) {
                System.out.println(l);
            }
        }
    }
}