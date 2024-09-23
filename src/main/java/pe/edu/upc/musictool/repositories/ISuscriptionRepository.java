package pe.edu.upc.musictool.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.musictool.entities.Suscription;

public interface ISuscriptionRepository extends JpaRepository<Suscription, Integer> {
}
