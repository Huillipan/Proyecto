
package com.lp2.SistemasVentasWeb.controladores;


import com.lp2.SistemasVentasWeb.modelo.Empleado;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class Registro {
    
    @RequestMapping("/login")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "view.name";
    }
    
    @GetMapping("/login")
    public String mostrarLogin(Model model){
        model.addAttribute("Empleado", new Empleado());
        return"registro.html";
    }
  
}
