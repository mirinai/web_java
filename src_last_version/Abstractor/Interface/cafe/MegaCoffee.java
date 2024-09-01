package Abstractor.Interface.cafe;

public class MegaCoffee {
    private Americano americano;
    private Latte latte;

    public MegaCoffee() {
        this.americano = new Americano();
        this.latte = new Latte();
    }

    public void serveAmericano(){
        this.americano.brew();
    }

    public void serveLatte(){
        this.latte.brew();
    }
}
