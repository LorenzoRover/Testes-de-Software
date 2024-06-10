package exercicio;

public class DiscountCalculator {
    public double calculateDiscount(double price, double discountPercentage) {
        if (price < 0 || discountPercentage < 0 || discountPercentage > 100) {
            throw new IllegalArgumentException("Invalid price or discount percentage");
        }
        return price - (price * (discountPercentage / 100));
    }
}
