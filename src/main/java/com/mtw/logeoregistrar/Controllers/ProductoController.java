package com.mtw.logeoregistrar.Controllers;


import com.mtw.logeoregistrar.Models.Producto;
import com.mtw.logeoregistrar.Models.CategoriaModel;
import com.mtw.logeoregistrar.Services.CategoriaService;
import com.mtw.logeoregistrar.Services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.ModelAttribute;





import java.util.List;

@Controller
public class ProductoController {

    @Autowired
    private CategoriaService categoriaService; // Inyección del servicio de categoría

    @Autowired
    private ProductoService productoService; // Inyección del servicio de producto

    // Ruta para mostrar el formulario de agregar producto
    @GetMapping("/agregarProducto")
    public String mostrarFormulario(Model model) {
        model.addAttribute("producto", new Producto());

        // Obtener todas las categorías
        List<CategoriaModel> categorias = categoriaService.obtenerCategorias();
        model.addAttribute("categorias", categorias); // Agregar las categorías al modelo

        return "/agregarProducto"; // Nombre de la plantilla HTML en WebSite/agregarProducto.html
    }

    @PostMapping("/guardarProducto")
    public String guardarProducto(@ModelAttribute Producto producto, RedirectAttributes redirectAttributes) {
        boolean success = true;
        try {
            productoService.guardarProducto(producto);
        } catch (Exception e) {
            success = false;
        }
        return "redirect:/agregarProducto?success=" + success;
    }
    
    
}

