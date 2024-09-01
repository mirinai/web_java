package Abstractor.SOLID.Open;

public class DiscountProduct implements DiscountPolicy{
//    private  double discountPrice;
//
//    public DiscountProduct(double discountPrice){
//        this.discountPrice=discountPrice;
//    }
    @Override
    public double applyDiscount(Product product) {
        return (double) product.getPrice()*0.9;
    }
}
