package co.edu.uniremington.kiarapuello.S_SofLuc_online.Model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private int id;
    private String nombre;
    private String email;
    private List<String> historialCompras = new ArrayList<>();

 
    public Usuario(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getHistorialCompras() {
        return historialCompras;
    }

    public void agregarHistorialCompra(String compra) {
        historialCompras.add(compra);
    }
}
