package com.test.controller;

import com.test.domain.dto.ProductUpdate;
import com.test.domain.entity.Product;
import com.test.domain.request.AddProductRequest;
import com.test.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    public ProductService productService;

    @GetMapping("/product")
    public ModelAndView showProduct(ModelAndView mav) {
        mav.setViewName("/product/product");
        return mav;
    }

    @GetMapping("/productList")
    public ModelAndView getProductListPage(ModelAndView mav) {
        List<Product> products = productService.product();
        mav.addObject("products" , products);
        mav.setViewName("product/productList");
        return mav;
    }

    @GetMapping("/addProduct")
    public String getAddProductPage() {
        return "/product/addProduct";
    }
    @PostMapping("/addProduct")
    public ModelAndView postAddProductPage(@ModelAttribute AddProductRequest addProductRequest, ModelAndView mav) {
        if (productService.addProduct(addProductRequest)) {
            mav.setViewName("redirect:/product");
        } else {
            mav.setViewName("redirect:/addProduct");
        }
        return mav;
    }
    @GetMapping("/productUpdate/{product_seq}")
    public ModelAndView getProductUpdatePage(ModelAndView mav
            , @PathVariable("product_seq") Integer product_seq) {
        Product product = productService.findByProductSeq(product_seq);
        mav.addObject("product", product);
        mav.setViewName("product/productUpdate");
        return mav;
    }

    @PostMapping("/productUpdate")
    public ModelAndView PostProductUpdatePage(@ModelAttribute ProductUpdate productUpdate, ModelAndView mav) {
        if (productService.productUpdate(productUpdate) == 1) {
            mav.setViewName("redirect:/productList");
        }
        return mav;
    }

    @GetMapping("/productDelete/{product_seq}")
    public ModelAndView getProductDeletePage(@PathVariable("product_seq") int product_seq, ModelAndView mav) {
        if (productService.productDelete(product_seq) == 1) {
            mav.setViewName("redirect:/productList");
        }
        return mav;
    }
}
