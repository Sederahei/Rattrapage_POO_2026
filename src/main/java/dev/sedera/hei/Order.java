package dev.sedera.hei;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Order {
    private LocalDate orderDate;
    private String description;
    private Map<Clothing, Integer> items = new HashMap<>();

    public Order(LocalDate orderDate, String description) {
        this.orderDate = orderDate;
        this.description = description;
    }

    public void addItem(Clothing clothing, int quantity) {
        items.put(clothing, items.getOrDefault(clothing, 0) + quantity);
    }

    public double getTotalAmount() {
        double total = 0;
        for (Map.Entry<Clothing, Integer> entry : items.entrySet()) {
            total += entry.getKey().getUnitPrice() * entry.getValue();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Order on " + orderDate + " (" + description + ") - Total: $" + getTotalAmount();
    }
}

