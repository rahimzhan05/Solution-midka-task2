package order;

import coffee.Coffee;
import models.Status;

import java.util.ArrayList;
import java.util.List;

// Сервис управления заказами
public class OrderService {
    private final List<Order> history = new ArrayList<>();

    public Order processOrder(Coffee coffee) {
        Order order = new Order(coffee.desc(), coffee.cost(), Status.УСПЕХ);
        history.add(order);
        return order;
    }

    public void showHistory() {
        System.out.println("\n📋 История заказов:");
        for (Order record : history) {
            System.out.println(record);
        }
    }
}
