package by.javaguru.microservices.productservice.service.event;

import java.math.BigDecimal;

public class ProductCreatedEvent {
    private String productId;

    private String title;

    private BigDecimal price;

    private Integer quantity;

    public ProductCreatedEvent(String productId, String title, BigDecimal price, Integer quantity) {

        this.productId = productId;
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }

    public ProductCreatedEvent() {
    }
}
