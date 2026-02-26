package biblioteca;

import java.util.ArrayList;

public class Usuario extends Persona {

    private ArrayList<Prestamo> prestamos;

    public Usuario(int id, String nombre) {
        super(id, nombre);
        prestamos = new ArrayList<>();
    }

    public boolean puedePrestar() {
        return prestamos.size() < 2;
    }

    public void agregarPrestamo(Prestamo p) {
        prestamos.add(p);
    }

    public void mostrarPrestamos() {
        if (prestamos.isEmpty()) {
            System.out.println("No tiene préstamos.");
        } else {
            for (Prestamo p : prestamos) {
                System.out.println(p);
            }
        }
    }

    @Override
    public String getTipo() {
        return "Usuario";
    }
}