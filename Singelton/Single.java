package DesignPatterns.Singelton;

//LAZY WAY
public class Single {
    private static Single single;
    private Single(){
        System.out.println("This is Default Constructor");
    }

    public static Single getSingle(){
        if(single == null){
            synchronized(Single.class){
                if(single == null){
                    single = new Single();
                }
            }
        }
        return single;
    }

}
