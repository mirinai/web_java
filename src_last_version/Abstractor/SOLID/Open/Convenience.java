package Abstractor.SOLID.Open;

public class Convenience {
    public static void main(String[] args) {
        Product godiva = new Product("고디바", 10000);
        DiscountProduct discountProduct = new DiscountProduct();
        double discountedPrice = discountProduct.applyDiscount(godiva); // 할인된 가격을 변수에 저장
        System.out.println("할인된 가격: " + discountedPrice); // 할인된 가격 출력
    }
}
