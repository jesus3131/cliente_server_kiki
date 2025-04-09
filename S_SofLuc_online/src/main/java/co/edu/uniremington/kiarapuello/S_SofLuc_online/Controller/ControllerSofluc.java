package co.edu.uniremington.kiarapuello.S_SofLuc_online.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import co.edu.uniremington.kiarapuello.S_SofLuc_online.Model.Producto;
import co.edu.uniremington.kiarapuello.S_SofLuc_online.Model.Usuario;
import co.edu.uniremington.kiarapuello.S_SofLuc_online.Model.Carrito;
import co.edu.uniremington.kiarapuello.S_SofLuc_online.Service.ISofLucService;

    
@RestController
@RequestMapping("/api")
public class ControllerSofluc {

       
            @Autowired
            private ISofLucService sofLucService;
        
            @PostMapping("/productos")
            public void agregarProducto(@RequestBody Producto producto) {
                sofLucService.agregarProducto(producto);
            }
        
            @DeleteMapping("/productos/{id}")
            public void eliminarProducto(@PathVariable int id) {
                sofLucService.eliminarProducto(id);
            }
        
            @GetMapping("/productos/{id}")
            public Producto obtenerProducto(@PathVariable int id) {
                return sofLucService.obtenerProductoPorId(id);
            }
        
            @GetMapping("/productos")
            public List<Producto> listarProductos() {
                return sofLucService.listarProductos();
            }
        
            @PostMapping("/usuarios")
            public void registrarUsuario(@RequestBody Usuario usuario) {
                sofLucService.registrarUsuario(usuario);
            }
        
            @GetMapping("/usuarios/{id}")
            public Usuario obtenerUsuario(@PathVariable int id) {
                return sofLucService.obtenerUsuarioPorId(id);
            }
        
            @GetMapping("/usuarios")
            public List<Usuario> listarUsuarios() {
                return sofLucService.listarUsuarios();
            }
        
            @PostMapping("/carrito/{usuarioId}/{productoId}")
            public void agregarAlCarrito(@PathVariable int usuarioId, @PathVariable int productoId) {
                sofLucService.agregarAlCarrito(usuarioId, productoId);
            }
        
            @DeleteMapping("/carrito/{usuarioId}/{productoId}")
            public void eliminarDelCarrito(@PathVariable int usuarioId, @PathVariable int productoId) {
                sofLucService.eliminarDelCarrito(usuarioId, productoId);
            }
        
            @GetMapping("/carrito/{usuarioId}")
            public Carrito obtenerCarrito(@PathVariable int usuarioId) {
                return sofLucService.obtenerCarritoPorUsuario(usuarioId);
            }
        
            @GetMapping("/carrito/{usuarioId}/total")
            public double calcularTotalCarrito(@PathVariable int usuarioId) {
                return sofLucService.calcularTotalCarrito(usuarioId);
            }
            
}
        

       