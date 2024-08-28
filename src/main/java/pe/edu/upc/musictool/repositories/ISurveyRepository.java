package pe.edu.upc.musictool.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.musictool.entities.Survey;

@Repository

public interface ISurveyRepository extends JpaRepository <Survey,Integer> {
}

