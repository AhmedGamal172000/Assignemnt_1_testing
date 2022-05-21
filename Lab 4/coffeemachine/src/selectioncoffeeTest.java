import static org.junit.Assert.*;

public class selectioncoffeeTest {
selectioncoffee c= new selectioncoffee();

    @org.junit.Test
    public void milk() {
        assertEquals(100,c.milk(200));
    }

    @org.junit.Test
    public void blackcoffee() {
        assertEquals(100,c.blackcoffee(200));
    }

    @org.junit.Test
    public void cappccino() {
        assertEquals(100,c.Cappccino(200));
    }

    @org.junit.Test
    public void nespresso() {
        assertEquals(100,c.nespresso(200));
    }

    @org.junit.Test
    public void nescafe() {
        assertEquals(100,c.nescafe(200));
    }

    @org.junit.Test
    public void stop() {
        assertEquals(null,c.stop());
    }
}