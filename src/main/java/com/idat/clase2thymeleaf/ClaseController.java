package com.idat.clase2thymeleaf;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.idat.clases.Promedio;
import com.idat.clases.Sumar;
import com.idat.clases.Usuarios;
import com.idat.clases.VisualizarFecha;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClaseController {
     @GetMapping("/menu")
     public String home() {
          return "index";
     }

     @GetMapping("/opera1")
     public String pagina1(Model model) {
          VisualizarFecha fecha = new VisualizarFecha();
          fecha.setMensaje("Texto de Ejemplo Spring Boot");
          fecha.setTiempo(LocalDateTime.now().toString());
          model.addAttribute("opera1", fecha);
          return "/pages/page1";
     }

     @GetMapping("/opera2")
     public String pagina2(Model model) {
          List<Usuarios> usuarios = new ArrayList<Usuarios>();
          usuarios.add(new Usuarios(1, "maximope", "Maximo Apaza"));
          usuarios.add(new Usuarios(2, "maximope2", "Maximo2 Apaza"));
          usuarios.add(new Usuarios(3, "maximope3", "Maximo3 Apaza"));
          usuarios.add(new Usuarios(4, "Chicho", "Perez "));
          usuarios.add(new Usuarios(5, "Chicho22", "Perez Chirhuana"));
          model.addAttribute("usuarios", usuarios);
          return "/pages/page2";
     }

     @GetMapping("/promedio")
     public String getPromedio(Model model) {
          Promedio p = new Promedio(new Usuarios(1, "maximope", "Maximo Apaza"), 14, 20, 0);
          model.addAttribute("notas", p.getNotas());
          model.addAttribute("user", p.getUser());
          model.addAttribute("promedio", p.getPromedio().toString());
          return "/pages/promedio";
     }

     @GetMapping("/sumar")
     public String getSumar(Model model) {
          Sumar s = new Sumar(20, 1, 6);
          model.addAttribute("suma", s.getSuma());
          model.addAttribute("numeros", s.getNumbers());
          return "/pages/suma";
     }
}
