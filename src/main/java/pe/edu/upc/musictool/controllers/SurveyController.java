package pe.edu.upc.musictool.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.PathMatcher;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.musictool.dtos.SurveyDTO;
import pe.edu.upc.musictool.entities.Survey;
import pe.edu.upc.musictool.serviceinterfaces.ISurveyService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/encuestas")
public class SurveyController {
    @Autowired
    private ISurveyService sS;
    @Autowired
    private PathMatcher mvcPathMatcher;

    @GetMapping
    public List<SurveyDTO> listar() {
        return sS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, SurveyDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody SurveyDTO dto) {
        ModelMapper m = new ModelMapper();
        Survey s = m.map(dto, Survey.class);
        sS.insertSurvey(s);
    }
    @PatchMapping
    public void actualizar(@RequestBody SurveyDTO dto) {
        ModelMapper m = new ModelMapper();
        Survey s = m.map(dto, Survey.class);
        sS.updateSurvey(s);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")int id) {
        sS.deleteSurvey(id);
    }

    @GetMapping("/buscar_titulo")
    public List<SurveyDTO> buscar(@RequestParam String tl) {
        return sS.buscarTitulo(tl).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, SurveyDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/buscarfecha")//busqueda por fecha exacta
    public List<SurveyDTO> buscarFecha(@RequestParam LocalDate f) {
        return sS.buscarFecha(f).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, SurveyDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/buscarfecharango")//busqueda por rango de fecha
    public List<SurveyDTO> buscarFecharango(@RequestParam("fechainicio") LocalDate fi,@RequestParam("fechafin") LocalDate ff) {
        return sS.buscarFecharango(fi,ff).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, SurveyDTO.class);
        }).collect(Collectors.toList());
    }


}
