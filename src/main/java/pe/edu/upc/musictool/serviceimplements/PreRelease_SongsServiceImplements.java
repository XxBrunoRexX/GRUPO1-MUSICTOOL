package pe.edu.upc.musictool.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
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

    public List<PreRelease_Songs> buscarGenero(String genre){
        return pR.buscarGenero(genre);
    }
}
