package Abstractor.Interface;

public class Zflip implements Camera, SamsungPaY,Foldable{

    @Override
    public void takePhoto() {
        System.out.println("찍기");
    }

    @Override
    public void pay() {
        System.out.println("삼섬페이");
    }

    @Override
    public void folding() {
        System.out.println("핸드폰 열기");
    }
}
