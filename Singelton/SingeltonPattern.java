package DesignPatterns.Singelton;

public class SingeltonPattern {
    public static void main(String[] args) {

        Single sample1 = Single.getSingle();
        System.out.println("Lazy Way");
        System.out.println(sample1.hashCode());

        Single sample2 = Single.getSingle();
        System.out.println(sample2.hashCode());

        System.out.println("Eager Way");
        Singelton ex1 = Singelton.getSingelton();
        System.out.println(ex1.hashCode());

        Singelton ex2 = Singelton.getSingelton();
        System.out.println(ex2.hashCode());
    }
}
