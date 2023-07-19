package com.tmf.spring.demo.spring_hibernate_integration.services;

import java.util.List;

import com.tmf.spring.demo.spring_hibernate_integration.models.Product;

public interface ProductServices {
	public void addProduct(Product pro);
	public List<Product> displayAllProducts();
	public Product displayProductById(long ProductId);
	public List<Product> displayAllProductByCategory(String category);
	public void updateProduct(Product pro);
	public void deleteProduct(Product pro);
}
