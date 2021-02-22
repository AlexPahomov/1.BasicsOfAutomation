package ru.netology;

import org.junit.Test;
import static org.junit.Assert.*;

public class CashbackHackerServiceTest {
    CashbackHackService service = new CashbackHackService();
    @Test
    public void shouldCalculateIfAmountCorrect() {
        int amount = 4200;
        int actual = service.remain(amount);
        int expected = 800;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateIfAmountZero() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateIfAmount1000() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }
    }
