package com.rongkai.springbootmall.service.impl;

import com.rongkai.springbootmall.dao.ProductDao;
import com.rongkai.springbootmall.model.Product;
import com.rongkai.springbootmall.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

   private final ProductDao productDao;

    @Override
    public Product getProductById(Integer productID) {
        return productDao.findById(productID).orElse(new Product());
    }
}
