package pe.edu.upc.musictool.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.musictool.entities.Mensaje;

public interface IMensajeRepository extends JpaRepository<Mensaje, Integer> {
}
