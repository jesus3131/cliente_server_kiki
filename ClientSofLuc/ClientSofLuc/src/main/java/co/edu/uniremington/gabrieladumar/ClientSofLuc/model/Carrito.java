package co.edu.uniremington.gabrieladumar.ClientSofLuc.model;

import java.util.List;

public class Carrito {

    private List<Producto> productos;

    private int agregarProducto;
    private int eliminarProducto;
    private int vaciarCarrito;
    private String calcularTotal;


    public Carrito(List<Producto> productos, int agregarProducto, int eliminarProducto, int vaciarCarrito,
    String calcularTotal) {
    this.productos = productos;
    this.agregarProducto = agregarProducto;
    this.eliminarProducto = eliminarProducto;
    this.vaciarCarrito = vaciarCarrito;
    this.calcularTotal = calcularTotal;
    }


    public Carrito() {}

    
    public List<Producto> getProductos() {
        return productos;
    }


    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }


    public int getAgregarProducto() {
        return agregarProducto;
    }


    public void setAgregarProducto(int agregarProducto) {
        this.agregarProducto = agregarProducto;
    }


    public int getEliminarProducto() {
        return eliminarProducto;
    }


    public void setEliminarProducto(int eliminarProducto) {
        this.eliminarProducto = eliminarProducto;
    }


    public int getVaciarCarrito() {
        return vaciarCarrito;
    }


    public void setVaciarCarrito(int vaciarCarrito) {
        this.vaciarCarrito = vaciarCarrito;
    }


    public String getCalcularTotal() {
        return calcularTotal;
    }


    public void setCalcularTotal(String calcularTotal) {
        this.calcularTotal = calcularTotal;
    }

}
