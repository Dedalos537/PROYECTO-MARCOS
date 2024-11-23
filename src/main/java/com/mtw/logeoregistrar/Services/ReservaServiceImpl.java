// Source code is decompiled from a .class file using FernFlower decompiler.
package com.mtw.logeoregistrar.Services;

import com.mtw.logeoregistrar.DTO.ReservaDto;
import com.mtw.logeoregistrar.Models.ReservaModel;
import com.mtw.logeoregistrar.Repositories.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservaServiceImpl implements ReservaServi {
   private ReservaRepository reservaRepository;

   @Autowired
   public ReservaServiceImpl(ReservaRepository reservaRepository) {
      this.reservaRepository = reservaRepository;
   }

   public ReservaModel guardar(ReservaDto rd) {
      ReservaModel reserva = new ReservaModel();
      reserva.setNombre(rd.getNombre());
      reserva.setEmail(rd.getEmail());
      reserva.setTelefono(rd.getTelefono());
      reserva.setInvitados(rd.getInvitados());
      reserva.setFecha(rd.getFecha());
      reserva.setHora(rd.getHora());
      return (ReservaModel)this.reservaRepository.save(reserva);
   }
}
