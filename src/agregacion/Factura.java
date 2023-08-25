package agregacion;

public class Factura {

    private String numeroFactura;
    private String fecha;

    Producto producto; //Tiene  lo de la clase producto, pero no es herencia

    public Factura(String numeroFactura, String fecha, Producto producto) {
        this.numeroFactura = numeroFactura;
        this.fecha = fecha;
        this.producto = producto;
    }
}
