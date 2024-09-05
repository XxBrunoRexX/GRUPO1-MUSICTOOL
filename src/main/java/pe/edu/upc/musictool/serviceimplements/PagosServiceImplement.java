package pe.edu.upc.musictool.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.musictool.entities.Pagos;
import pe.edu.upc.musictool.repositories.IPagosRepository;
import pe.edu.upc.musictool.serviceinterfaces.IPagosService;

import java.util.List;
@Service
public class PagosServiceImplement implements IPagosService {
    @Autowired
    private IPagosRepository pgR;
    @Override
    public List<Pagos> list() {
        return pgR.findAll();
    }
}
