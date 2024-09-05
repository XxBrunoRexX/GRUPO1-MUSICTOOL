package pe.edu.upc.musictool.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.musictool.dtos.MensajeDTO;
import pe.edu.upc.musictool.dtos.PagosDTO;
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
}
