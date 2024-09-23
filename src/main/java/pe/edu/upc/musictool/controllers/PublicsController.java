package pe.edu.upc.musictool.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.musictool.dtos.PublicsDTO;
import pe.edu.upc.musictool.entities.Publics;
import pe.edu.upc.musictool.serviceinterfaces.IPublicService;

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
}
