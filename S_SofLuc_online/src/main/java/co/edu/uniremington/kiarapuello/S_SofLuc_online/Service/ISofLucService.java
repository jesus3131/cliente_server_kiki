package co.edu.uniremington.kiarapuello.S_SofLuc_online.Service;

import java.util.List;

import co.edu.uniremington.kiarapuello.S_SofLuc_online.Model.Carrito;
import co.edu.uniremington.kiarapuello.S_SofLuc_online.Model.Producto;
import co.edu.uniremington.kiarapuello.S_SofLuc_online.Model.Usuario;


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

