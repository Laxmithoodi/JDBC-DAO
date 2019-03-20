package models;

import daos.DTO;

public class Car implements DTO {

    private String make;
    private String model;
    private String color;
    private int id;
    private int year;
    private int vin;



    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    @Override
    public String toString() {
        return "Car ={" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", id=" + id +
                ", year=" + year +
                ", vin=" + vin +
                "}" +"\n";
//
//        return "id"+this.id+" " +
//                "make" + this.getMake()+ " " +
//                "model" + this.getModel() + " " +
//                "year" + this.getYear() + " " +
//                "color" + this.getColor() + " "+
//                "vin" + this.getVin() + "\n";



    }
}
