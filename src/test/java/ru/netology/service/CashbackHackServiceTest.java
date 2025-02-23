package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemainIfAmountIsZero() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;
        int actual = cashbackHackService.remain(amount);
        int expected = 1000;
        assertEquals(actual,expected);
    }
    @Test
    public void testRemainIfAmountIs1() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1;
        int actual = cashbackHackService.remain(amount);
        int expected = 999;
        assertEquals(actual,expected);
    }
    @Test
    public void testRemainIfAmountIs999() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 999;
        int actual = cashbackHackService.remain(amount);
        int expected = 1;
        assertEquals(actual,expected);
    }
    @Test
    public void testRemainIfAmountIs1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(actual,expected);
    }
    @Test
    public void testRemainIfAmountIs1001() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1001;
        int actual = cashbackHackService.remain(amount);
        int expected = 999;
        assertEquals(actual,expected);
    }
}