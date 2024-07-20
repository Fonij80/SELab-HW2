package PaymentServices;

public class OnSiteOrderRegister implements OrderRegisterService {
    @Override
    public void orderRegister(String customerName) {
        System.out.println("on-Site order registered for " + customerName);
    }
}