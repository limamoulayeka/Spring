package com.limamoulayeka.spring.dao;

import com.limamoulayeka.spring.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {

    Product findById(int id);

    List<Product> findByPrixGreaterThan(int prixLimit);
    List<Product> findByNomLike(String recherche);
    void deleteProductById(int id);

}

/**
 * Limamou Laye Ka M2GL
 */
