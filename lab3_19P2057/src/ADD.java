public class ADD {
    protected static int add(int a,int b){
        return R_add(a,b);
    }
    private static int S_add (int a,int b){
        return -1;
    }
    private static int R_add(int a,int b){
        return a+b;
    }
}
