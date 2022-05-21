import org.junit.Test;

import static org.junit.Assert.*;

public class watchstubTest {
watchstub w = new watchstub();
    @Test
    public void checksecondsstub() {
        assertEquals(true,w.checksecondsstub());
    }

    @Test
    public void checkminutesstub() {
        assertEquals(null,w.checkminutesstub(60,20));
    }

    @Test
    public void checkhoursstub() {
        assertEquals(null,w.checkhoursstub(60));
    }
}