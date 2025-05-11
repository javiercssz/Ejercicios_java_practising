package TiendaOnline;

import java.util.ArrayList;
import java.util.Collections;

public class Tienda implements Ordenable{
    ArrayList<ProductoImpl> productosTienda = new ArrayList<>();
    ProductoImpl productosComparables = new ProductoImpl();
    public void agregarProductos(ProductoImpl producto) {
        productosTienda.add(producto);
        System.out.println("el producto " + producto + " ha sido agregado correctamente");
    }
    @Override
    public void ordenarPorNombre() {
        productosTienda.sort(productosComparables.comparatorNombre);
        productosTienda.toString();
    }

    @Override
    public void ordenarPorPrecio() {
        productosTienda.sort(productosComparables.comparatorPrecio);
        productosTienda.toString();

    }

    @Override
    public void ordenarPorFecha() {
        productosTienda.sort(productosComparables.comparatorFecha);
        productosTienda.toString();

    }

}

