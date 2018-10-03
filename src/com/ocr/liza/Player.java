package com.ocr.liza;

public class Player {

    protected String person;
    protected int niveau;
    protected double force;
    protected int intelligence;
    protected double agility;
    protected double vitality;
    protected String joueur;

public Player(String joueur, String person, int niveau, double force, int intelligence, double agility, double vitality){
    this.joueur=joueur;
    this.person=person;
    this.niveau=niveau;
    this.force=force;
    this.intelligence=intelligence;
    this.agility=agility;
    this.vitality=vitality;
}

    public String getJoueur() {
        return joueur;
    }

    public double getVitality() {
        return vitality;
    }

    public void setVitality(double vitality) {
        this.vitality = vitality;
    }

    public String getPerson() {
        return person;
    }

    public int getNiveau() {
        return niveau;
    }

    public double getForce() {
        return force;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public double getAgility() {
        return agility;
    }


    public void setAgility(double agility) {
        this.agility = agility;
    }
    public void printPlayer(){

        //print out the choices made
    }
    public void basicAttack(Player playerOne, Player playerTwo){

    }
    public void specialAttack(Player playerOne, Player playerTwo){

    }

}