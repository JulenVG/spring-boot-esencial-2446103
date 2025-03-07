package es.dsrroma.school.spring.boot.reuniones.services;

import es.dsrroma.school.spring.boot.reuniones.models.Persona;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonaService {
    private static final List<Persona> personas = new ArrayList<>();

    static {
        for (int i = 0; i < 5; i++) {
            Persona persona = new Persona(i, "Nombre " + i, "Apellido " + i);
            personas.add(persona);
        }
    }

    public static List<Persona> getAllPersonas() {
        return personas;
    }
}
