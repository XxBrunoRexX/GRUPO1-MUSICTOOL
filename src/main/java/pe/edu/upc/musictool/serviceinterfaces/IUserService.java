package pe.edu.upc.musictool.serviceinterfaces;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.musictool.entities.User;

import java.util.List;

public interface IUserService {
    public List<User> list();
    public List<User> buscar(String tipousuario);
    public  void insert(User u);
    public void delete(Integer id);
    public void update(User u);


}

