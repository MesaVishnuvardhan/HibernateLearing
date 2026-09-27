package org.Vishnu;


import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;

@Embeddable
public class Laptop {

    private String laptopBrand;
    private String laptopModel;
    private String laptopSize;
    private int laptopPrice;


    public Laptop(){

    }

    public String getLaptopBrand() {
        return laptopBrand;
    }

    public void setLaptopBrand(String laptopBrand) {
        this.laptopBrand = laptopBrand;
    }

    public String getLaptopModel() {
        return laptopModel;
    }

    public void setLaptopModel(String laptopModel) {
        this.laptopModel = laptopModel;
    }

    public String getLaptopSize() {
        return laptopSize;
    }

    public void setLaptopSize(String laptopSize) {
        this.laptopSize = laptopSize;
    }

    public int getLaptopPrice() {
        return laptopPrice;
    }

    public void setLaptopPrice(int laptopPrice) {
        this.laptopPrice = laptopPrice;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "laptopBrand='" + laptopBrand + '\'' +
                ", laptopModel='" + laptopModel + '\'' +
                ", laptopSize='" + laptopSize + '\'' +
                ", laptopPrice=" + laptopPrice +
                '}';
    }
}
