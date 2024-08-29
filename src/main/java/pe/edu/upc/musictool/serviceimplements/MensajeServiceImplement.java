package pe.edu.upc.musictool.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.musictool.entities.Mensaje;
import pe.edu.upc.musictool.repositories.IMensajeRepository;
import pe.edu.upc.musictool.serviceinterfaces.IMensajeService;

import java.util.List;
@Service
public class MensajeServiceImplement implements IMensajeService {
    @Autowired
    private IMensajeRepository mR;
    @Override
    public List<Mensaje> list(){
        return mR.findAll();
    }

    @Override
    public void insert(Mensaje me) { mR.save(me); }
}
