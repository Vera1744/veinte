package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

    public class CashbackHackServiceTest {

        @Test
        public void testRemainIfAmountIsZero() {
            CashbackHackService cashbackHackService = new CashbackHackService();
            int amount = 0;
            int actual = cashbackHackService.remain(amount);
            int expected = 1000;
            assertEquals(expected,actual);
        }
        @Test
        public void testRemainIfAmountIs1() {
            CashbackHackService cashbackHackService = new CashbackHackService();
            int amount = 1;
            int actual = cashbackHackService.remain(amount);
            int expected = 999;
            assertEquals(expected,actual);
        }
        @Test
        public void testRemainIfAmountIs999() {
            CashbackHackService cashbackHackService = new CashbackHackService();
            int amount = 999;
            int actual = cashbackHackService.remain(amount);
            int expected = 1;
            assertEquals(expected,actual);
        }
        @Test
        public void testRemainIfAmountIs1000() {
            CashbackHackService cashbackHackService = new CashbackHackService();
            int amount = 1000;
            int actual = cashbackHackService.remain(amount);
            int expected = 0;
            assertEquals(expected,actual);
        }
        @Test
        public void testRemainIfAmountIs1001() {
            CashbackHackService cashbackHackService = new CashbackHackService();
            int amount = 1001;
            int actual = cashbackHackService.remain(amount);
            int expected = 999;
            assertEquals(expected,actual);
        }
}