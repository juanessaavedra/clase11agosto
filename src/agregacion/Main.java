package agregacion;

public class Main {
    public static void main(String[] args) {
        Producto pro = new Producto("Gafas", 30);
        Factura factura = new Factura("10", "11/08/23", pro); //Se le pone el nombre de la instancia (objeto) en este caso es pro, a esta factura se le agrega las gafas y el valor


    }
}
