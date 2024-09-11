package pe.edu.upc.musictool.serviceinterfaces;

import pe.edu.upc.musictool.entities.Merchandising;

import java.util.List;

public interface IMerchandisingService {
    public List<Merchandising> list();
    public void insertMerchandising (Merchandising me);
    public void updateMerchandising (Merchandising me);
    public void deleteMerchandising (int id);
    public List<Merchandising> buscarnombre(String nombre);
}


