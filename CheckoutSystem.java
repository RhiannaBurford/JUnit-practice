public class CheckoutSystem {
    private DiscountService discountService;

    public CheckoutSystem(DiscountService discountService) {
        this.discountService = discountService;
    }

    public double finalPrice(double originalPrice, int customerId) {
        if (discountService.isVip(customerId)) {
            return originalPrice * 0.8; // 20% discount
        }
        return originalPrice;
    }
}