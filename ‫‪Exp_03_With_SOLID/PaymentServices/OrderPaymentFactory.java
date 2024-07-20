package PaymentServices;

public class OrderPaymentFactory {

    public static OrderPaymentService getOrderPaymentService(int paymentMethod) {
        if (paymentMethod == 1)
            return new OnlineOrderPayment();
        else if (paymentMethod == 2)
            return new OnSiteOrderPayment();
        else
            return new PhoneOrderPayment();
    }

}
