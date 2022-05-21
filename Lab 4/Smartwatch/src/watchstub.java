public class watchstub {
    public boolean checksecondsstub() {
        int seconds = 0;
        if (seconds > 60) {
            return false;
        } else {
            seconds++;
            return true;
        }
    }
    public Object checkminutesstub(int minutes, int hours){
        if(minutes==60) {
            minutes = 0;
            hours++;
        }

        return null;
    }
    public Object checkhoursstub(int hours){
        if(hours==24){
            hours=0;
        }
        return null;
    }
}
