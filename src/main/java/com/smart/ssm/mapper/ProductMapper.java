package com.smart.ssm.mapper;

import com.smart.ssm.entity.Product;

import java.util.List;

public interface ProductMapper {
    List<Product> selectList();
}
