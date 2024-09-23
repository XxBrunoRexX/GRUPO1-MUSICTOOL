package pe.edu.upc.musictool.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.musictool.dtos.PreRelease_SongsDTO;
import pe.edu.upc.musictool.dtos.SubscriptionDTO;
import pe.edu.upc.musictool.entities.PreRelease_Songs;
import pe.edu.upc.musictool.entities.Suscription;
import pe.edu.upc.musictool.serviceinterfaces.ISuscriptionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/suscripciones")
public class SubscriptionController {
    private ISuscriptionService pS;
    @GetMapping
    public List<SubscriptionDTO> listar(){
        return pS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, SubscriptionDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody SubscriptionDTO dto){
        ModelMapper m = new ModelMapper();
        Suscription d = m.map(dto, Suscription.class);
        pS.insert(d);
    }
    @PatchMapping
    public void actualizar(SubscriptionDTO dto){
        ModelMapper m = new ModelMapper();
        Suscription s = m.map(dto, Suscription.class);
        pS.update(s);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")int id){pS.delete(id);}
}
