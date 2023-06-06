package com.revature.models;

public class Supercharacter {
    private int character_id;
    private String name;
    private String home_planet;

    public Supercharacter() {

    }

    public Supercharacter(int character_id, String name, String home_planet) {
        this.character_id = character_id;
        this.name = name;
        this.home_planet = home_planet;
    }

    public Supercharacter(String name, String home_planet) {
        this.name = name;
        this.home_planet = home_planet;
    }

    public int getCharacter_id() {
        return character_id;
    }

    public void setCharacter_id(int character_id) {
        this.character_id = character_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHome_planet() {
        return home_planet;
    }

    public void setHome_planet(String home_planet) {
        this.home_planet = home_planet;
    }

    @Override
    public String toString() {
        return "Supercharacter{" +
                "character_id=" + character_id +
                ", name='" + name + '\'' +
                ", home_planet='" + home_planet + '\'' +
                '}';
    }
}
