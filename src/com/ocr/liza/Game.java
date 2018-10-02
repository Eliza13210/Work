package com.ocr.liza;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {

    Scanner sc = new Scanner(System.in);
    String playerSummary = " ";
    String person;
    String[] responses = {"guerrier", "rodeur", "mage"};
    int niveau;
    int force;
    int intelligence;
    int agility;
    public int choosePlayer;
    String player;
    int vitality;
    int set;
    int nbResponse;
    Player playerOne;
    Player playerTwo;



    // create player


    public String chooseCharacter(int choosePlayer) {
        if (choosePlayer == 1) {
            player = "Joueur 1";
        } else {
            player = "Joueur 2";
        }
        System.out.println(player + " : Veuillez choisir la classe de votre personnage: 1: Guerrier 2: Rodeur 3: Mage");
        //check if put a valide value
        int nbResponse = 0;
        boolean responseIsGood;
        do {
            try {
                nbResponse = sc.nextInt();
                responseIsGood = (nbResponse >= 1 && nbResponse <= 3);

            } catch (InputMismatchException e) {
                sc.next();
                responseIsGood = false;
            }
        } while (!responseIsGood);

        //register response
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


    //register niveau, force, agility, intelligence


    public int chooseNiveauAgilityForceIntelligence() {
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
        return niveau;

    }
}
