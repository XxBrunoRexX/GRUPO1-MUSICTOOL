package pe.edu.upc.musictool.serviceinterfaces;

import pe.edu.upc.musictool.entities.Users;

import java.util.List;

public interface IUserSevice {
    public void insert(Users usuario);

    public List<Users> list();

    public void delete(Long idUsuario);

    public Users listarId(Long idUsuario);
}
