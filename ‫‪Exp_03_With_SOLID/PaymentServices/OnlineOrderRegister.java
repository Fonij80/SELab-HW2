package PaymentServices;

public class OnlineOrderRegister implements OrderRegisterService {
    @Override
    public void orderRegister(String customerName) {
        System.out.println("online order registered for " + customerName);
    }
}
