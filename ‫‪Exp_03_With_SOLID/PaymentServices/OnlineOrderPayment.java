package PaymentServices;

public class OnlineOrderPayment implements OrderPaymentService{
    @Override
    public void orderPayment(int foodPrice) {
        System.out.println("online Payment with Price : " + foodPrice + " Tomans!");
    }
}
