package pe.edu.upc.musictool.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.musictool.entities.Role;

import java.util.List;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Integer> {
@Query("select v from Role v where v.TipoRole like %:TipoRole%")
   public  List<Role> buscar(@Param(("TipoRole")) String tipoRole);

}
