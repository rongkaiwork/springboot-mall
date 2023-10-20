package com.rongkai.springbootmall.service.impl;

import com.rongkai.springbootmall.dao.ProductDao;
import com.rongkai.springbootmall.dto.ProductRequest;
import com.rongkai.springbootmall.model.Product;
import com.rongkai.springbootmall.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

   private final ProductDao productDao;

    @Override
    public Product getProductById(Integer productID) {
        return productDao.findById(productID).orElse(new Product());
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        Product product = new Product();
        BeanUtils.copyProperties(productRequest, product);
        Date now = new Date();
        product.setCreatedDate(now);
        product.setLastModifiedDate(now);
        return productDao.save(product).getProductId();
    }
}
