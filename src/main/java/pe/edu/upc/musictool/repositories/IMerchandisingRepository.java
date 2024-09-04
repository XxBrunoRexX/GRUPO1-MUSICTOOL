package pe.edu.upc.musictool.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.musictool.entities.Merchandising;

import java.util.List;
@Repository
public interface IMerchandisingRepository extends JpaRepository<Merchandising, Integer> {
    @Query("select s from Merchandising s where s.name_merchandising like %:nombre%")
    public List<Merchandising> buscarnombre(@Param("nombre") String nombre);

}
