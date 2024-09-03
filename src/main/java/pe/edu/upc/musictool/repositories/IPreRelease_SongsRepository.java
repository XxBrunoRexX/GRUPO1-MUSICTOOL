package pe.edu.upc.musictool.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.musictool.entities.PreRelease_Songs;

import java.util.List;

@Repository
public interface IPreRelease_SongsRepository extends JpaRepository<PreRelease_Songs, Integer> {
    @Query("select p from PreRelease_Songs p where p.genre like %:genre%")
    public List<PreRelease_Songs> buscarGenero(@Param(("genre")) String genero);
    @Query("select p from PreRelease_Songs p where p.name like %:name%")
    public List<PreRelease_Songs> buscarNombre(@Param(("name")) String nombre);
}
