package com.example.spacetrader_bitsplease;

import com.example.spacetrader_bitsplease.entity.Condition;
import com.example.spacetrader_bitsplease.entity.Difficulty;
import com.example.spacetrader_bitsplease.entity.Planet;
import com.example.spacetrader_bitsplease.entity.PlanetName;
import com.example.spacetrader_bitsplease.entity.Player;
import com.example.spacetrader_bitsplease.entity.ShipType;
import com.example.spacetrader_bitsplease.entity.Ship;
import com.example.spacetrader_bitsplease.entity.Size;
import com.example.spacetrader_bitsplease.entity.TechLevel;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    private Player testPlayer1;

    private Planet testPlanetNoParam;
    private Planet testPlanetAndevian;
    private Planet testPlanetCastor;
    private Planet testPlanetEsmee;
    private Planet testPlanetFerris;
    private Planet testPlanetHelena;
    private Planet testPlanetMyrthe;
    private Planet testPlanetOthello;
    private Planet testPlanetRhymus;
    private Planet testPlanetSol;
    private Planet testPlanetZuul;
    private Planet testPlanetMultParam;

    @Before
    public void setUpPlanets() {
        testPlanetNoParam = new Planet();
        testPlanetAndevian = new Planet(PlanetName.ANDEVIAN);
        testPlanetCastor = new Planet(PlanetName.CASTOR);
        testPlanetEsmee = new Planet(PlanetName.ESMEE);
        testPlanetFerris = new Planet(PlanetName.FERRIS);
        testPlanetHelena = new Planet(PlanetName.HELENA);
        testPlanetMyrthe = new Planet(PlanetName.MYRTHE);
        testPlanetOthello = new Planet(PlanetName.OTHELLO);
        testPlanetRhymus = new Planet(PlanetName.RHYMUS);
        testPlanetSol = new Planet(PlanetName.SOL);
        testPlanetZuul = new Planet(PlanetName.ZUUL);
        testPlanetMultParam = new Planet(PlanetName.ANDEVIAN, 130, 110, Size.MEDIUM, Condition.LOTSOFWATER, TechLevel.AGRICULTURE);
    }

    @SuppressWarnings("unused")
    @Before
    public void setUpPlayer() {
        testPlayer1 = new Player("Ryan");
        Player testPlayer2 = new Player("Ryan", Difficulty.BEGINNER, 5, 4, 3, 4, new Ship(), 1000);
    }


    @Test
    public void player_creation_isCorrect() {
        assertEquals(16, Player.getFighterSkill()
                    + Player.getEngineerSkill()
                    + Player.getTraderSkill()
                    + Player.getPilotSkill());
        assertEquals(Difficulty.BEGINNER, testPlayer1.getDifficulty());
        assertEquals(1000, Player.getMoney());

        assertEquals(5, Player.getPilotSkill());
        assertEquals(4, Player.getEngineerSkill());
        assertEquals(3, Player.getFighterSkill());
        assertEquals(4, Player.getTraderSkill());
        assertEquals(ShipType.GNAT, Player.getShip().getType());
        assertEquals(1000, Player.getMoney());
    }

    @Test
    public void x_coordinate_is_correct() {
        assertEquals(100, testPlanetNoParam.getXcoordinate());
        assertEquals(100, testPlanetAndevian.getXcoordinate());
        assertEquals(90, testPlanetCastor.getXcoordinate());
        assertEquals(80, testPlanetEsmee.getXcoordinate());
        assertEquals(70, testPlanetFerris.getXcoordinate());
        assertEquals(60, testPlanetHelena.getXcoordinate());
        assertEquals(50, testPlanetMyrthe.getXcoordinate());
        assertEquals(110, testPlanetOthello.getXcoordinate());
        assertEquals(120, testPlanetRhymus.getXcoordinate());
        assertEquals(130, testPlanetSol.getXcoordinate());
        assertEquals(140, testPlanetZuul.getXcoordinate());
        assertEquals(130, testPlanetMultParam.getXcoordinate());
    }

    @Test
    public void y_coordinate_is_correct() {
        assertEquals(100, testPlanetNoParam.getYcoordinate());
        assertEquals(100, testPlanetAndevian.getYcoordinate());
        assertEquals(110, testPlanetCastor.getYcoordinate());
        assertEquals(120, testPlanetEsmee.getYcoordinate());
        assertEquals(130, testPlanetFerris.getYcoordinate());
        assertEquals(140, testPlanetHelena.getYcoordinate());
        assertEquals(50, testPlanetMyrthe.getYcoordinate());
        assertEquals(60, testPlanetOthello.getYcoordinate());
        assertEquals(70, testPlanetRhymus.getYcoordinate());
        assertEquals(80, testPlanetSol.getYcoordinate());
        assertEquals(90, testPlanetZuul.getYcoordinate());
        assertEquals(110, testPlanetMultParam.getYcoordinate());
    }

}