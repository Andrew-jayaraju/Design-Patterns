package DesignPatterns.FactoryDesign;

public class FactoryMethod {

    public static employee getEmployee(String type){
        if(type.trim().equalsIgnoreCase("Android Developer")){
            return new AndroidDeveloper();
        }else if(type.trim().equalsIgnoreCase("Web Developer")){
            return new WebDeveloper();
        }else{
            return null;
        }
    }
}
