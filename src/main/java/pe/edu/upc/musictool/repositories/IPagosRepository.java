package pe.edu.upc.musictool.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.musictool.entities.Pagos;

public interface IPagosRepository extends JpaRepository<Pagos, Integer> {
}
