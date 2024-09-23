package pe.edu.upc.musictool.repositories;

import jakarta.persistence.Column;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.musictool.entities.PreRelease_Songs;
import pe.edu.upc.musictool.entities.Publics;
import pe.edu.upc.musictool.entities.Suscription;

import java.time.LocalDate;
import java.util.List;

public interface IPublicsRepository extends JpaRepository<Publics, Integer> {
    @Query("select p from Publics p where p.user.username=:fanatico")
    public List<Publics> buscarpublicacionfanatico(@Param("fanatico") String fanatico);
    @Query(value = "select p from Publics p where p.date=:fechapublicacion", nativeQuery = true)
    public List<Suscription> buscarfecha(@Param("fechapublicacion") LocalDate fechapublicacion);
}
