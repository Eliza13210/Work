package com.ocr.liza;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

//test printPlayer method
    @Test
    public void Given_NewGuerrier_When_ChoosingCharacterAndNiveauForceIntelligenceAgilityVitality_Then_PrintOutChoices() {
        Player playerOne=new Guerrier("Joueur 1", "Guerrier", 15,5,5,5,25);
        playerOne.printPlayer();
        assertEquals("Woarg je suis un Guerrier Joueur 1 niveau 15 je possède 5 de force, 5 d'agilité et 5 d'intelligence!\n",
                outContent.toString().replace("\r\n", "\n"));
    }

    @Test
    public void Given_NewRodeur_When_ChoosingCharacterAndNiveauForceIntelligenceAgilityVitality_Then_PrintOutChoices() {
        Player playerOne=new Rodeur("Joueur 1", "Rodeur", 15,5,5,5,25);
        playerOne.printPlayer();
        assertEquals("Hello je suis un Rodeur Joueur 1 niveau 15.0 je possède 5.0 de force, 5.0 d'agilité et 5 d'intelligence!\n",
                outContent.toString().replace("\r\n", "\n"));
    }
    @Test
    public void Given_NewMage_When_ChoosingCharacterAndNiveauForceIntelligenceAgilityVitality_Then_PrintOutChoices() {
        Player playerOne=new Mage("Joueur 1", "Mage", 15,5,5,5,25);
        playerOne.printPlayer();
        assertEquals("Abracadabra je suis un Mage Joueur 1 niveau 15.0 je possède 5.0 de force, 5.0 d'agilité et 5 d'intelligence!\n",
                outContent.toString().replace("\r\n", "\n"));
    }

    // Test the chooseCharacter methods
    @Test
    public void Given_PlayerGuerrier_When_ChoosingPlayerCharacter_Then_PrintOutPlayersCharacter() {
        Game test= new Game();
        test.chooseCharacter(1);
        System.out.println(test.person);
        assertEquals(test.person="Guerrier\n",
                outContent.toString().replace("\r\n", "\n"));
    }
    @Test
    public void Given_PlayerRodeur_When_ChoosingPlayerCharacter_Then_PrintOutPlayersCharacter() {
        Game test= new Game();
        test.chooseCharacter(2);
        System.out.println(test.person);
        assertEquals(test.person="Rodeur\n",
                outContent.toString().replace("\r\n", "\n"));
    }
    @Test
    public void Given_PlayerMage_When_ChoosingPlayerCharacter_Then_PrintOutPlayersCharacter() {
        Game test= new Game();
        test.chooseCharacter(3);
        System.out.println(test.person);
        assertEquals(test.person="Mage\n",
                outContent.toString().replace("\r\n", "\n"));
    }

    @Test
    public void Given_GuerrierBasicAttack_When_ChoosingAttack_Then_DisplayTheGuerrierBasicAttackSentence() {
        Guerrier guerrier=new Guerrier("Joueur 1", "Guerrier", 15,5,5,5,75);
        Mage mage=new Mage("Joueur 2", "Mage", 15,8,2,5,75);
        guerrier.basicAttack(guerrier, mage);
        assertEquals("Joueur 1 utilise Coup d'Epée et inflige 5.0 dommages\nJoueur 2 perd 5.0 point de vie\n",
                outContent.toString().replace("\r\n", "\n"));
    }

    //test the basic and special attack for each character
    @Test
    public void Given_GuerrierSpecialAttack_When_ChoosingAttack_Then_DisplayTheGuerrierSpecialAttackSentence() {
        Guerrier guerrier=new Guerrier("Joueur 1", "Guerrier", 15,5,5,5,75);
        Mage mage=new Mage("Joueur 2", "Mage", 15,8,2,5,75);
        guerrier.specialAttack(guerrier, mage);
        assertEquals("Joueur 1 utilise Coup de rage et inflige 10.0 dommages\nJoueur 2 perd 10.0 point de vie\nJoueur 1 perd 2.5 de point de vie\n",
                outContent.toString().replace("\r\n", "\n"));
    }
    @Test
    public void Given_RodeurBasicAttack_When_ChoosingAttack_Then_DisplayTheRodeurBasicAttackSentence() {
        Rodeur rodeur=new Rodeur("Joueur 1", "Rodeur", 15,5,5,5,75);
        Mage mage=new Mage("Joueur 2", "Mage", 15,8,2,5,75);
        rodeur.basicAttack(rodeur, mage);
        assertEquals("Joueur 1 utilise Tir à l'Arc et inflige 5.0 dommages\nJoueur 2 perd 5.0 point de vie\n",
                outContent.toString().replace("\r\n", "\n"));
    }
    @Test
    public void Given_RodeurSpecialAttack_When_ChoosingAttack_Then_DisplayTheRodeurSpecialAttackSentence() {
        Rodeur rodeur=new Rodeur("Joueur 1", "Rodeur", 15,5,5,5,75);
        Mage mage=new Mage("Joueur 2", "Mage", 15,8,2,5,75);
        rodeur.specialAttack(rodeur, mage);
        assertEquals("Joueur 1 utilise Concentration et gagne 7.5 en agilité\n",
                outContent.toString().replace("\r\n", "\n"));
    }
    @Test
    public void Given_MageBasicAttack_When_ChoosingAttack_Then_DisplayTheMageBasicAttackSentence() {
        Mage mage=new Mage("Joueur 1", "Mage", 15,5,5,5,75);
        Guerrier guerrier=new Guerrier("Joueur 2", "Guerrier", 15,8,2,5,75);
        mage.basicAttack(mage, guerrier);
        assertEquals("Joueur 1 utilise Boule de feu et inflige 5.0 dommages\nJoueur 2 perd 5.0 point de vie\n",
                outContent.toString().replace("\r\n", "\n"));
    }
    @Test
    public void Given_MageSpecialAttack_When_ChoosingAttack_Then_DisplayTheMageSpecialAttackSentence() {
        Mage mage=new Mage("Joueur 1", "Mage", 15,5,5,5,75);
        Guerrier guerrier=new Guerrier("Joueur 2", "Guerrier", 15,8,2,5,75);
        mage.specialAttack(mage, guerrier);
        assertEquals("Joueur 1 utilise Soin et recupère tous ses points de vitalité\n",
                outContent.toString().replace("\r\n", "\n"));
    }

    //test the Check if input is valid number method
    @Test
    public void CheckInputTestWithValidNumber() {
        CheckIfInputIsValidNumber check=new CheckIfInputIsValidNumber();
        check.nbResponse=20;
        check.checkInput(1,5);
        assertEquals("Vous n'avez pas choisi un chiffre parmi les choix proposés\n",
                outContent.toString().replace("\r\n", "\n"));
    }
    @Test
    public void CheckInputTestWithInvalidNumber() {
        CheckIfInputIsValidNumber check=new CheckIfInputIsValidNumber();
        check.nbResponse=2;
        check.checkInput(1,5);
        assertEquals(2,check.nbResponse);
    }
}