package DesignPatterns.AbstractFatoryDesign;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = VehicleFactory.getVehicle(new HyundaiFactory());
        System.out.println(v1.name());

        Vehicle v2 = VehicleFactory.getVehicle(new BMWFactory());
        System.out.println(v2.name());
    }
}
