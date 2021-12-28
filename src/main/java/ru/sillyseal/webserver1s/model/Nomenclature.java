package ru.sillyseal.webserver1s.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "nomenclature")
public class Nomenclature {
    @Id
    @Column(name = "code", nullable = false)
    private String code;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name="type")
    private String type;

    @Column(name="producer")
    private String producer;

    @Column(name="price")
    private long price;

    @Column(name="unit")
    private String unit;

    @Column(name="description")
    private String description;

    @Column(name="barcode")
    private String barcode;

    public Nomenclature() { }

    public Nomenclature(String code, String name, String type, String producer, long price, String unit, String description, String barcode) {
        this.code = code;
        this.name = name;
        this.type = type;
        this.producer = producer;
        this.price = price;
        this.unit = unit;
        this.description = description;
        this.barcode = barcode;
    }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getProducer() { return producer; }
    public void setProducer(String producer) { this.producer = producer; }

    public long getPrice() { return price; }
    public void setPrice(long price) { this.price = price; }

    public String getUnit() { return unit; }
    public void setUnit(String unit) { this.unit = unit; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getBarcode() { return barcode;}
    public void setBarcode(String barcode) { this.barcode = barcode; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nomenclature nomenclature = (Nomenclature) o;
        return Objects.equals(code, nomenclature.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}