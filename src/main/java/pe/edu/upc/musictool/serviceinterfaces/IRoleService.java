package pe.edu.upc.musictool.serviceinterfaces;

import pe.edu.upc.musictool.entities.Role;

import java.util.List;

public interface IRoleService {
    public List<Role> list();
    List<Role> buscar(String TipoRole);
    void insert(Role r);
    void update(Role r);
    void delete(Integer id);

}
