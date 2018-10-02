package com.ocr.liza;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    String person;
    int niveau;
    int force;
    int intelligence;
    int agility;
    public int choosePlayer;
    String player;

    int nbResponse;

    @Test
    public void Given_PlayerOne_When_AddingCorrectChoices_Then_PlayerSummeryOk() {
        Game game= new Game();

        person="guerrier";
        niveau=50;
        force=10;
        intelligence=10;
        agility=30;
        assertEquals("Woarg je suis un guerrier joueur 1 niveau 50 je possède 10 de force, 30 d'agilité et 10 d'intelligence!\n", outContent.toString().replace("\r\n", "\n"));
    }

}