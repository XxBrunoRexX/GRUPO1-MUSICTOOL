package pe.edu.upc.musictool.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import pe.edu.upc.musictool.entities.PreRelease_Songs;
import pe.edu.upc.musictool.repositories.IPreRelease_SongsRepository;
import pe.edu.upc.musictool.serviceinterfaces.IPreRelease_SongsService;

import java.util.List;

@Service
public class PreRelease_SongsServiceImplements implements IPreRelease_SongsService {
    @Autowired
    private IPreRelease_SongsRepository pR;
    @Override
    public List<PreRelease_Songs> list(){return pR.findAll();}
    @Override
    public void insertPreRelease(PreRelease_Songs so){pR.save(so);}
    @Override
    public void updatetPreRelease(PreRelease_Songs so){pR.save(so);};
    @Override
    public void deletePreRelease(int id){pR.deleteById(id);};
    @Override
    public List<PreRelease_Songs> buscarGenero(String genre){
        return pR.buscarGenero(genre);
    }
    @Override
    public List<PreRelease_Songs> buscarNombre(String nombre){return pR.buscarNombre(nombre);}
    @Override
    public List<PreRelease_Songs> buscarCancionArtista(String artista){return pR.buscarCancionArtista(artista);}
    @Override
    public List<String[]> contarCancionesOrden(){return pR.contarCancionesOrden();};

}
