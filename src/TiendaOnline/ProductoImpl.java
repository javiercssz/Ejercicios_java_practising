package TiendaOnline;

import java.util.ArrayList;
import java.util.Comparator;

public  class ProductoImpl implements Producto,Comparable<ProductoImpl>{
    private String nombre;
    private double precio;
    private int anioLanzamiento;
    private int ventas;
    private int umbralVentas;

    public ProductoImpl(String nombre, double precio, int anioLanzamiento, int ventas, int umbralVentas) {
        this.nombre = nombre;
        this.precio = precio;
        this.anioLanzamiento = anioLanzamiento;
        this.ventas = ventas;
        this.umbralVentas = umbralVentas;
    }

    public ProductoImpl() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public int getUmbralVentas() {
        return umbralVentas;
    }

    public void setUmbralVentas(int umbralVentas) {
        this.umbralVentas = umbralVentas;
    }

    @Override
    public boolean aplicarDescuento(double porcentaje) {

        if (porcentaje > 100 && porcentaje < 1) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public double obtenerPrecioConIVA(double porcentajeIVA) {
        if (porcentajeIVA > 0 && porcentajeIVA <= 100) {
            return precio * porcentajeIVA / 100;
        } else {
            return 0;
        }
    }

    @Override
    public String obtenerResumen() {
        return nombre +  " es muy buen producto";
    }

    @Override
    public boolean esProductoPopular() {
        if (ventas > umbralVentas) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int compareTo(ProductoImpl o) {
        int cmp = Double.compare(this.precio, o.precio);

        if (cmp != 0) return cmp;
        return this.nombre.compareTo(o.nombre);


    }

    Comparator<ProductoImpl> comparatorNombre = new Comparator<ProductoImpl>() {
        @Override
        public int compare(ProductoImpl o1, ProductoImpl o2) {
            return o1.getNombre().compareTo(o2.getNombre());
        }
    };

    Comparator<ProductoImpl> comparatorPrecio = new Comparator<ProductoImpl>() {
        @Override
        public int compare(ProductoImpl o1, ProductoImpl o2) {
            return Double.compare(o1.getPrecio(), o2.getPrecio());
        }
    };

    Comparator<ProductoImpl> comparatorFecha = new Comparator<ProductoImpl>() {
        @Override
        public int compare(ProductoImpl o1, ProductoImpl o2) {
            return Integer.compare(o1.anioLanzamiento, o2.anioLanzamiento);
        }
    };

    @Override
    public String toString() {
        return "ProductoImpl{" +
                "umbralVentas=" + umbralVentas +
                ", ventas=" + ventas +
                ", anioLanzamiento=" + anioLanzamiento +
                ", precio=" + precio +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
