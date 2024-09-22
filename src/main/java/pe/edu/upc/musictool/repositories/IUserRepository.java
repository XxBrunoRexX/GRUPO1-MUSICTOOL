package pe.edu.upc.musictool.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.musictool.entities.User;

import java.util.List;
@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {
@Query(value = " SELECT u.id_user, r.tipo_role\n" +
        " FROM usuario u\n" +
        " JOIN role r ON u.idRole = r.idRole;",nativeQuery = true)
    public List<String[]> muestraidrole();
}
