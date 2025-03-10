package es.dsrroma.school.spring.boot.reuniones.services;

import es.dsrroma.school.spring.boot.reuniones.data.ReunionRepository;
import es.dsrroma.school.spring.boot.reuniones.models.Persona;
import es.dsrroma.school.spring.boot.reuniones.models.Reunion;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ReunionService {

    private final ReunionRepository reunionRepository;

    public ReunionService(ReunionRepository reunionRepository) {
        this.reunionRepository = reunionRepository;
    }

    public List<Reunion> getAllReuniones() {
        return reunionRepository.findAll();
    }
}
