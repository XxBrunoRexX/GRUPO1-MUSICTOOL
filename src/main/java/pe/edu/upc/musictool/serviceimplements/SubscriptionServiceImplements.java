package pe.edu.upc.musictool.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.musictool.entities.Suscription;
import pe.edu.upc.musictool.repositories.ISuscriptionRepository;
import pe.edu.upc.musictool.serviceinterfaces.ISuscriptionService;

import java.time.LocalDate;
import java.util.List;

@Service
public class SubscriptionServiceImplements implements ISuscriptionService {
    @Autowired
    private ISuscriptionRepository sR;
    @Override
    public void insert(Suscription sr){sR.save(sr);}
    @Override
    public List<Suscription> list(){return sR.findAll();}
    @Override
    public void delete(int idSub){sR.deleteById(idSub);}
    @Override
    public void update(Suscription idSub){sR.save(idSub);}
    @Override
    public List<Suscription> buscartipodesuscripcion (String tiposuscripcion){
        return sR.buscartipodesuscripcion(tiposuscripcion);
    }
    @Override
    public List<Suscription> buscarrango (LocalDate fechainicio, LocalDate fechafin) {
        return sR.buscarrango(fechainicio, fechafin);
    }
}
