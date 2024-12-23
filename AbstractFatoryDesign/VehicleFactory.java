package DesignPatterns.AbstractFatoryDesign;

public class VehicleFactory {
    public static Vehicle getVehicle(VehicleAbstactFatory factory){
        return factory.CreateVehicle();
    }
}
