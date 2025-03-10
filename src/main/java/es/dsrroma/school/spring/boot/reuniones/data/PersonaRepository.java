package es.dsrroma.school.spring.boot.reuniones.data;

import es.dsrroma.school.spring.boot.reuniones.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
