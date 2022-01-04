package day02;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {

    @org.junit.jupiter.api.Test
    void testGetPlusElevation() {
        assertEquals(13,new Hiking().getPlusElevation(List.of(10,20,15,18)));
    }
}