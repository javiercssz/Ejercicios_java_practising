package TiendaOnline;

import java.util.Collections;

public class Main {
    public static void main(String[] args){
        Tienda tienda = new Tienda();

        //Creo los productos
        ProductoImpl producto1 = new ProductoImpl();
        ProductoImpl producto2 = new ProductoImpl();
        ProductoImpl producto3 = new ProductoImpl();
        ProductoImpl producto4 = new ProductoImpl();
        ProductoImpl producto5 = new ProductoImpl();

        //les doy un valor
        producto1.setNombre("lavadora");
        producto1.setPrecio(900);
        producto1.setAnioLanzamiento(2024);
        producto1.setVentas(8);
        producto1.setUmbralVentas(7);

        producto2.setNombre("iphone7");
        producto2.setPrecio(900);
        producto2.setAnioLanzamiento(2025);
        producto2.setVentas(7);
        producto2.setUmbralVentas(9);

        producto3.setNombre("sofa");
        producto3.setPrecio(900);
        producto3.setAnioLanzamiento(2026);
        producto3.setVentas(6);
        producto3.setUmbralVentas(3);

        producto4.setNombre("contenedor");
        producto4.setPrecio(450);
        producto4.setAnioLanzamiento(2001);
        producto4.setVentas(6);
        producto4.setUmbralVentas(3);

        producto5.setNombre("ordenador");
        producto5.setPrecio(450);
        producto5.setAnioLanzamiento(1980);
        producto5.setVentas(1000);
        producto5.setUmbralVentas(1100);


        //Comprobando métodos
        producto1.aplicarDescuento(10);
        producto1.esProductoPopular();

        //agrego el producto a la tienda
        tienda.agregarProductos(producto1);
        tienda.agregarProductos(producto2);
        tienda.agregarProductos(producto3);
        tienda.agregarProductos(producto4);
        tienda.agregarProductos(producto5);

        //Comparable
        Collections.sort(tienda.productosTienda);

        for(ProductoImpl p : tienda.productosTienda)
        {
            System.out.println("ordenado con el comparable por precio y luego por nombre " + p);
        }
        tienda.ordenarPorNombre();

        for(ProductoImpl p : tienda.productosTienda)
        {
            System.out.println("ordenado por comparator por nombre " + p);
        }

        tienda.ordenarPorPrecio();

        for(ProductoImpl p : tienda.productosTienda)
        {
            System.out.println("ordenado por comparator por precio " + p);
        }

        tienda.ordenarPorFecha();

        for(ProductoImpl p : tienda.productosTienda)
        {
            System.out.println("ordenado por comparator por fecha " + p);
        }



    }
}
