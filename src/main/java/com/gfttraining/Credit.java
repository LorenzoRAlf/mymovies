package com.gfttraining;

public abstract class Credit {

    private boolean adult;
    private Integer gender;
    private String known_for_department;
    private String name;
    private String original_name;
    private double popularity;


    public Credit(){}

    public Credit(boolean adult, Integer gender, String known_for_department, String name, String original_name,
                  double popularity) {
        this.adult = adult;
        this.gender = gender;
        this.known_for_department = known_for_department;
        this.name = name;
        this.original_name = original_name;
        this.popularity = popularity;
    }


    public boolean isAdult() {
        return adult;
    }
    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public Integer getGender() {
        return gender;
    }
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getKnown_for_department() {
        return known_for_department;
    }
    public void setKnown_for_department(String known_for_department) {
        this.known_for_department = known_for_department;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getOriginal_name() {
        return original_name;
    }
    public void setOriginal_name(String original_name) {
        this.original_name = original_name;
    }

    public double getPopularity() {
        return popularity;
    }
    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }


    @Override
    public String toString() {
        return "Credit{" +
                "adult=" + adult +
                ", gender=" + gender +
                ", known_for_department='" + known_for_department + '\'' +
                ", name='" + name + '\'' +
                ", original_name='" + original_name + '\'' +
                ", popularity=" + popularity +
                '}';
    }
}
