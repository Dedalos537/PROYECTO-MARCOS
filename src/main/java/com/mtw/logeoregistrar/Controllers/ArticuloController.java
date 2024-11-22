package com.mtw.logeoregistrar.Controllers;


import com.mtw.logeoregistrar.Models.Articulo;
import com.mtw.logeoregistrar.Repositories.ArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ArticuloController {

    @Autowired
    private ArticuloRepository articuloRepository;

    @GetMapping("/articulos")
    public String listarArticulos(Model model) {
        model.addAttribute("articulos", articuloRepository.findAll());
        model.addAttribute("nuevoArticulo", new Articulo());
        return "articulos";
    }

    @PostMapping("/articulos/agregar")
    public String agregarArticulo(@ModelAttribute Articulo articulo) {
        articuloRepository.save(articulo);
        return "redirect:/articulos?success";
    }
}