package es.dsrroma.school.spring.boot.reuniones.services;

import es.dsrroma.school.spring.boot.reuniones.data.PersonaRepository;
import es.dsrroma.school.spring.boot.reuniones.models.Persona;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonaService {

    private final PersonaRepository personaRepository;

    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public List<Persona> getAllPersonas() {
        return personaRepository.findAll();
    }
}
