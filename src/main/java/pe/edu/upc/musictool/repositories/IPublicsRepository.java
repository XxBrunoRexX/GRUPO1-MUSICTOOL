package pe.edu.upc.musictool.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.musictool.entities.Publics;

public interface IPublicsRepository extends JpaRepository<Publics, Integer> {
}
