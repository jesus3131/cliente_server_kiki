package co.edu.uniremington.gabrieladumar.ClientSofLuc.service;

import java.util.List;

import co.edu.uniremington.gabrieladumar.ClientSofLuc.model.Carrito;
import co.edu.uniremington.gabrieladumar.ClientSofLuc.model.Producto;
import co.edu.uniremington.gabrieladumar.ClientSofLuc.model.Usuario;

public interface ISofLucService {

    // Métodos para la gestión de productos
     void agregarProducto(Producto producto);
     void eliminarProducto(int id);
     Producto obtenerProductoPorId(int id);
     List<Producto> listarProductos();
     
     // Métodos para la gestión de usuarios
     void registrarUsuario(Usuario usuario);
     Usuario obtenerUsuarioPorId(int id);
     List<Usuario> listarUsuarios();
     
     // Métodos para la gestión del carrito
     void agregarAlCarrito(int usuarioId, int productoId);
     void eliminarDelCarrito(int usuarioId, int productoId);
     Carrito obtenerCarritoPorUsuario(int usuarioId);
     double calcularTotalCarrito(int usuarioId);
     void registrarProducto(String nombre, double precio, String descripcion);
     void registrarUsuario(String nombre, String apellido, String correo);

}
