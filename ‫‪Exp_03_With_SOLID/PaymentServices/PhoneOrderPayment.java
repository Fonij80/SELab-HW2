package PaymentServices;

public class PhoneOrderPayment implements OrderPaymentService {
    @Override
    public void orderPayment(int foodPrice) {
        System.out.println("phone Payment with Price : " + foodPrice + " Tomans!");
    }
}
