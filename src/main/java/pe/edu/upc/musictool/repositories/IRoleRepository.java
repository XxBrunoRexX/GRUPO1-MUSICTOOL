package pe.edu.upc.musictool.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.musictool.entities.Role;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {
}
