package com.ocr.liza;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(System.out);
    }


    @Test
    public void Given_NewPlayer_When_ChoosingCharacterAndNiveauForceIntelligenceAgilityVitality_Then_PrintOutChoices() {
        Player playerOne=new Guerrier("Joueur 1", "Guerrier", 15,5,5,5,25);
        playerOne.printPlayer();
        assertEquals("Woarg je suis un Guerrier Joueur 1 niveau 15 je possède 5 de force, 5 d'agilité et 5 d'intelligence!\n",
                outContent.toString().replace("\r\n", "\n"));
    }



    @Test
    public void Given_PlayerGuerrier_When_ChoosingPlayerCharacter_Then_PrintOutPlayersCharacter() {
        Game test= new Game();
        test.chooseCharacter(1);
        System.out.println(test.person);
        assertEquals(test.person="Guerrier\n",
                outContent.toString().replace("\r\n", "\n"));
    }

    @Test
    public void Given_GuerrierBasicAttack_When_ChoosingAttack_Then_DisplayTheGuerrierBasicAttackSentence() {
        Guerrier guerrier=new Guerrier("Joueur 1", "Guerrier", 15,5,5,5,75);
        Mage mage=new Mage("Joueur 2", "Mage", 15,8,2,5,75);
        guerrier.basicAttack(guerrier, mage);
        assertEquals("Joueur 1 utilise Coup d'Epée et inflige 5 dommages\nJoueur 2 perd 5 point de vie\n",
                outContent.toString().replace("\r\n", "\n"));
    }
    
}