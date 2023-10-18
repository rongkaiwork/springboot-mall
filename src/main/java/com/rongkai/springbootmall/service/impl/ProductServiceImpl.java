package com.rongkai.springbootmall.service.impl;

import com.rongkai.springbootmall.dao.ProductDao;
import com.rongkai.springbootmall.model.Product;
import com.rongkai.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productID) {
        return productDao.getProductById(productID);
    }
}
