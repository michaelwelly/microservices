package by.javaguru.microservices.productservice.service;

import by.javaguru.microservices.productservice.service.dto.CreateProductDto;

public interface ProductService {

    String createProduct(CreateProductDto createProductDto);
}
