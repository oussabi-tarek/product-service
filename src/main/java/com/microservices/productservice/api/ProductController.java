package com.microservices.productservice.api;

import com.microservices.productservice.domain.command.ProductCommand;
import com.microservices.productservice.domain.representation.ProductRepresentation;
import com.microservices.productservice.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@Slf4j
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<String> createProduct(@RequestBody ProductCommand productCommand){
         log.info("create Product {}",productCommand);
         return ResponseEntity.ok(productService.create(productCommand));
    }
    @GetMapping
    public ResponseEntity<List<ProductRepresentation>> getAllProducts(){
        log.info("get All products");
        return ResponseEntity.ok(productService.getAll());
    }
    @GetMapping("/{productId}")
    public ResponseEntity<String> getProduct(@PathVariable String productId){
        log.info("get Product {}",productId);
        return ResponseEntity.ok("goooooooooooooooooooooooooooooood");
    }

}
