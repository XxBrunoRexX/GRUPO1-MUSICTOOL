package pe.edu.upc.musictool.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.musictool.dtos.RoleDTO;
import pe.edu.upc.musictool.entities.Role;
import pe.edu.upc.musictool.entities.User;
import pe.edu.upc.musictool.serviceinterfaces.IRoleService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private IRoleService rR;
    @GetMapping
    public List<RoleDTO> list() {
        return rR.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,RoleDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insert(@RequestBody RoleDTO dto) {
        ModelMapper m=new ModelMapper();
        Role v=m.map(dto,Role.class);
        rR.insert(v);
    }
    @PutMapping
    public void modificar(@RequestBody RoleDTO dto) {
        ModelMapper m=new ModelMapper();
        Role v=m.map(dto,Role.class);
        rR.update(v);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        rR.delete(id);
    }
    @GetMapping("/busquedas")
    public List<RoleDTO> buscar(@RequestParam("busquedas") String tipoRole) {
        return rR.buscar(tipoRole).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, RoleDTO.class);
        }).collect(Collectors.toList());
}
}
