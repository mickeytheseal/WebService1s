package ru.sillyseal.webserver1s.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sillyseal.webserver1s.model.Nomenclature;
import ru.sillyseal.webserver1s.repository.NomenclatureRepository;

import java.util.List;

@Service
public class NomenclatureService {

    private final NomenclatureRepository nomenclatureRepository;

    @Autowired
    public NomenclatureService(NomenclatureRepository nomenclatureRepository) {
        this.nomenclatureRepository = nomenclatureRepository;
    }

    public void addNomenclature(String code, String name, String type, String producer,
                                long price, String unit, String description, String barcode){
            nomenclatureRepository.save(new Nomenclature(code,name,type,producer,price,unit,description,barcode));
    }

    public void deleteNomenclature(String code){
        Nomenclature toDelete = nomenclatureRepository.getById(code);
        nomenclatureRepository.delete(toDelete);
    }

    public List<Nomenclature> getNomenclature(){
        return nomenclatureRepository.findAll();
    }

}
