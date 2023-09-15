package com.svngdo.shoppingcart.repository;

import com.svngdo.shoppingcart.model.Category;
import com.svngdo.shoppingcart.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Query(value = "select * from products p where p.category_id = :categoryId", nativeQuery = true)
    List<Product> findAllByCategoryId(@Param("categoryId") int id);
}
