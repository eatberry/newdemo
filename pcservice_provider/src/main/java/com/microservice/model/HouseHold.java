package com.microservice.model;

public class HouseHold {
    private String name;
    private Double price;
    private String brand;
    private String specs;

    public HouseHold() {
    }

    public HouseHold(String name, Double price, String brand, String specs) {

        this.name = name;
        this.price = price;
        this.brand = brand;
        this.specs = specs;
    }

    @Override
    public String toString() {
        return "HouseHold{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", specs='" + specs + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }
}
