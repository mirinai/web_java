package Abstractor.Interface.cafe;

public class ILatte implements ICoffee{
    @Override
    public void brew() {
        System.out.println("라떼 추출하고 있음");
    }
}
