package PaymentServices;

public class OrderServiceFactory {
    public static OrderService getOrderService(int paymentMethod) {
        switch (paymentMethod) {
            case 1:
                return new OnlineOrderService();
            case 2:
                return new OnSiteOrderService();
            case 3:
                return new PhoneOrderService();
            default:
                throw new IllegalArgumentException("Invalid payment method");
        }
    }
}
