package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService cashback = new CashbackHackService();

    @Test
    public void shouldBuy800(){
    int expected = cashback.remain(800);
    int actual = 200;
    assertEquals(expected,actual);
    }

    @Test
    public void shouldBuy500(){
        int expected = cashback.remain(500);
        int actual = 500;
        assertEquals(expected,actual);
    }

    @Test
    public void shouldBuy999(){
        int expected = cashback.remain(999);
        int actual = 1;
        assertEquals(expected,actual);
    }

    @Test
    public void shouldBuy1(){
        int expected = cashback.remain(1);
        int actual = 999;
        assertEquals(expected,actual);
    }

    @Test
    public void shouldBuy0(){
        int expected = cashback.remain(0);
        int actual = 1000;
        assertEquals(expected,actual);
    }

    @Test
    public void shouldBuy1000(){
        int expected = cashback.remain(1000);
        int actual = 0;
        assertEquals(expected,actual);
    }

}