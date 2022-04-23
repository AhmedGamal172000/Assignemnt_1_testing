import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YoungPhysTest {

    @Test
    void eq() {
        YoungPhys phys = new YoungPhys();
        int a[] = {1,-1,0};
        int b[] = {2,3,-5};
        int c[] = {3,4,-7};
        assertTrue(phys.eq(3,a,b,c));
    }
    @Test
    void eq1()
    {
        YoungPhys phys = new YoungPhys();
        int a[] = {3,8};
        int b[] = {9,-2};
        int c[] = {-6,6};
        assertTrue(phys.eq(2    ,a,b,c));

    }
    @Test
    void eq2()
    {
        YoungPhys phys = new YoungPhys();
        int a[] = {7};
        int b[] = {2};
        int c[] = {9};
        assertTrue(phys.eq(1,a,b,c));

    }
    @Test
    void eq3() {
        YoungPhys phys = new YoungPhys();
        int a[] = {1};
        int b[] = {2};
        int c[] = {3};
        assertThrows(IllegalArgumentException.class, () -> {
            phys.eq(0, a, b, c);
        });
    }
    @Test
    void eq4() {
        YoungPhys phys = new YoungPhys();
        int a[] = {4,-4};
        int b[] = {8,-8};
        int c[] = {9,-9};
        assertThrows(IllegalArgumentException.class, () -> {
            phys.eq(-2, a, b, c);
        });
    }
    @Test
    void eq5() {
        YoungPhys phys = new YoungPhys();
        int a[] = {1,-1};
        int b[] = {2,-2};
        int c[] = {5,-5};
        assertThrows(IllegalArgumentException.class, () -> {
            phys.eq(4, a, b, c);
        });
    }
}