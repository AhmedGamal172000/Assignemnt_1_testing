import java.util.*;

public class Main  {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.start();
        Scanner scanner = new Scanner(System.in);
       int x = scanner.nextInt();
        while (x!=6){
            coffee.Select(x);
            coffee.start();
            x= scanner.nextInt();
        }
        coffee.Select(x);
    }
}