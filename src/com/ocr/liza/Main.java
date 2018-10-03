package com.ocr.liza;


public class Main {

    public static void main(String[] args) {

        //create player one

        Game player1 = new Game();
        player1.choosePlayer(1);
        Player playerOne = new Player("Joueur 1", player1.person, player1.niveau, player1.force,
                            player1.intelligence, player1.agility,player1.vitality);
        if (playerOne.getPerson() == "Guerrier") {
            playerOne = new Guerrier("Joueur 1", player1.person,player1.niveau, player1.force,
                    player1.intelligence, player1.agility,player1.vitality );
        } else if (playerOne.getPerson() == "Rodeur") {
            playerOne = new Rodeur("Joueur 1", player1.person, player1.niveau, player1.force,
                    player1.intelligence, player1.agility,player1.vitality);
        } else {
            playerOne = new Mage("Joueur 1", player1.person, player1.niveau, player1.force,
                    player1.intelligence, player1.agility,player1.vitality);
        }
        playerOne.printPlayer();

        //create the second player
        Game player2 = new Game();
        player2.choosePlayer(2);

        Player playerTwo = new Player("Joueur 2", player2.person, player2.niveau, player2.force, player2.intelligence,
                        player2.agility, player2.vitality);
        if (playerTwo.getPerson() == "Guerrier") {
            playerTwo = new Guerrier("Joueur 2", player2.person, player2.niveau, player2.force, player2.intelligence,
                    player2.agility, player2.vitality);
        } else if (playerTwo.getPerson() == "Rodeur") {
            playerTwo = new Rodeur("Joueur 2", player2.person, player2.niveau, player2.force, player2.intelligence,
                    player2.agility, player2.vitality);
        } else {
            playerTwo = new Mage("Joueur 2", player2.person, player2.niveau, player2.force, player2.intelligence,
                    player2.agility, player2.vitality);
        }
        playerTwo.printPlayer();

        //start playing, player one attacks first
        Attack attack = new Attack();
        attack.attack(playerOne, playerTwo);

    }
}