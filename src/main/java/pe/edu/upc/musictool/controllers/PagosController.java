package pe.edu.upc.musictool.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.musictool.dtos.MensajeDTO;
import pe.edu.upc.musictool.dtos.PagosDTO;
import pe.edu.upc.musictool.entities.Mensaje;
import pe.edu.upc.musictool.entities.Pagos;
import pe.edu.upc.musictool.serviceinterfaces.IPagosService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pagos")
public class PagosController {
    @Autowired
    private IPagosService pgS;

    @GetMapping
    public List<PagosDTO> listar(){
        return pgS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PagosDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody Pagos dto){
        ModelMapper m = new ModelMapper();
        Pagos pa = m.map(dto, Pagos.class);
        pgS.insert(pa);
    }

    @GetMapping("/{id}")
    public PagosDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        PagosDTO dto = m.map(pgS.listId(id), PagosDTO.class);
        return dto;
    }
}
