package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService cashback = new CashbackHackService();

    @Test
    public void shouldBuy800() {
    int actual = cashback.remain(800);
    int expected = 200;
    assertEquals(actual,expected);
    }

    @Test
    public void shouldBuyZero() {
        int actual = cashback.remain(0);
        int expected = 1000;
        assertEquals(actual,expected);
    }

    @Test
    public void shouldBuy500() {
        int actual = cashback.remain(500);
        int expected = 500;
        assertEquals(actual,expected);
    }

    @Test
    public void shouldBuy999() {
        int actual = cashback.remain(999);
        int expected = 1;
        assertEquals(actual,expected);
    }

    @Test
    public void shouldBuy1() {
        int actual = cashback.remain(1);
        int expected = 999;
        assertEquals(actual,expected);
    }

    @Test
    public void shouldBuy1000() {
        int actual = cashback.remain(1000);
        int expected = 1;
        assertEquals(actual,expected);
    }



}