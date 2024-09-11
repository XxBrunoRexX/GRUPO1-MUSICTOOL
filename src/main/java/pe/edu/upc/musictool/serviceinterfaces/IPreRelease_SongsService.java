package pe.edu.upc.musictool.serviceinterfaces;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
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
    public List<PreRelease_Songs> buscarCancionArtista(String artista);
    public List<String[]> contarCancionesOrden();

}
