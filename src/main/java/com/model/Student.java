package com.model;



public class Student {
    private int id;
    private String city;
    private double percentage;
    private String name;

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
        this.percentage = percentage;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {return name;
    }

    public String setName(String name) {
        return name;
    }

    public double getPercentage(double percentage) {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }


    public double getPercentage() {
        return percentage;
    }
}
