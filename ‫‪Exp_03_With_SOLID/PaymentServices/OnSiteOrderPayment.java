package PaymentServices;

public class OnSiteOrderPayment implements OrderPaymentService {
    @Override
    public void orderPayment(int foodPrice) {
        System.out.println("on-Site Payment with Price : " + foodPrice + " Tomans!");
    }
}
