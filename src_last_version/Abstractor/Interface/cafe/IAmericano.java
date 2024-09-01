package Abstractor.Interface.cafe;

public class IAmericano implements ICoffee{

    @Override
    public void brew() {
        System.out.println("아메리카노 추출하고 있음");
    }
}
