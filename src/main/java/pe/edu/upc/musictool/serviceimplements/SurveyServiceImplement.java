package pe.edu.upc.musictool.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.musictool.entities.Survey;
import pe.edu.upc.musictool.repositories.ISurveyRepository;
import pe.edu.upc.musictool.serviceinterfaces.ISurveyService;

import java.util.List;
@Service
public class SurveyServiceImplement implements ISurveyService {
    @Autowired
    private ISurveyRepository sR;
    @Override
    public List<Survey> list() {
        return sR.findAll();
    }
}
