package com.test.service;

import com.test.dao.ProductMapper;
import com.test.domain.dto.ProductUpdate;
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

    public Integer productUpdate(ProductUpdate productUpdate) {
        return productMapper.productUpdate(productUpdate);
    }

    public Product findByProductSeq(int product_seq) {
        return productMapper.findByProductSeq(product_seq);
    }

    public int productDelete (int product_seq) {
        return productMapper.productDelete(product_seq);
    }

}
