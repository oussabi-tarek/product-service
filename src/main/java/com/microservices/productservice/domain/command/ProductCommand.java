package com.microservices.productservice.domain.command;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.math.BigDecimal;

@Builder
@Getter
public class ProductCommand {
    private String name;
    private String description;
    private BigDecimal price;
}
