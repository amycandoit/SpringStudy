package com.test.dao;

import com.test.domain.entity.Product;
import com.test.domain.request.AddProductRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    List<Product> product();
    Integer addProduct(AddProductRequest addProductRequest);
}
