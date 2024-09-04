package pe.edu.upc.musictool.serviceinterfaces;


import pe.edu.upc.musictool.entities.Answer;

import java.util.List;


public interface IAnswerService {
    public List<Answer> list();
    public  void insert(Answer an);
    public Answer listId(int id);
    public void update(Answer an);
    public void  delete(int id);
}
