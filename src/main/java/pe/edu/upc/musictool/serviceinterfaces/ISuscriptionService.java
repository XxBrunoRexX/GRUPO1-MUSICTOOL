package pe.edu.upc.musictool.serviceinterfaces;

import pe.edu.upc.musictool.entities.Merchandising;
import pe.edu.upc.musictool.entities.Suscription;

import java.time.LocalDate;
import java.util.List;

public interface ISuscriptionService {
    public void insert(Suscription suscription);
    public List<Suscription> list();

    public void delete(int idSub);

    public void update(Suscription idSub);
    public List<Suscription> buscartipodesuscripcion (String tiposuscripcion);
    public List<Suscription> buscarrango (LocalDate fechainicio, LocalDate fechafin);
}
