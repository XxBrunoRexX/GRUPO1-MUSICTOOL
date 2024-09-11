package pe.edu.upc.musictool.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.musictool.entities.Answer;
import pe.edu.upc.musictool.repositories.IAnswerRepository;
import pe.edu.upc.musictool.serviceinterfaces.IAnswerService;

import java.util.List;

@Service
public class AnswerServiceImplement implements IAnswerService {
    @Autowired
    private IAnswerRepository aR;
    @Override
    public List<Answer> list() {
        return aR.findAll();
    }

    @Override
    public void insert(Answer an) { aR.save(an);

    }

    @Override
    public Answer listId(int id) {
        return null;
    }

    @Override
    public void update(Answer an) {aR.save(an);

    }

    @Override
    public void delete(int id) {aR.deleteById(id);

    }
}
