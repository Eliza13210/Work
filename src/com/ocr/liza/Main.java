package com.ocr.liza;


public class Main {

    public static void main(String[] args) {

        //create the first player
        Game player1 = new Game();
        String person = player1.chooseCharacter(1);
        Player playerOne = new Player("Joueur 1", person, 15, 5, 5, 5, 50);

        if (playerOne.getPerson() == "Guerrier") {
            playerOne = new Guerrier("Joueur 1", person, 15, 5, 5, 5, 50);
        } else if (playerOne.getPerson() == "Rodeur") {
            playerOne = new Rodeur("Joueur 1", person, 15, 5, 5, 5, 50);
            } else {
            playerOne = new Mage("Joueur 1", person, 15, 5, 5, 5, 50);
        }

        playerOne.printPlayer();


        //create the second player
        Game player2 = new Game();
        String person2 = player2.chooseCharacter(2);
        Player playerTwo = new Player("Joueur 2", person2, 15, 5, 5, 5, 50);

        if (playerTwo.getPerson() == "Guerrier") {
            playerTwo = new Guerrier("Joueur 2", person2, 15, 5, 5, 5, 50);
        } else if (playerTwo.getPerson() == "Rodeur") {
            playerTwo = new Rodeur("Joueur 2", person2, 15, 5, 5, 5, 50);
        } else {
            playerTwo = new Mage("Joueur 2", person2, 15, 5, 5, 5, 50);
        }

        playerTwo.printPlayer();

        //start playing
        Attack attack = new Attack();
        attack.attack(playerOne, playerTwo);


    }
}