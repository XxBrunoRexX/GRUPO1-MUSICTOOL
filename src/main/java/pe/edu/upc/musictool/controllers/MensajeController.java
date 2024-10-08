package pe.edu.upc.musictool.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.musictool.dtos.MensajeDTO;
import pe.edu.upc.musictool.entities.Mensaje;
import pe.edu.upc.musictool.serviceinterfaces.IMensajeService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/mensajes")
public class MensajeController {
    @Autowired
    private IMensajeService mS;

    @GetMapping
    public List<MensajeDTO> listar(){
        return mS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, MensajeDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody MensajeDTO dto){
        ModelMapper m = new ModelMapper();
        Mensaje msg = m.map(dto, Mensaje.class);
        mS.insert(msg);
    }
    @GetMapping("/{id}")
    public MensajeDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        MensajeDTO dto = m.map(mS.listId(id), MensajeDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody MensajeDTO dto){
        ModelMapper m = new ModelMapper();
        Mensaje msg = m.map(dto, Mensaje.class);
        mS.update(msg);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        mS.delete(id);
    }

    @GetMapping("/busquedas")
    public List<MensajeDTO> buscar(@RequestParam String contenido){
        return mS.buscar(contenido).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, MensajeDTO.class);
        }).collect(Collectors.toList());
    }
}
