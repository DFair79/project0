package com.revature.models;

public class SuperCharacter {

    private int character_id;
    private String character_name;
    private String home_planet;

    private Villain villain;

    private int villain_id_fk;
    

    public SuperCharacter() {

    }

    public SuperCharacter(int character_id, String character_name, String home_planet, Villain villain) {
        this.character_id = character_id;
        this.character_name = character_name;
        this.home_planet = home_planet;
        this.villain = villain;
    }

    public SuperCharacter(String character_name, String home_planet, Villain villain) {
        this.character_name = character_name;
        this.home_planet = home_planet;
        this.villain = villain;
    }

    public SuperCharacter(String character_name, String home_planet, int villain_id_fk) {
        this.character_name = character_name;
        this.home_planet = home_planet;
        this.villain_id_fk = villain_id_fk;
    }

    public int getCharacter_id() {
        return character_id;
    }

    public void setCharacter_id(int character_id) {
        this.character_id = character_id;
    }

    public String getCharacter_name() {
        return character_name;
    }

    public void setCharacter_name(String character_name) {
        this.character_name = character_name;
    }

    public String getHome_planet() {
        return home_planet;
    }

    public void setHome_planet(String home_planet) {
        this.home_planet = home_planet;
    }

    public Villain getVillain() {
        return villain;
    }

    public void setVillain(Villain villain) {
        this.villain = villain;
    }

    public int getVillain_id_fk() {
        return villain_id_fk;
    }

    public void setVillain_id_fk(int villain_id_fk) {
        this.villain_id_fk = villain_id_fk;
    }

    @Override
    public String toString() {
        return "SuperCharacter{" +
                "character_id=" + character_id +
                ", character_name='" + character_name + '\'' +
                ", home_planet='" + home_planet + '\'' +
                ", villain=" + villain +
                ", villain_id_fk=" + villain_id_fk +
                '}';
    }
}



