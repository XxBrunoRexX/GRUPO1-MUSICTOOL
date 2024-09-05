package pe.edu.upc.musictool.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.musictool.dtos.PreRelease_SongsDTO;
import pe.edu.upc.musictool.entities.PreRelease_Songs;
import pe.edu.upc.musictool.serviceinterfaces.IPreRelease_SongsService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/precanciones")
public class PreRelease_SongsController {
    @Autowired
    private IPreRelease_SongsService pS;
    @GetMapping
    public List<PreRelease_SongsDTO> listar(){
        return pS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PreRelease_SongsDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody PreRelease_SongsDTO dto){
        ModelMapper m = new ModelMapper();
        PreRelease_Songs s = m.map(dto, PreRelease_Songs.class);
        pS.insertPreRelease(s);
    }
    @PatchMapping
    public void actualizar(PreRelease_SongsDTO dto){
        ModelMapper m = new ModelMapper();
        PreRelease_Songs s = m.map(dto, PreRelease_Songs.class);
        pS.updatetPreRelease(s);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")int id){pS.deletePreRelease(id);}
    @GetMapping("/buscargenero")
    public List<PreRelease_SongsDTO> buscarGenero(@RequestParam String genre) {
        return pS.buscarGenero(genre).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,PreRelease_SongsDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/buscarnombre")
    public List<PreRelease_SongsDTO> buscarNombre(@RequestParam String name) {
        return pS.buscarNombre(name).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,PreRelease_SongsDTO.class);
        }).collect(Collectors.toList());
    }
    /*@GetMapping("/buscarartista")
    public List<PreRelease_SongsDTO> buscarCancionArtista(@RequestParam String artist){
        return pS.buscarCancionArtista(artist).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,PreRelease_SongsDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/totalcancionesgenero")
    public List<ReporteCantidadSongsDTO> cantidadCanciones() {
        List<String[]> lista = pS.contarCancionesOrdenService();
        List<ReporteCantidadSongsDTO> listaDTO = new ArrayList<>();
        for (String[] columna : lista) {
            ReporteCantidadSongsDTO dto = new ReporteCantidadSongsDTO();
            dto.setGenre(columna[0]);
            dto.setQuantitySongs(Integer.parseInt(columna[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }*/
}
