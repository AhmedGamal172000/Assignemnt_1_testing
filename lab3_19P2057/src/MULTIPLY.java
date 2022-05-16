public class MULTIPLY extends ADD {
    public static int S_multiply(int a, int b){
        int sum = 0;
        for(int i = 0;i<b;i++){
            sum = add(a,sum);
        }
        return sum;
    }
}
