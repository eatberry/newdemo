package com.microservice.model;

public class PCService {
    private String pname;
    private Double price;
    private String brand;
    private String pspecs;

    @Override
    public String toString() {
        return "PCService{" +
                "pname='" + pname + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", pspecs='" + pspecs + '\'' +
                '}';
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
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

    public String getPspecs() {
        return pspecs;
    }

    public void setPspecs(String pspecs) {
        this.pspecs = pspecs;
    }

    public PCService() {
    }

    public PCService(String pname, Double price, String brand, String pspecs) {

        this.pname = pname;
        this.price = price;
        this.brand = brand;
        this.pspecs = pspecs;
    }
}
