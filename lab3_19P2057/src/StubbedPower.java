import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StubbedPowerTest {

    @Test
    void power() {
        assertEquals(8,POWER.power(2,3));
    }
}