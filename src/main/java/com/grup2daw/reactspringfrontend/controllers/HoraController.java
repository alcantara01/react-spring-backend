package com.grup2daw.reactspringfrontend.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HoraController {
    @RequestMapping(value = "/api/hora")
    public Map getHora(){
        Map respuesta = new HashMap();
        //Muestra sólo hora y minuto, no muestra segundos
        LocalTime hora = LocalTime.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("h:mm:ss");
        respuesta.put("Hora", hora.format(f));
        return respuesta;
    }
}
