package pe.edu.upc.musictool.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.musictool.dtos.SurveyDTO;
import pe.edu.upc.musictool.entities.Survey;
import pe.edu.upc.musictool.serviceinterfaces.ISurveyService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/encuestas")
public class SurveyController {
    @Autowired
    private ISurveyService sS;
    @GetMapping
    public List<SurveyDTO> listar() {

        return sS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, SurveyDTO.class);
        }).collect(Collectors.toList());
    }

}
