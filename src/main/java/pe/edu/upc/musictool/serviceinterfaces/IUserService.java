package pe.edu.upc.musictool.serviceinterfaces;

import pe.edu.upc.musictool.entities.User;

import java.util.List;

public interface IUserService {
    public List<User> list();
    public List<User> buscar(String tipousuario);
}

