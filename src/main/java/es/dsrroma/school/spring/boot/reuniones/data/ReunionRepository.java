package es.dsrroma.school.spring.boot.reuniones.data;

import es.dsrroma.school.spring.boot.reuniones.models.Reunion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReunionRepository extends JpaRepository<Reunion, Long> {
}
