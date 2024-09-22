package pe.edu.upc.musictool.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.musictool.dtos.UserDTO;
import pe.edu.upc.musictool.entities.User;
import pe.edu.upc.musictool.serviceinterfaces.IUserService;
import pe.edu.upc.musictool.dtos.IdRoleDTO;
import java.util.ArrayList;
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

    @PutMapping
    public void modificar(@RequestBody UserDTO dto){
        ModelMapper m=new ModelMapper();
        User v=m.map(dto,User.class);
        uS.update(v);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){uS.delete(id);}
    @PostMapping
    public void insertar(@RequestBody UserDTO dto){
        ModelMapper m=new ModelMapper();
        User v=m.map(dto,User.class);
        uS.insert(v);
    }
@GetMapping("/{id}")
public UserDTO listaId(@PathVariable("id")  Integer id)
{   ModelMapper m=new ModelMapper();
    UserDTO udto = m.map(uS.listId(id),UserDTO.class);
    return udto;
    }
    @GetMapping("/{muestraidrole}")
    public List<IdRoleDTO> muestraidrole()
    {
        List<String[]> lista=uS.muestraidrole();
        List<IdRoleDTO> listaDTO=new ArrayList<>();
        for (String[] columna : lista) {
            IdRoleDTO dto = new IdRoleDTO();
            dto.setTipo_role(columna[0]);
            dto.setId_user(Integer.parseInt((columna[1])));
            listaDTO.add(dto);
        }
        return listaDTO;
    }
}
