package com.microservices.productservice.domain.representation;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class ProductRepresentation {
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
