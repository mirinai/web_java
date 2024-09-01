package Abstractor;

public class Beverage extends Item {

    private int price;
    private int liter;
    private String name;

    public Beverage(int price, int liter, String name){
        this.price=price;
        this.liter=liter;
        this.name=name;
    }

    @Override
    public void sell() {
        System.out.println(this.name+"이"+this.price+"팔림");
    }
}
