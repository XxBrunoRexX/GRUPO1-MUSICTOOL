package pe.edu.upc.musictool.serviceinterfaces;
import pe.edu.upc.musictool.entities.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    public List<User> list();
    public User listId(int id_user);
    public  void insert(User u);
    public void delete(Integer id);
    public void update(User u);
    public List<String[]> muestraidrole();

}

