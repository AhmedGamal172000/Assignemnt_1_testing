import static org.junit.Assert.*;

public class DigitalWatchTest {
DigitalWatch d =new DigitalWatch();
    @org.junit.Test
    public void secondsincreamental() {
        assertEquals("Time is: Hours :0"+"Minutes :0"+"seconds :0",d.secondsincreamental());
    }
}