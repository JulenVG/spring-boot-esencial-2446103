package es.dsrroma.school.spring.boot.reuniones.controllers;

import es.dsrroma.school.spring.boot.reuniones.models.Persona;
import es.dsrroma.school.spring.boot.reuniones.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    PersonaService personaService;

    @GetMapping
    public String getAllPersonas(Model model){
        model.addAttribute("personas", personaService.getAllPersonas());
        return "personas";
    }
}
