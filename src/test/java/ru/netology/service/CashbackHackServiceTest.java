package ru.netology.service;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturn100IfAmountIs999() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 999;

        int actual = cashbackHackService.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn999IfAmountIs1001() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1001;

        int actual = cashbackHackService.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0IfAmountIs1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void testJunit5One() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 800;

        int actual = cashbackHackService.remain(amount);
        int expected = 200;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testJunit5Two() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);

        Assertions.assertNotNull(actual);
    }

    @Test
    public void testJunit4() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 500;

        int actual = cashbackHackService.remain(amount);

        assertNotNull(actual);
    }
}