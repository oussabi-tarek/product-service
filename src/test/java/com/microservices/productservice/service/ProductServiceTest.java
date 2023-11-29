package com.microservices.productservice.service;

import com.microservices.productservice.domain.model.Product;
import com.microservices.productservice.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {
   @Mock
    private ProductRepository productRepository;

   @Test
   public void shouldGetAllProducts(){
       List<Product> productList=new ArrayList<>();
   //    when(productRepository.findAll()).thenReturn(productList);
       assertEquals(productList.size(),0);
   }

}
