package com.ocr.liza;

public class Player1 {

    private String person;
    private int niveau;
    private int force;
    private int intelligence;
    private int agility;

    private int vitality =niveau *5;



    public Player1(String person, int niveau,int force, int intelligence, int agility) {
        this.person = person;
        this.agility = agility;
        this.force =force;
        this.intelligence = intelligence;
        this.niveau =niveau;

    }
    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public String getPerson() {
        return person;
    }
    public int getNiveau() {
        return niveau;
    }

    public int getForce() {
        return force;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getAgility() {
        return agility;
    }

}