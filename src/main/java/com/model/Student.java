package com.model;

public class Student {
    private int id;
    private  String name;
    private String city;
    private double percentage;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }
    public Student(){
        super();
    }

    public Student(String city, int id, String name, double percentage) {
        this.city = city;
        this.id = id;
        this.name = name;
        this.percentage = percentage;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName(String hahhhHabh) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPercentage(double v) {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }


}
