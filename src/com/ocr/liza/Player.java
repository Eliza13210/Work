package com.ocr.liza;

public class Player {

    protected String person;
    protected int niveau;
    protected int force;
    protected int intelligence;
    protected int agility;
    protected int vitality;


    public Player(String person, int niveau,int force, int intelligence, int agility, int vitality) {
        this.person = person;
        this.agility = agility;
        this.force =force;
        this.intelligence = intelligence;
        this.niveau =niveau;
        this.vitality=vitality;

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

    public void setPerson(String person) {
        this.person = person;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void printPlayer(){

            //print out the choices made
           String playerSummary = "Woarg je suis un " + person + " " + "joueur1"
                    + " niveau " + niveau
                    + " je possède " + force + " de force, "
                    + agility + " d'agilité et "
                    + intelligence + " d'intelligence!";

            System.out.println(playerSummary);


    }

}