package pe.edu.upc.musictool.serviceinterfaces;

import pe.edu.upc.musictool.entities.PreRelease_Songs;

import java.util.Collection;
import java.util.List;


public interface IPreRelease_SongsService {
    public List<PreRelease_Songs> list();
    public void insertPreRelease(PreRelease_Songs so);
    public void updatetPreRelease(PreRelease_Songs so);
    public void deletePreRelease(int id);
    public List<PreRelease_Songs> buscarGenero(String genre);
    public List<PreRelease_Songs> buscarNombre(String nombre);

}
