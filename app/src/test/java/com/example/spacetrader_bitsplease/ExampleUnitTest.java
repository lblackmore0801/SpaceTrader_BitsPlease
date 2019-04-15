package com.example.spacetrader_bitsplease;

import android.content.Entity;

import com.example.spacetrader_bitsplease.entity.Player;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void player_creation_isCorrect() {
        int sum = Player.getFighterSkill()
                + Player.getTraderSkill()
                + Player.getEngineerSkill()
                + Player.getPilotSkill();
        //assertEquals(16, sum);
    }
}