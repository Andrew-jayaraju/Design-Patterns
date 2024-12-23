package DesignPatterns.Singelton;

//Eager Way

public class Singelton {
    private static Singelton singelton = new Singelton();
    public static Singelton getSingelton(){
        return singelton;
    }
}
