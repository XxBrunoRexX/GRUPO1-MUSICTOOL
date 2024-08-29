package pe.edu.upc.musictool.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.musictool.entities.Survey;

import java.time.LocalDate;
import java.util.List;

@Repository

public interface ISurveyRepository extends JpaRepository <Survey,Integer> {
    @Query("select s from Survey s where s.title like %:titulo%")
    public List<Survey> buscarTitulo(@Param("titulo") String titulo);

    @Query("select e from Survey e where e.creationDate between :fechainicio and :fechafin")

    public List<Survey> buscarFecharango(@Param("fechainicio") LocalDate fechainicio, @Param("fechafin") LocalDate fechafin);

    @Query("select e from Survey e where e.creationDate = :fechainicio  ")

    public List<Survey> buscarFecha(@Param("fecha") LocalDate fecha);
}
