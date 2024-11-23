package com.mtw.logeoregistrar.Services;

import com.mtw.logeoregistrar.Models.EventosModel;
import com.mtw.logeoregistrar.Repositories.EventosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventosService {

    @Autowired
    private EventosRepository eventosRepository;

    public EventosModel guardarEvento(EventosModel evento) {
        return eventosRepository.save(evento);
    }
}
