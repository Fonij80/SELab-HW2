package PaymentServices;

import java.util.HashMap;
import java.util.Map;

public class OrderServiceFactory {
    private static final Map<Integer, OrderService> registry = new HashMap<>();

    static {
        registry.put(1, new OnlineOrderService());
        registry.put(2, new OnSiteOrderService());
        registry.put(3, new PhoneOrderService());
    }

    public static OrderService getOrderService(int paymentMethod) {
        OrderService service = registry.get(paymentMethod);
        if (service == null) {
            throw new IllegalArgumentException("Invalid payment method");
        }
        return service;
    }

    public static void registerOrderService(int paymentMethod, OrderService orderService) {
        registry.put(paymentMethod, orderService);
    }
}
