package pe.edu.upc.musictool.serviceinterfaces;

import pe.edu.upc.musictool.entities.Pagos;

import java.util.List;

public interface IPagosService {
    public List<Pagos> list();
    public void insert(Pagos pg);
    public Pagos listId(int id);
}
