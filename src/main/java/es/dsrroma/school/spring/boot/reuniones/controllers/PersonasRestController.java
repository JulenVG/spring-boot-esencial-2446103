package es.dsrroma.school.spring.boot.reuniones.controllers;

import es.dsrroma.school.spring.boot.reuniones.models.Persona;
import es.dsrroma.school.spring.boot.reuniones.services.PersonaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/personas")
public class PersonasRestController {

    private PersonaService personaService;

    public PersonasRestController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping
    public List<Persona> getAllPersonas(){
        return personaService.getAllPersonas();
    }
}
