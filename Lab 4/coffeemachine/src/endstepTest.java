import org.junit.Test;

import static org.junit.Assert.*;

public class endstepTest {
endstep e = new endstep();
    @Test
    public void noemptysize() {
        assertEquals(0,e.noemptysize());
    }

    @Test
    public void emptysize() {
        assertEquals(1,e.emptysize());
    }
}