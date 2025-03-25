package com.inventory.management.Inven.Service;

import com.inventory.management.Inven.Model.Products;
import com.inventory.management.Inven.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductRepo productRepo;

    @Override
    public Products createProduct(Products products) {
        return productRepo.save(products);
    }

    @Override
    public Products getProduct(Long id) {
        return productRepo.getReferenceById(id);
    }

    @Override
    public Products updatePrice(Long id,double price) {
        Products prod=productRepo.findById(id).get();
        prod.setPrice(price);
//        prod.setQuantity(products.getQuantity());
        return productRepo.save(prod);
    }

    @Override
    public Products updateQunatity(Long id,int quant) {
        Products prod=productRepo.findById(id).get();
        prod.setPrice(quant);
//        prod.setQuantity(products.getQuantity());
        return productRepo.save(prod);
    }


    @Override
    public void deleteProduct(Long id) {
        productRepo.delete(productRepo.getReferenceById(id));
    }

    @Override
    public List<Products> getProducts() {
        return productRepo.findAll();
    }
}
