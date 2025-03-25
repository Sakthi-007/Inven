package com.inventory.management.Inven.Repository;

import com.inventory.management.Inven.Model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Products,Long> {
public List<Products> findByCategory(String category);

}
