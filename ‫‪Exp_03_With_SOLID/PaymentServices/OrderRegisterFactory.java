package PaymentServices;

public class OrderRegisterFactory {

    public static OrderRegisterService getOrderRegisterService(int paymentMethod) {
        if (paymentMethod == 1)
            return new OnlineOrderRegister();
        else if (paymentMethod == 2)
            return new OnSiteOrderRegister();
        else
            return new PhoneOrderRegister();
    }

}
