package pe.edu.upc.musictool.serviceinterfaces;

import pe.edu.upc.musictool.entities.Mensaje;

import java.util.List;

public interface IMensajeService {
    public List<Mensaje> list();
    public void insert(Mensaje me);
    public Mensaje listId(int id);
    public void update(Mensaje me);
    public void delete(int id);
}
