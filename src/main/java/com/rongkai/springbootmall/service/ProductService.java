package com.rongkai.springbootmall.service;

import com.rongkai.springbootmall.dto.ProductRequest;
import com.rongkai.springbootmall.model.Product;
import org.springframework.stereotype.Service;

public interface ProductService {

    public Product getProductById(Integer productID);

    public Integer createProduct(ProductRequest productRequest);

}
