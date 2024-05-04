package org.example;

public class Laptop {
    private String name;
    private String price;
    private String ram;
    private String storageType;

    public Laptop(String name, String price, String ram, String storageType) {
        this.name = name;
        this.price = price;
        this.ram = ram;
        this.storageType = storageType;
    }

    public String getName (){
        return name;
    }
    private void setName(String name) {
        this.name = name;
    }

    public String getPrice () {
        return price;
    }

    private void setPrice(String price) {
        this.price = price;
    }

    public String getRam(){
        return ram;
    }

    private void setRam(String ram) {
        this.ram = ram;
    }

    public String getStorageType(){
        return storageType;
    }

    private void setStorageType(String storageType){
        this.storageType = storageType;
    }


}
