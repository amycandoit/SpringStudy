package com.test.dao;

import com.test.domain.dto.ProductUpdate;
import com.test.domain.dto.UserUpdate;
import com.test.domain.entity.Product;
import com.test.domain.entity.User;
import com.test.domain.request.AddProductRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    List<Product> product();

    Integer addProduct(AddProductRequest addProductRequest);

    Integer productUpdate(ProductUpdate productUpdate);

    Product findByProductSeq(int product_seq);

    int productDelete(int product_seq);
}
