package pe.edu.upc.musictool.serviceinterfaces;

import pe.edu.upc.musictool.entities.Publics;

import java.util.List;

public interface IPublicService {
    public void insert(Publics rol);
    public List<Publics> list();

    public void delete(int idPublic);

    public void update(Publics idPublic);
}
