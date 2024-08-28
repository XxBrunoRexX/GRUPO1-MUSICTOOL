package pe.edu.upc.musictool.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.musictool.dtos.SurveyDTO;
import pe.edu.upc.musictool.dtos.UserDTO;
import pe.edu.upc.musictool.serviceinterfaces.IUserService;

import java.util.List;
import java.util.stream.Collectors;
@RestController
    @RequestMapping("/Users")
public class UserController {
    @Autowired
    private IUserService uS;
    @GetMapping
    public List<UserDTO> list() {
        return uS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UserDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/busquedas")
    public List<UserDTO> buscar(@RequestParam String busqueda) {
        return uS.buscar(busqueda).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,UserDTO.class);
        }).collect(Collectors.toList());
    }

}
