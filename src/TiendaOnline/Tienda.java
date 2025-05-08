package TiendaOnline;

import java.util.ArrayList;

public class Tienda {
    ArrayList<ProductoImpl> productosTienda = new ArrayList<>();

    public void agregarProductos(ProductoImpl producto) {
        productosTienda.add(producto);
        System.out.println("el producto " + producto + " ha sido agregado correctamente");
    }
}
