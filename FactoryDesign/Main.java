package DesignPatterns.FactoryDesign;

public class Main {
    public static void main(String[] args) {
        employee emp1 = FactoryMethod.getEmployee("android developer");
        System.out.println("Salary of Android Developer is " + emp1.salary());

        employee emp2 = FactoryMethod.getEmployee("web developer");
        System.out.println("Salary of Web Developer is " + emp2.salary());
    }
}
