public class Coffee extends selectioncoffee{
    public static int emptysize = 300;
    public void start (){
        System.out.println("1- Milk");
        System.out.println("2- Black Cofee");
        System.out.println("3- Cappccino");
        System.out.println("4- nespresso ");
        System.out.println("5- nescafe");
        System.out.println("6- Stop");
    }

    public Object Select(int input){
        switch (input){
            case 1:{
                emptysize=milk(emptysize);
            }
            case2:{
                emptysize=blackcoffee(emptysize);
            }
            case 3:{
                emptysize=Cappccino(emptysize);
            }
            case 4:{
                emptysize=nespresso(emptysize);
            }
            case 5:{
                emptysize=nescafe(emptysize);
            }
            case 6:{
                stop();
            }
        }
        return null;
    }

   // public boolean noemptysize(){
        //return false;
   // }

}
