package pe.edu.upc.musictool.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.musictool.dtos.MerchandisingDTO;
import pe.edu.upc.musictool.entities.Merchandising;
import pe.edu.upc.musictool.serviceinterfaces.IMerchandisingService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Merchandising")

public class MerchandisingController {

    @Autowired
    private IMerchandisingService mS;

    @GetMapping
    public List<MerchandisingDTO> list() {
        return mS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, MerchandisingDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertMerchandising(@RequestBody MerchandisingDTO dto) {
        ModelMapper m = new ModelMapper();
        Merchandising i = m.map(dto, Merchandising.class);
        mS.insertMerchandising(i);
    }


    @PatchMapping
    public void updateMerchandising(@RequestBody MerchandisingDTO dto) {
        ModelMapper m = new ModelMapper();
        Merchandising me = m.map(dto, Merchandising.class);
        mS.updateMerchandising(me);
    }

    @DeleteMapping("/{id}")
    public void deleteMerchandising(@PathVariable("id") int id) {
        mS.deleteMerchandising(id);
    }

}
