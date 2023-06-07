package com.revature.models;

public class Supercharacter {
    private int character_id;
    private String name;
    private String home_planet;

    private Villain villain;

    private int villian_id_fk;

    public Supercharacter() {

    }

    public Supercharacter(int character_id, String name, String home_planet, Villain villain) {
        this.character_id = character_id;
        this.name = name;
        this.home_planet = home_planet;
        this.villain = villain;
    }

    public Supercharacter(String name, String home_planet, Villain villain) {
        this.name = name;
        this.home_planet = home_planet;
        this.villain = villain;
    }

    public Supercharacter(String name, String home_planet, int villian_id_fk) {
        this.name = name;
        this.home_planet = home_planet;
        this.villian_id_fk = villian_id_fk;
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

    public Villain getVillian() {
        return villain;
    }

    public void setVillian(Villain villain) {
        this.villain = villain;
    }

    public int getVillian_id_fk() {
        return villian_id_fk;
    }

    public void setVillian_id_fk(int villian_id_fk) {
        this.villian_id_fk = villian_id_fk;
    }

    @Override
    public String toString() {
        return "Supercharacter{" +
                "character_id=" + character_id +
                ", name='" + name + '\'' +
                ", home_planet='" + home_planet + '\'' +
                ", villian=" + villain +
                ", villian_id_fk=" + villian_id_fk +
                '}';
    }
}



