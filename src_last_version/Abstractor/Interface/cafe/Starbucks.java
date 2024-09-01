package Abstractor.Interface.cafe;

public class Starbucks {
    private  ICoffee iCoffee;

    public Starbucks(ICoffee iCoffee){
        this.iCoffee = iCoffee;
    }
    public void coffeeBrew(){
        this.iCoffee.brew();
    }
}
