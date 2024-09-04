package pe.edu.upc.musictool.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.musictool.entities.User;

import java.util.List;

public interface IUserRepository extends JpaRepository<User, Integer> {
    @Query("select v from User v where v.tipo_usuario like %:tipousuario%")
    public List<User> buscar(@Param(("tipousuario")) String tipousuario);


}
