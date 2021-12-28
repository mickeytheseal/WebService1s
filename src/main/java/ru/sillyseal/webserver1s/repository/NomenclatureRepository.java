package ru.sillyseal.webserver1s.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sillyseal.webserver1s.model.Nomenclature;

@Repository
public interface NomenclatureRepository extends JpaRepository<Nomenclature, String> {

}