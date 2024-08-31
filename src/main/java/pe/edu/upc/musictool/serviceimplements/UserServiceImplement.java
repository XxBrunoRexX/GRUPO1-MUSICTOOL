package pe.edu.upc.musictool.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.musictool.entities.User;
import pe.edu.upc.musictool.repositories.IUserRepository;
import pe.edu.upc.musictool.serviceinterfaces.IUserService;

import java.util.List;
@Service
public class UserServiceImplement implements IUserService {
    @Autowired
    private IUserRepository uS;
    @Override
    public List<User> list() {
       return uS.findAll();
    }

    @Override
    public List<User> buscar(String tipousuario) {
        return uS.buscar(tipousuario);
    }
}
