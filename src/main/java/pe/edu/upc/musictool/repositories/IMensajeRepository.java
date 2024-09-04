package pe.edu.upc.musictool.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.musictool.entities.Mensaje;

import java.util.List;

@Repository
public interface IMensajeRepository extends JpaRepository<Mensaje, Integer> {
    @Query("select m from Mensaje m where m.content like %:contenido%")
    public List<Mensaje>buscar(@Param("contenido") String contenido);
}
