package com.ocr.liza;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {

    Scanner sc = new Scanner(System.in);
    String person;
    String[] responses = {"guerrier", "rodeur", "mage"};
    public int choosePlayer;
    String player;
    int nbResponse;
    int choice;
    int niveau;
    int force;
    int intelligence;
    int agility;
    int vitality;

    // create player
    public void choosePlayer(int choosePlayer) {
        if (choosePlayer == 1) {
            player = "Joueur 1";
        } else {
            player = "Joueur 2";
        }
        System.out.println(player + " : Veuillez choisir la classe de votre personnage: 1: Guerrier 2: Rodeur 3: Mage");

        CheckIfInputIsValidNumber chooseCharacter=new CheckIfInputIsValidNumber();
        int choice= chooseCharacter.checkInput(1,3);
    }

        //set players character
        public String chooseCharacter(int nbResponse){
        switch (nbResponse) {
            case 1:
                person = "Guerrier";
                break;
            case 2:
                person = "Rodeur";
                break;
            case 3:
                person = "Mage";
                break;
        }
        return person;
    }

    //register niveau, force, agility, intelligence and vitality

    public void chooseNiveauAgilityForceIntelligence() {

        do {
            System.out.println("Niveau du personnage?");
            niveau = sc.nextInt();
            if (niveau < 1 || niveau > 100)
                throw new IllegalArgumentException("Choisi un chiffre entre 1 et 100");

            System.out.println("Force du personnage?");
            force = sc.nextInt();
            if (niveau < 0 || niveau > 100)
                throw new IllegalArgumentException("Choisi un chiffre entre 1 et 100");

            System.out.println("Agilité du personnage?");
            agility = sc.nextInt();
            if (niveau < 0 || niveau > 100)
                throw new IllegalArgumentException("Choisi un chiffre entre 1 et 100");

            System.out.println("Intelligence du personnage?");
            intelligence = sc.nextInt();
            if (niveau < 0 || niveau > 100)
                throw new IllegalArgumentException("Choisi un chiffre entre 1 et 100");

            if (force + agility + intelligence != niveau)
                System.out.println("Attention le total force + agilité + intelligence doit être égal au niveau du joueur.");

        } while (force + agility + intelligence != niveau);
        vitality = niveau * 5;

    }

}
