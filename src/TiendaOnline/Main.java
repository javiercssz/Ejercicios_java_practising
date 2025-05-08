package TiendaOnline;

import java.util.Collections;

public class Main {
    public static void main(String[] args){
        Tienda tienda = new Tienda();

        //Creo los productos
        ProductoImpl producto1 = new ProductoImpl();
        ProductoImpl producto2 = new ProductoImpl();
        ProductoImpl producto3 = new ProductoImpl();

        //les doy un valor
        producto1.setNombre("lavadora");
        producto1.setPrecio(700);
        producto1.setAnioLanzamiento(2024);

        producto2.setNombre("iphone7");
        producto2.setPrecio(700);
        producto2.setAnioLanzamiento(2025);

        producto3.setNombre("sofa");
        producto3.setPrecio(900);
        producto3.setAnioLanzamiento(2026);


        //Comprobando métodos
        producto1.aplicarDescuento(10);
        producto1.esProductoPopular();

        //agrego el producto a la tienda
        tienda.agregarProductos(producto1);
        tienda.agregarProductos(producto2);
        tienda.agregarProductos(producto3);

        //Comparable
        Collections.sort(tienda.productosTienda);
    }
}
