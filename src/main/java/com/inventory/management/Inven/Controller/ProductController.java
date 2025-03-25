package com.inventory.management.Inven.Controller;

import com.inventory.management.Inven.Model.Products;
import com.inventory.management.Inven.Service.ProductService;
import com.inventory.management.Inven.Service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("/createP")
    public Products createProduct(@RequestBody Products product)
    {
        return productService.createProduct(product);
    }

    @GetMapping("/getP/{id}")
    public Products getProducts(@PathVariable Long id)
    {
        return productService.getProduct(id);
    }
    @GetMapping("/getP")
    public List<Products> getAllProdcuts()
    {
        return productService.getProducts();
    }

    @PutMapping("/updatePrice/{id}")
    public Products updatePrice(@PathVariable Long id,@RequestParam double price)
    {
        return productService.updatePrice(id,price);
    }
    @PutMapping("/updateQuantity/{id}")
    public Products updateQuantity(@PathVariable Long id,@RequestParam int quantity)
    {
        return productService.updateQunatity(id,quantity);
    }

    @DeleteMapping("/deleteP/{id}")
    public String deleteProduct(@PathVariable Long id)
    {
        productService.deleteProduct(id);
        return "Product Deleted";

    }
    @GetMapping("/getByCategory")
    public List<Products> getByCat(@RequestParam String category)
    {
        return productService.getProductsByCategory(category);
    }

}
