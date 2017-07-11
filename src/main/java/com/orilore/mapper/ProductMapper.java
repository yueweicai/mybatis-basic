package com.orilore.mapper;

import java.util.List;

import com.orilore.entitys.Product;

public interface ProductMapper {
	public void insert(Product bean);
	public List<Product> selectAll();
	public Product selectOne(int id);
}
