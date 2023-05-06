package com.sparta.me.OOP.TeamActivity;

public abstract class Vehicle {

    private String model;
    private String manufacturer;
    private String owner;
    private int year;

    public Vehicle(String model, String manufacturer, String owner, int year) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.owner = owner;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getOwner() {
        return owner;
    }

    public int getYear() {
        return year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setYear(int year) {
        this.year = year;
    }

    void MOT(){
        System.out.println("MOT passed");
    }
}
