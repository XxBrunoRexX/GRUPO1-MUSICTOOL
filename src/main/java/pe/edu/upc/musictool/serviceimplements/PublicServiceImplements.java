package pe.edu.upc.musictool.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.musictool.entities.Publics;
import pe.edu.upc.musictool.entities.Suscription;
import pe.edu.upc.musictool.repositories.IPublicsRepository;
import pe.edu.upc.musictool.serviceinterfaces.IPublicService;

import java.time.LocalDate;
import java.util.List;

@Service
public class PublicServiceImplements implements IPublicService {
    @Autowired
    private IPublicsRepository pR;

    @Override
    public void insert(Publics rol){pR.save(rol);}
    @Override
    public List<Publics> list(){return pR.findAll();}
    @Override
    public void delete(int idPublic){pR.deleteById(idPublic);}
    @Override
    public void update(Publics idPublic){pR.save(idPublic);}
    @Override
    public List<Publics> buscarpublicacionfanatico (String fanatico){
        return pR.buscarpublicacionfanatico(fanatico);
    }
    @Override
    public List<Suscription> buscarfecha (LocalDate fechapublicacion){
        return pR.buscarfecha(fechapublicacion);
    }
}
