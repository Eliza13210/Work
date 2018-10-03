package com.ocr.liza;

public class Game {

    String person;
    String player;
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

        //let the player choose character and check if choice is in the range
        CheckIfInputIsValidNumber chooseCharacter=new CheckIfInputIsValidNumber();
        int choice= chooseCharacter.checkInput(1,3);
        chooseCharacter(choice);
        chooseNiveauAgilityForceIntelligence();
    }

        //set players character
        public void chooseCharacter(int choice){
        switch (choice) {
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
    }

    //register niveau, force, agility, intelligence and vitality

    private void chooseNiveauAgilityForceIntelligence() {

        do {
            CheckIfInputIsValidNumber chooseNumber=new CheckIfInputIsValidNumber();
            System.out.println("Niveau du personnage? Choisi un chiffre entre 1 et 100");
             niveau = chooseNumber.checkInput(1,100);

            System.out.println("Force du personnage? Choisi un chiffre entre 0 et 100");
            force = chooseNumber.checkInput(0,100);

            System.out.println("Agilité du personnage? Choisi un chiffre entre 0 et 100");
            agility = chooseNumber.checkInput(0,100);

            System.out.println("Intelligence du personnage? Choisi un chiffre entre 0 et 100");
            intelligence = chooseNumber.checkInput(0,100);

            if (force + agility + intelligence != niveau)
                System.out.println("Attention le total force + agilité + intelligence doit être égal au niveau du joueur.");

        } while (force + agility + intelligence != niveau);
        vitality = niveau * 5;
    }

}
