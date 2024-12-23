package DesignPatterns.PrototypePattern;

public class Main {
    public static void main(String[] args) {
        Prototype ex1 = new Prototype();
        ex1.setEmpid(1001);
        ex1.setName("Andrew");

        System.out.println(ex1);

        try{
            Prototype ex2 = (Prototype) ex1.clone();
            ex2.setEmpid(1002);
            ex2.setName("Mohana");
            System.out.println(ex2);
        }catch (CloneNotSupportedException e){
            System.out.println(e.getMessage());
        }

    }
}
