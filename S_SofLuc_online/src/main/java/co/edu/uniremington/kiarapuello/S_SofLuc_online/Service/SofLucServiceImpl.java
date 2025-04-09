package co.edu.uniremington.kiarapuello.S_SofLuc_online.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import co.edu.uniremington.kiarapuello.S_SofLuc_online.Model.Carrito;
import co.edu.uniremington.kiarapuello.S_SofLuc_online.Model.Producto;
import co.edu.uniremington.kiarapuello.S_SofLuc_online.Model.Usuario;

@Service
public class SofLucServiceImpl implements ISofLucService {
    private final List<Producto> productos = new ArrayList<>();
    private final List<Usuario> usuarios = new ArrayList<>();
    private final List<Carrito> carritos = new ArrayList<>();

    @Override
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    @Override
    public List<Producto> listarProductos() {
        return productos;
    }

    @Override
    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        carritos.add(new Carrito()); // Cada usuario tiene su propio carrito
    }

    @Override
    public Usuario obtenerUsuarioPorId(int id) {
        return usuarios.stream().filter(u -> u.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return usuarios;
    }

    @Override
    public void agregarAlCarrito(int usuarioId, int productoId) {
        Usuario usuario = obtenerUsuarioPorId(usuarioId);
        Producto producto = obtenerProductoPorId(productoId);
        if (usuario != null && producto != null) {
            obtenerCarritoPorUsuario(usuarioId).getProductos().add(producto);
        }
    }

    @Override
    public void eliminarDelCarrito(int usuarioId, int productoId) {
        Usuario usuario = obtenerUsuarioPorId(usuarioId);
        Producto producto = obtenerProductoPorId(productoId);
        if (usuario != null && producto != null) {
            obtenerCarritoPorUsuario(usuarioId).getProductos().remove(producto);
        }
    }

    @Override
    public Carrito obtenerCarritoPorUsuario(int usuarioId) {
        return carritos.get(usuarioId);
    }

    @Override
    public double calcularTotalCarrito(int usuarioId) {
        return obtenerCarritoPorUsuario(usuarioId).getProductos().stream().mapToDouble(Producto::getPrecio).sum();
    }

    @Override
    public void registrarProducto(String nombre, double precio, String descripcion) {
        Producto producto = new Producto(nombre, (long) (productos.size() + 1), descripcion, precio);
        agregarProducto(producto);
    }

    @Override
    public void registrarUsuario(String nombre, String apellido, String correo) {
        Usuario usuario = new Usuario(usuarios.size() + 1, nombre + " " + apellido, correo);
        registrarUsuario(usuario);
    }
}
