package co.edu.uniremington.kiarapuello.S_SofLuc_online.Model;

public class Producto {


    private String nombre;
    private Double precio;
    private String imagenurl;

    public Producto() {
    }

    public Producto(String nombre, Double precio, String imagenurl) {
        this.nombre = nombre;
        this.precio = precio;
        this.imagenurl = imagenurl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getImagen() {
        return imagenurl;
    }

    public void setImagen(String imagenurl) {
        this.imagenurl = imagenurl;
    }
}


