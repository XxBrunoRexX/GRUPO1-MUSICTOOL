package pe.edu.upc.musictool.serviceinterfaces;

import pe.edu.upc.musictool.entities.Publics;
import pe.edu.upc.musictool.entities.Suscription;

import java.time.LocalDate;
import java.util.List;

public interface IPublicService {
    public void insert(Publics rol);
    public List<Publics> list();

    public void delete(int idPublic);

    public void update(Publics idPublic);

    public List<Publics>  buscarpublicacionfanatico( String fanatico );
    public List<Suscription> buscarfecha(LocalDate fechapublicacion );

}
