package com.mtw.logeoregistrar.Controllers;

import com.mtw.logeoregistrar.Models.EventosModel;
import com.mtw.logeoregistrar.Services.EventosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EventosController {

    @Autowired
    private EventosService eventosService;

    @GetMapping("/eventos")
    public String formularioEventos(Model model) {
        model.addAttribute("evento", new EventosModel());
        return "Eventos"; 
    }

    @PostMapping("/eventos")
    public String registrarEvento(@ModelAttribute("evento") EventosModel evento, Model model) {
        eventosService.guardarEvento(evento);
        model.addAttribute("mensaje", "Evento registrado con éxito");
        return "redirect:/eventos"; 
    }
}
