package com.test.service;

import com.test.dao.ProductMapper;
import com.test.domain.entity.Product;
import com.test.domain.request.AddProductRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    public ProductMapper productMapper;

    public List<Product> product() {
        return productMapper.product();
    }
    public boolean addProduct(AddProductRequest addProductRequest) {
        return productMapper.addProduct(addProductRequest) != 0;
    }
}
