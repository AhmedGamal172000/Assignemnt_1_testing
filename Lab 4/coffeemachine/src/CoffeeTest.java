import org.junit.Test;

import static org.junit.Assert.*;

public class CoffeeTest {
Coffee c =new Coffee();
    @Test
    public void start() {
    }

    @Test
    public void select() {
        assertEquals(null,c.Select(1));
    }
}