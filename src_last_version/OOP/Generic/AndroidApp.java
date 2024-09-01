package OOP.Generic;

public class AndroidApp {
    private String name;
    private double volume;

    public AndroidApp(String name, double volume){
        this.name=name;
        this.volume=volume;
    }
    public String getName(){
        return name;
    }

    public double getVolume() {
        return volume;
    }
}
