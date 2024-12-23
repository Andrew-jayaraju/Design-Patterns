package DesignPatterns.AbstractFatoryDesign;

public class BMWFactory extends VehicleAbstactFatory{
    @Override
    public Vehicle CreateVehicle() {
        return new BMW();
    }
}
