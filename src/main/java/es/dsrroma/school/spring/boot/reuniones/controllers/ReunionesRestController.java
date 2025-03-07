package es.dsrroma.school.spring.boot.reuniones.controllers;

import es.dsrroma.school.spring.boot.reuniones.models.Reunion;
import es.dsrroma.school.spring.boot.reuniones.services.ReunionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/reuniones")
public class ReunionesRestController {

    private ReunionService reunionService;

    public ReunionesRestController(ReunionService reunionService) {
        this.reunionService = reunionService;
    }

    @GetMapping
    public List<Reunion> gelAllReuniones(){
        return reunionService.getAllReuniones();
    }
}
