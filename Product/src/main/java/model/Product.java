package model;

import utils.DateUtils;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Product {
    private long id;
    private String name;
    private String description;
    private float price;
    private Instant createAt;
    private LocalDate deleteAt;
    private ECategory eCategory;
    public Product(){

    }

    public Product(long id, String name, String description, float price, Instant createAt, LocalDate deleteAt, ECategory eCategory) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.createAt = createAt;
        this.deleteAt = deleteAt;
        this.eCategory = eCategory;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Instant getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Instant createAt) {
        this.createAt = createAt;
    }

    public LocalDate getDeleteAt() {
        return deleteAt;
    }

    public void setDeleteAt(LocalDate deleteAt) {
        this.deleteAt = deleteAt;
    }

    public ECategory geteCategory() {
        return eCategory;
    }

    public void seteCategory(ECategory eCategory) {
        this.eCategory = eCategory;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s,%s,%s\n" ,this.id, this.name, this.description, this.price, DateUtils.formatInstant(this.createAt), DateUtils.formatLocalDate(this.deleteAt),this.eCategory);
    }
}
