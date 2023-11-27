package com.microservices.productservice.service;

import com.microservices.productservice.domain.command.ProductCommand;
import com.microservices.productservice.domain.model.Product;
import com.microservices.productservice.domain.representation.ProductRepresentation;
import com.microservices.productservice.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public String create(ProductCommand productCommand){
        Product product=Product.builder()
                .name(productCommand.getName())
                .description(productCommand.getDescription())
                .price(productCommand.getPrice())
                .build();
        return  productRepository.save(product).getId();
    }

    public List<ProductRepresentation> getAll() {
        return productRepository.findAll().stream().map(this::mapToProductRepresentation).toList();
    }

    public ProductRepresentation mapToProductRepresentation(Product product){
       return  ProductRepresentation.builder()
               .id(product.getId())
               .name(product.getName())
               .description(product.getDescription())
               .price(product.getPrice())
               .build();
    }
}
