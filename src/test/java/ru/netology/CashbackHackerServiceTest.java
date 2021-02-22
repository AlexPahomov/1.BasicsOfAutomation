package ru.netology;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class CashbackHackerServiceTest {
    CashbackHackService service = new CashbackHackService();
    @Test
    public void shouldCalculateIfAmountCorrect() {
        int amount = 400;
        int actual = service.remain(amount);
        int expected = 600;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateIfAmountZero() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateIfAmountOver1000() {
        int amount = 1100;
        int actual = service.remain(amount);
        int expected = 900;

        assertEquals(actual, expected);
    }

}
