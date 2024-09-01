package Abstractor;

import Abstractor.Interface.cafe.IAmericano;
import Abstractor.Interface.cafe.MegaCoffee;
import Abstractor.Interface.cafe.Starbucks;

public class Factory {
    public static void main(String[] args) {
        Beverage tea = new Beverage(2000,400,"밀크티");
        tea.sell();
        //메가 커피 안 -> 아메리카노(직접적인 관계)
        MegaCoffee megaCoffee = new MegaCoffee();
        megaCoffee.serveAmericano();
        megaCoffee.serveLatte();

        //스타벅스 - 아메리카노 : 간접적인 관계
        Starbucks starbucks = new Starbucks(new IAmericano());
        starbucks.coffeeBrew();

    }
}
