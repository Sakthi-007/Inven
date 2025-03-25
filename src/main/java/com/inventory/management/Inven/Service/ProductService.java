package com.inventory.management.Inven.Service;

import com.inventory.management.Inven.Model.Products;

import java.util.List;

public interface ProductService {
    public Products createProduct(Products products);
    public Products getProduct(Long id);
    public Products updatePrice(Long id,double price);
    public Products updateQunatity(Long id,int quant);
    public void deleteProduct(Long id);
    public List<Products> getProducts();
    public List<Products> getProductsByCategory(String category);
}
