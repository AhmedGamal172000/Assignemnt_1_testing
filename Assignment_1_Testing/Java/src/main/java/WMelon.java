import java.util.*;
public class WMelon{
    public static String watermelon(){

        Scanner in = new Scanner(System.in);
        int input;
        input=in.nextInt();



        if (input > 2 && input % 2 == 0)
        {

            return "TRUE";
        }
        else {
            return "FALSE";
        }
    }
}