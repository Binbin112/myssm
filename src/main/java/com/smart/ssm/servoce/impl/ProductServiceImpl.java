package com.smart.ssm.servoce.impl;

import com.smart.ssm.entity.Product;
import com.smart.ssm.mapper.ProductMapper;
import com.smart.ssm.servoce.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductMapper productMapper;

    @Override
    public List<Product> findAll(){
        List<Product> products = productMapper.selectList();
        return products;
    }
}
