package pe.edu.upc.musictool.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.musictool.entities.Merchandising;
import pe.edu.upc.musictool.repositories.IMerchandisingRepository;
import pe.edu.upc.musictool.serviceinterfaces.IMerchandisingService;

import java.util.List;
@Service
public class MerchandisingServiceImplement implements IMerchandisingService {
   @Autowired
    private IMerchandisingRepository mR;

    @Override
    public List<Merchandising> list() { return mR.findAll();
    }

    @Override
    public void insertMerchandising(Merchandising me) {mR.save(me);
    }


    @Override
    public void updateMerchandising(Merchandising me) {mR.save(me);

    }

    @Override
    public void deleteMerchandising(int id) {mR.deleteById(id);}

    @Override
    public List<Merchandising> buscarnombre(String nombre) { return mR.buscarnombre(nombre);
    }

}



