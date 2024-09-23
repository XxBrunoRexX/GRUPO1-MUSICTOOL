package pe.edu.upc.musictool.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.musictool.dtos.PublicsDTO;
import pe.edu.upc.musictool.dtos.SubscriptionDTO;
import pe.edu.upc.musictool.entities.Publics;
import pe.edu.upc.musictool.serviceinterfaces.IPublicService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/publicaciones")
public class PublicsController {
    private IPublicService iP;
    @GetMapping
    public List<PublicsDTO> listar(){
        return iP.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PublicsDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody PublicsDTO dto){
        ModelMapper m = new ModelMapper();
        Publics d = m.map(dto, Publics.class);
        iP.insert(d);
    }
    @PatchMapping
    public void actualizar(PublicsDTO dto){
        ModelMapper m = new ModelMapper();
        Publics s = m.map(dto, Publics.class);
        iP.update(s);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")int id){iP.delete(id);}

    @GetMapping("/buscarpublicacionfanatico")
    public List<PublicsDTO> buscarPublicacionFanatico(@RequestParam String fanatico){
        return iP.buscarpublicacionfanatico(fanatico).stream().map(x ->{
            ModelMapper m = new ModelMapper();
            return m.map(x, PublicsDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/buscarfecha")
    public List<PublicsDTO> buscarFecha(@RequestParam LocalDate fechapublicacion){
        return iP.buscarfecha(fechapublicacion).stream().map(x ->{
            ModelMapper m = new ModelMapper();
            return m.map(x, PublicsDTO.class);
        }).collect(Collectors.toList());
    }

}
