package order;

import models.Status;

// Запись заказа
public class Order {
    private final String type;
    private final double price;
    private final Status status;

    public Order(String type, double price, Status status) {
        this.type = type;
        this.price = price;
        this.status = status;
    }

    @Override
    public String toString() {
        return "☕ Кофе: " + type + " | Цена: $" + price + " | Статус: " + status;
    }
}