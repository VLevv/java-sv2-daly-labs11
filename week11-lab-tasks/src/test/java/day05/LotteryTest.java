package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {

    @Test
    void testStartLottery() {
        Lottery lottery = new Lottery(45,6);
        assertEquals(6,lottery.startLottery().size());

    }
}