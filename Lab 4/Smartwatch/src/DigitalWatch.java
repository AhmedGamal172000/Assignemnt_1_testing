public class DigitalWatch extends watchstub {
    public int seconds =0;
    public int minutes=0;
    public int hours =0;
    public String secondsincreamental(){
        seconds = seconds+1;
        boolean checkseconds=checksecondsstub();
        if(checkseconds==false){
            return"Time is: Hours :"+hours+"Minutes :"+minutes+"seconds :"+seconds;
        }
        else{
            seconds =0;
            return"Time is: Hours :"+hours+"Minutes :"+minutes+"seconds :"+seconds;
        }
    }
}
