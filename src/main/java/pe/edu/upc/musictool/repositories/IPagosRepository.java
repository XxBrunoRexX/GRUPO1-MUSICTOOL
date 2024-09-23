package pe.edu.upc.musictool.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.musictool.entities.Pagos;

import java.util.List;

public interface IPagosRepository extends JpaRepository<Pagos, Integer> {
    @Query("select p from Pagos p where p.mount = :monto")
    public List<Pagos> buscar(@Param("monto") Double monto);
}
