import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;


public class WMelonTest {
    @Test
    public void test1()
    {
        String data="2";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(WMelon.watermelon(),false);
    }
    @Test
    public void test2()
    {
        String data="40";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(WMelon.watermelon(),true);
    }
    @Test
    public void test3()
    {
        String data="92";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(WMelon.watermelon(),true);
    }
    @Test
    public void test4()
    {
        String data="63";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        assertEquals(WMelon.watermelon(),false);
    }

}