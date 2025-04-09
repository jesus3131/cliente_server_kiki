package co.edu.uniremington.gabrieladumar.ClientSofLuc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import co.edu.uniremington.gabrieladumar.ClientSofLuc.model.Carrito;
import co.edu.uniremington.gabrieladumar.ClientSofLuc.model.Producto;
import co.edu.uniremington.gabrieladumar.ClientSofLuc.model.Usuario;

public class SofLucServiceImpl implements ISofLucService {

     private final String BASE_URL = "http://192.168.209.184:8080/api";  // Cambia esta URL a la URL de tu servidor

    @Autowired
    private RestTemplate restTemplate;

    // Métodos para la gestión de productos
    @Override
    public void agregarProducto(Producto producto) {
        restTemplate.postForObject(BASE_URL + "/productos", producto, Producto.class);
    }

    @Override
    public void eliminarProducto(int id) {
        restTemplate.delete(BASE_URL + "/productos/{id}", id);
    }

    @Override
    public Producto obtenerProductoPorId(int id) {
        return restTemplate.getForObject(BASE_URL + "/productos/{id}", Producto.class, id);
    }

    @Override
    public List<Producto> listarProductos() {
        return restTemplate.getForObject(BASE_URL + "/productos", List.class);
    }

    // Métodos para la gestión de usuarios
    @Override
    public void registrarUsuario(Usuario usuario) {
        restTemplate.postForObject(BASE_URL + "/usuarios", usuario, Usuario.class);
    }

    @Override
    public Usuario obtenerUsuarioPorId(int id) {
        return restTemplate.getForObject(BASE_URL + "/usuarios/{id}", Usuario.class, id);
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return restTemplate.getForObject(BASE_URL + "/usuarios", List.class);
    }

    // Métodos para la gestión del carrito
    @Override
    public void agregarAlCarrito(int usuarioId, int productoId) {
        restTemplate.postForObject(BASE_URL + "/carrito/agregar/{usuarioId}/{productoId}", null, Void.class, usuarioId, productoId);
    }

    @Override
    public void eliminarDelCarrito(int usuarioId, int productoId) {
        restTemplate.delete(BASE_URL + "/carrito/eliminar/{usuarioId}/{productoId}", usuarioId, productoId);
    }

    @Override
    public Carrito obtenerCarritoPorUsuario(int usuarioId) {
        return restTemplate.getForObject(BASE_URL + "/carrito/{usuarioId}", Carrito.class, usuarioId);
    }

    @Override
    public double calcularTotalCarrito(int usuarioId) {
        return restTemplate.getForObject(BASE_URL + "/carrito/total/{usuarioId}", Double.class, usuarioId);
    }

    @Override
    public void registrarProducto(String nombre, double precio, String descripcion) {
        Producto producto = new Producto(nombre, "", descripcion, precio, 0);  // Asumí que el código y stock se dejan vacíos
        agregarProducto(producto);  
    }

    @Override
    public void registrarUsuario(String nombre, String apellido, String correo) {
        Usuario usuario = new Usuario(0, nombre, correo);  // Asumí que el ID es autogenerado
        registrarUsuario(usuario);
    }
}
