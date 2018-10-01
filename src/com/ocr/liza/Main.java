package com.ocr.liza;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String person;
        String[] responses = {"guerrier", "rodeur", "mage"};
        int niveau;
        int force;
        int intelligence;
        int agility;
        int choosePlayer;
        String player;
        int vitality;
        int set = 1;
        int nbResponse;

        // create playerOne a

        System.out.println("Joueur 1: Veuillez choisir la classe de votre personnage: 1: Guerrier 2: Rodeur 3: Mage");

        //check if put a valide value
        nbResponse = 0;
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

        //register response and create new Player
        if (nbResponse == 1) {
            person = "guerrier";
        } else if (nbResponse == 2) {
            person = "rodeur";
        } else {
            person = "mage";
        }

        //register niveau, force, agility, intelligence

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
        vitality=niveau*5;
        Player playerOne = new Player(person, niveau, force, intelligence, agility, vitality);

        playerOne.printPlayer();

            // create playerTwo
            System.out.println("Joueur 2: Veuillez choisir la classe de votre personnage: 1: Guerrier 2: Rodeur 3: Mage");

            //check if put a valide value
            nbResponse = 0;
            boolean responseIsGood2;
            do {
                try {
                    nbResponse = sc.nextInt();
                    responseIsGood2 = (nbResponse >= 1 && nbResponse <= 3);

                } catch (InputMismatchException e) {
                    sc.next();
                    responseIsGood2 = false;
                }
            } while (!responseIsGood2);

            //register response and create new Player
            if (nbResponse == 1) {
                person = "guerrier";
            } else if (nbResponse == 2) {
                person = "rodeur";
            } else {
                person = "mage";
            }

            //register niveau, force, agility, intelligence

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

            vitality=niveau*5;
            Player playerTwo = new Player(person, niveau, force, intelligence, agility, vitality);


//Game starts
        Guerrier guerrier=new Guerrier();
        guerrier.basicAttack(playerOne,playerTwo);
        int v2=playerTwo.getVitality();
        System.out.println(v2);
}
}

