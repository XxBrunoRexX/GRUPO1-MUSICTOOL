package pe.edu.upc.musictool.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.musictool.entities.Survey;
import pe.edu.upc.musictool.repositories.ISurveyRepository;
import pe.edu.upc.musictool.serviceinterfaces.ISurveyService;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
@Service
public class SurveyServiceImplement implements ISurveyService {
    @Autowired
    private ISurveyRepository sR;

    @Override
    public List<Survey> list() {
        return sR.findAll();
    }

    @Override
    public void insertSurvey(Survey su) { sR.save(su);}

    @Override
    public void updateSurvey(Survey su) { sR.save(su);}

    @Override
    public void deleteSurvey(int id) {
        sR.deleteById(id);
    }

    @Override
    public List<Survey> buscarTitulo(String titulo) {
        return sR.buscarTitulo(titulo);
    }

    @Override
    public List<Survey> buscarFecharango(LocalDate fechainicio, LocalDate fechafin) {
        return sR.buscarFecharango(fechainicio, fechafin);
    }

    @Override
    public List<Survey> buscarFecha(LocalDate fecha) {
        return sR.buscarFecha(fecha);
    }


}
