package DesignPatterns.AbstractFatoryDesign;

public class HyundaiFactory extends VehicleAbstactFatory{
    @Override
    public Vehicle CreateVehicle() {
        return new Hyundai();
    }
}
