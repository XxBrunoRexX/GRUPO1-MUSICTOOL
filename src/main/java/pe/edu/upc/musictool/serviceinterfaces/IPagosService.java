package pe.edu.upc.musictool.serviceinterfaces;

import pe.edu.upc.musictool.entities.Pagos;

import java.util.List;

public interface IPagosService {
    public List<Pagos> list();
    public void insert(Pagos pg);
    public Pagos listId(int id);
    public void update(Pagos pg);
    public void delete(int id);
    public List<Pagos>buscar(Double monto);
}
