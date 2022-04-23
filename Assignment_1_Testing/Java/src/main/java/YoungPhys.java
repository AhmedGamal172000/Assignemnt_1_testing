import java.util.stream.DoubleStream;
import java.util.Scanner;

public class YoungPhys {
    public boolean eq(int x, int a[], int b[], int c[]) {
        if (0 >= x) {
            throw new IllegalArgumentException("X MUST BE A POSITIVE INTEGER");

        }
        int sum_a = 0, sum_b = 0, sum_c = 0;
        while (0 < x) {
            sum_a += a[x - 1];
            sum_b += b[x - 1];
            sum_c += c[x - 1];
            x--;
        }
        if (sum_a == 0 && sum_b == 0 && sum_c == 0) {
            return true;
        } else {
            return false;
        }


    }
}