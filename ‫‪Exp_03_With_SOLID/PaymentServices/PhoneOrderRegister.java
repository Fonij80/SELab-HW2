package PaymentServices;

public class PhoneOrderRegister implements OrderRegisterService {
    @Override
    public void orderRegister(String customerName) {
        System.out.println("phone order registered for " + customerName);
    }
}
