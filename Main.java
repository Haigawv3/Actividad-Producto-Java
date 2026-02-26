package biblioteca;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== SISTEMA DE BIBLIOTECA =====");
            System.out.println("1. Registrar Libro");
            System.out.println("2. Registrar Usuario");
            System.out.println("3. Prestar Libro");
            System.out.println("4. Mostrar Libros");
            System.out.println("5. Generar Reporte");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("ID Libro: ");
                    int idL = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    System.out.print("Ejemplares: ");
                    int ejemplares = sc.nextInt();

                    biblioteca.registrarLibro(new Libro(idL, titulo, autor, ejemplares));
                    break;

                case 2:
                    System.out.print("ID Usuario: ");
                    int idU = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    biblioteca.registrarUsuario(new Usuario(idU, nombre));
                    break;

                case 3:
                    System.out.print("ID Libro: ");
                    int libroId = sc.nextInt();
                    System.out.print("ID Usuario: ");
                    int usuarioId = sc.nextInt();

                    biblioteca.prestarLibro(libroId, usuarioId);
                    break;

                case 4:
                    biblioteca.mostrarLibros();
                    break;

                case 5:
                    biblioteca.generarReporte();
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}