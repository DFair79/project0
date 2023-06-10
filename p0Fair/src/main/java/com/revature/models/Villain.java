package com.revature.models;

public class Villain {
    private int villain_id;
    private String villain_name;
    private String home_planet;

    public Villain() {

    }

    public Villain(int villain_id, String villain_name, String home_planet) {
        this.villain_id = villain_id;
        this.villain_name = villain_name;
        this.home_planet = home_planet;
    }

    public Villain(String villain_name, String home_planet) {
        this.villain_name = villain_name;
        this.home_planet = home_planet;
    }

    public int getVillain_id() {
        return villain_id;
    }

    public void setVillain_id(int villain_id) {
        this.villain_id = villain_id;
    }

    public String getVillain_name() {
        return villain_name;
    }

    public void setVillain_name(String villain_name) {
        this.villain_name = villain_name;
    }

    public String getHome_planet() {
        return home_planet;
    }

    public void setHome_planet(String home_planet) {
        this.home_planet = home_planet;
    }

    @Override
    public String toString() {
        return "Villain{" +
                "villain_id=" + villain_id +
                ", villain_name='" + villain_name + '\'' +
                ", home_planet='" + home_planet + '\'' +
                '}';
    }
}
