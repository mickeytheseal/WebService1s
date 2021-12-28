package ru.sillyseal.webserver1s.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.sillyseal.webserver1s.service.NomenclatureService;
import ru.sillyseal.webserver1s.model.Nomenclature;

import java.util.List;

@RestController
@RequestMapping("/api/nomenclature")
@Validated
public class NomenclatureController {
    private final NomenclatureService nomenclatureService;

    @Autowired
    public NomenclatureController(NomenclatureService nomenclatureService) {
        this.nomenclatureService = nomenclatureService;
    }

    @PostMapping("/add")
    public void registerIncome(@RequestParam("code") String code,
                               @RequestParam("name") String name,
                               @RequestParam("type") String type,
                               @RequestParam("producer") String producer,
                               @RequestParam("price") long price,
                               @RequestParam("unit") String unit,
                               @RequestParam("description") String description,
                               @RequestParam("barcode") String barcode){
        nomenclatureService.addNomenclature(code,name,type,producer,price,unit,description,barcode);
    }

    @DeleteMapping("/delete")
    public void registerOutcome(@RequestParam("code") String code){
        nomenclatureService.deleteNomenclature(code);
    }

    @GetMapping("/all")
    public List<Nomenclature> allSocks() {
        return nomenclatureService.getNomenclature();
    }
}
