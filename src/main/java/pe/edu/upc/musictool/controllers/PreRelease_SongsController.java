package pe.edu.upc.musictool.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.musictool.dtos.PreRelease_SongsDTO;
import pe.edu.upc.musictool.dtos.SurveyDTO;
import pe.edu.upc.musictool.dtos.UserDTO;
import pe.edu.upc.musictool.serviceinterfaces.IPreRelease_SongsService;

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
    @GetMapping("/buscargenero")
    public List<PreRelease_SongsDTO> buscarGenero(@RequestParam String genre) {
        return pS.buscarGenero(genre).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,PreRelease_SongsDTO.class);
        }).collect(Collectors.toList());
    }
}
