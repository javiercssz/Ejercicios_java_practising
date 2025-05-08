package TiendaOnline;

public interface Producto {
    boolean aplicarDescuento(double porcentaje);
    double obtenerPrecioConIVA(double porcentajeIVA);
    String obtenerResumen();
    boolean esProductoPopular();

}
