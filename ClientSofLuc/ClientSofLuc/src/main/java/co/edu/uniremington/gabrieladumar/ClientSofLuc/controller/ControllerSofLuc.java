package co.edu.uniremington.gabrieladumar.ClientSofLuc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerSofLuc {

    @GetMapping("/")
    public String index() {
        return "index"; // Página principal
    }

    @GetMapping("/productos")
    public String productos() {
        return "productos"; // Página de productos
    }

    @GetMapping("/registro")
    public String registro() {
        return "registro"; // Página de registro
    }

    @GetMapping("/login")
    public String login() {
        return "login"; // Página de inicio de sesión
    }
}


