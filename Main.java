import java.util.Scanner;

public class Main {

    // Método estático para comparar productos
    public static String compararProductos(Producto p1, Producto p2, double utilidad) {

        double precio1 = p1.calcularPrecio(utilidad);
        double precio2 = p2.calcularPrecio(utilidad);

        if (precio1 > precio2) {
            return "El producto con mayor precio es: " + p1.getDescripcion() +
                    " con precio $" + precio1;
        } else if (precio2 > precio1) {
            return "El producto con mayor precio es: " + p2.getDescripcion() +
                    " con precio $" + precio2;
        } else {
            return "Ambos productos tienen el mismo precio.";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Producto producto1 = new Producto();
        Producto producto2 = new Producto();

        double utilidad = 0;

        try {

            System.out.println("=== Captura Producto 1 ===");

            System.out.print("Descripcion: ");
            producto1.setDescripcion(sc.nextLine());

            System.out.print("Codigo: ");
            producto1.setCodigo(sc.nextLine());

            System.out.print("Tipo: ");
            producto1.setTipo(sc.nextLine());

            System.out.print("Costo: ");
            producto1.setCosto(Double.parseDouble(sc.nextLine()));

            System.out.print("Impuesto (%): ");
            producto1.setImpuesto(Double.parseDouble(sc.nextLine()));


            System.out.println("\n=== Captura Producto 2 ===");

            System.out.print("Descripcion: ");
            producto2.setDescripcion(sc.nextLine());

            System.out.print("Codigo: ");
            producto2.setCodigo(sc.nextLine());

            System.out.print("Tipo: ");
            producto2.setTipo(sc.nextLine());

            System.out.print("Costo: ");
            producto2.setCosto(Double.parseDouble(sc.nextLine()));

            System.out.print("Impuesto (%): ");
            producto2.setImpuesto(Double.parseDouble(sc.nextLine()));

            System.out.print("\nPorcentaje de utilidad: ");
            utilidad = Double.parseDouble(sc.nextLine());

        } catch (Exception e) {
            System.out.println("Error en la entrada de datos.");
            return;
        }

        // Mostrar productos
        System.out.println("\n--- Producto 1 ---");
        producto1.muestraProducto();

        System.out.println("\n--- Producto 2 ---");
        producto2.muestraProducto();

        // Comparación
        String resultado = compararProductos(producto1, producto2, utilidad);
        System.out.println("\n" + resultado);
    }
}
