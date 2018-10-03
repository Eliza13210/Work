package com.ocr.liza;


public class Main {

    public static void main(String[] args) {

        // start creating first player and let them choose the character
        Game player1 = new Game();
        player1.choosePlayer(1);

        //check if the players choice is in the range of 1 to 3
        CheckIfInputIsValidNumber chooseCharacter=new CheckIfInputIsValidNumber();
        int choice= chooseCharacter.checkInput(1,3);

        //set character
        player1.chooseCharacter(choice);
        String character1 =player1.person;

                //set niveau agility force  intelligence and vitality
        player1.chooseNiveauAgilityForceIntelligence();

        //create the new player
        Player playerOne = new Player("Joueur 1", character1, player1.niveau, player1.force,
                            player1.intelligence, player1.agility,player1.vitality);
        if (playerOne.getPerson() == "Guerrier") {
            playerOne = new Guerrier("Joueur 1", character1,player1.niveau, player1.force,
                    player1.intelligence, player1.agility,player1.vitality );
        } else if (playerOne.getPerson() == "Rodeur") {
            playerOne = new Rodeur("Joueur 1", character1, player1.niveau, player1.force,
                    player1.intelligence, player1.agility,player1.vitality);
        } else {
            playerOne = new Mage("Joueur 1", character1, player1.niveau, player1.force,
                    player1.intelligence, player1.agility,player1.vitality);
        }
        playerOne.printPlayer();


        //start creating the second player
        Game player2 = new Game();
        player2.choosePlayer(2);

        //check if the players choice is in the range of 1 to 3
        CheckIfInputIsValidNumber chooseCharacter2=new CheckIfInputIsValidNumber();
        int choice2= chooseCharacter2.checkInput(1,3);

        //set player character
        player2.chooseCharacter(choice2);
        String character2 =player2.person;

        //set niveau agility force  intelligence and vitality
        player2.chooseNiveauAgilityForceIntelligence();

        //create the second player
        Player playerTwo = new Player("Joueur 2", character2, player2.niveau, player2.force, player2.intelligence,
                        player2.agility, player2.vitality);
        if (playerTwo.getPerson() == "Guerrier") {
            playerTwo = new Guerrier("Joueur 2", character2, player2.niveau, player2.force, player2.intelligence,
                    player2.agility, player2.vitality);
        } else if (playerTwo.getPerson() == "Rodeur") {
            playerTwo = new Rodeur("Joueur 2", character2, player2.niveau, player2.force, player2.intelligence,
                    player2.agility, player2.vitality);
        } else {
            playerTwo = new Mage("Joueur 2", character2, player2.niveau, player2.force, player2.intelligence,
                    player2.agility, player2.vitality);
        }
        playerTwo.printPlayer();

        //start playing, player one attacks first
        Attack attack = new Attack();
        attack.attack(playerOne, playerTwo);

    }
}