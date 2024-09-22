package pe.edu.upc.musictool.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.musictool.entities.Role;
import pe.edu.upc.musictool.repositories.IRoleRepository;
import pe.edu.upc.musictool.serviceinterfaces.IRoleService;

import java.util.List;
@Service
public class RoleServiceImplement implements IRoleService {
    @Autowired
    private IRoleRepository rR;
    @Override
    public List<Role> list(){return rR.findAll();}
    @Override
    public List<Role> buscar(String TipoRole){
        return rR.buscar(TipoRole);
    }
    @Override
    public void  insert(Role r){rR.save(r);}
    @Override
    public void update(Role r){}

    @Override
    public void delete(Integer id){rR.deleteById(id);}


}
