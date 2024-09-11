package pe.edu.upc.musictool.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import pe.edu.upc.musictool.entities.Answer;

public interface IAnswerRepository extends JpaRepository<Answer, Integer> {
}
