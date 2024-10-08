package by.javaguru.microservices.productservice.service.event;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class ProductCreatedEvent {
    @JsonProperty("productId")
    private String productId;

    @JsonProperty("title")
    private String title;

    @JsonProperty("price")
    private BigDecimal price;

    @JsonProperty("quantity")
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
