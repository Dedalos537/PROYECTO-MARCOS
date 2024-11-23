// Source code is decompiled from a .class file using FernFlower decompiler.
package com.mtw.logeoregistrar.Controllers;

import com.mtw.logeoregistrar.DTO.ReservaDto;
import com.mtw.logeoregistrar.Services.ReservaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/"})
public class ReservaController {
   private ReservaServiceImpl rs;

   @Autowired
   public ReservaController(ReservaServiceImpl rs) {
      this.rs = rs;
   }

   @ModelAttribute("reserva")
   public ReservaDto nReserva() {
      return new ReservaDto();
   }

   @GetMapping({"/reservaonline/", "/reservaonline"})
   public String formulario() {
      return "ReservaOnline";
   }

   @PostMapping({"/reservaonline", "/reservaonline"})
   public String nuevaReserva(@ModelAttribute("reserva") ReservaDto rd) {
      this.rs.guardar(rd);
      return "redirect:reservaonline?exito";
   }
}
