package es.dsrroma.school.spring.boot.reuniones.services;

import es.dsrroma.school.spring.boot.reuniones.models.Persona;
import es.dsrroma.school.spring.boot.reuniones.models.Reunion;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ReunionService {
    private static final List<Reunion> reuniones = new ArrayList<>();

    static {
        for (int i = 0; i < 5; i++) {
            Reunion reunion = new Reunion(i, "Reunion " + i, ZonedDateTime.now().plusDays(i));
            for (int j = 0; j < i; j++) {
                reunion.addAsistente(new Persona(i+j, "Nombre " + i + j, "Apellido " + i + j));
            }
            reuniones.add(reunion);
        }
    }

    public static List<Reunion> getAllReuniones() {
        return reuniones;
    }
}
