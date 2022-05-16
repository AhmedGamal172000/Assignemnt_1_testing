public class POWER extends MULTIPLY{
    public static int power(int a,int b){
        int result = 1;
        for (int i = 0;i<b;i++){
            result = S_multiply(a,result);
        }
        return result;
    }
}
