import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StubbedMultiplyTest {

    @Test
    void s_MULTIPLY() {
        assertEquals(6,MULTIPLY.S_multiply(2,3));
    }
}