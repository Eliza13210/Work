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


public void newGame(){
    createPlayer(1);
    createPlayer(2);
faireAttack(playerTwo,playerOne);

}

    // create player
    public void createPlayer(int choosePlayer) {


        /** Save player
         * choosePlayer = Player
         */

        if (choosePlayer == 1) {
            player = "Joueur 1";
            set=1;

        } else {
            player = "Joueur 2";
            set=2;

        }
        startGame();
    }
        public String startGame () {
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
                    person = "guerrier";
                    break;
                case 2:
                    person = "rodeur";

                    break;
                case 3:
                    person = "mage";
                    break;
            }

            chooseNiveauAgilityForceIntelligence();
            return person;
        }


        //register niveau, force, agility, intelligence


        public void chooseNiveauAgilityForceIntelligence () {
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


           // newPlayer(set);
        }



        /**public void newPlayer(int set){

        switch(set){
            case 1:
                Player playerOne = new Player(person, niveau, force, intelligence, agility);
                playerOne.printPlayer();
            break;
            case 2:
                Player playerTwo = new Player(person, niveau, force, intelligence, agility);
                playerTwo.printPlayer();
                break;
                }
        }*/
    public void faireAttack(Player player1, Player player2){
        int hit=player2.getForce();
        int v1=player1.getVitality();
        int newV= v1-hit;
        player1.setVitality(newV);
        System.out.println("Joueur 2; " + newV);
    }
    /**

    public void attacker(){
    int v1=playerOne.getVitality();
    int v2=playerTwo.getVitality();

    Attack attack=new Attack();
    attack.faireAttack(playerTwo, playerOne);

        }*/







}







