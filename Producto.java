public class Producto {

    // Atributos privados
    private String descripcion;
    private String codigo;
    private String tipo;
    private Double costo;
    private Double impuesto;

    // Métodos GET
    public String getDescripcion() {
        return descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public Double getCosto() {
        return costo;
    }

    public Double getImpuesto() {
        return impuesto;
    }

    // Métodos SET
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public void setImpuesto(Double impuesto) {
        this.impuesto = impuesto;
    }

    // Método para mostrar datos del producto
    public void muestraProducto() {
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Codigo: " + codigo);
        System.out.println("Tipo: " + tipo);
        System.out.println("Costo: $" + costo);
        System.out.println("Impuesto: " + impuesto + "%");
    }

    // Método funcional para calcular precio
    public double calcularPrecio(double utilidad) {

        double precioAntesImpuesto = costo + (costo * utilidad / 100);
        double precioFinal = precioAntesImpuesto + (precioAntesImpuesto * impuesto / 100);

        return precioFinal;
    }
}
