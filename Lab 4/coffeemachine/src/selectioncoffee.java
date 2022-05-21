public class selectioncoffee extends endstep{
    public int milk(int emptysize){
        if(emptysize<100){
            noemptysize();
        }
        emptysize=emptysize-100;
        return emptysize;
    }
    public int blackcoffee(int emptysize){
        if(emptysize<100){
            noemptysize();
        }
        emptysize=emptysize-100;
        return emptysize;
    }
    public int Cappccino(int emptysize){
        if(emptysize<100){
            noemptysize();
        }
        emptysize=emptysize-100;
        return emptysize;
    }
    public int nespresso(int emptysize){
        if(emptysize<100){
            noemptysize();
        }
        emptysize=emptysize-100;
        return emptysize;
    }
    public int nescafe(int emptysize){
        if(emptysize<100){
            noemptysize();
        }
        emptysize=emptysize-100;
        return emptysize;
    }
    public Object stop(){
        noemptysize();
        return null;
    }
    }

