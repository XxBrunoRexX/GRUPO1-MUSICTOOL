package pe.edu.upc.musictool.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.musictool.dtos.AnswerDTO;
import pe.edu.upc.musictool.dtos.SurveyDTO;
import pe.edu.upc.musictool.entities.Answer;
import pe.edu.upc.musictool.entities.Survey;
import pe.edu.upc.musictool.serviceinterfaces.IAnswerService;
import pe.edu.upc.musictool.serviceinterfaces.ISurveyService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/respuestas")
public class AnswerController {
@Autowired
private IAnswerService aS;
    @GetMapping
    public List<AnswerDTO> listar() {
        return aS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, AnswerDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody AnswerDTO dto) {
        ModelMapper m = new ModelMapper();
        Answer a = m.map(dto, Answer.class);
        aS.insert(a);
    }
    @PatchMapping
    public void actualizar(@RequestBody AnswerDTO dto) {
        ModelMapper m = new ModelMapper();
        Answer a = m.map(dto, Answer.class);
        aS.update(a);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")int id) {
        aS.delete(id);
    }


}
