package com.test.controller;

import com.test.domain.entity.Product;
import com.test.domain.request.AddProductRequest;
import com.test.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
