package com.limamoulayeka.spring.dao;

import com.limamoulayeka.spring.model.Product;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Repository
public class ProductDaoImpl implements ProductDao {

    public static List<Product>products=new ArrayList<>();

    static {
        products.add(new Product(1, new String("Ordinateur portable"), 350, 120));
        products.add(new Product(2, new String("Aspirateur Robot"), 500, 200));
        products.add(new Product(3, new String("Table de Ping Pong"), 750, 400));
    }

    @Override
    public List<Product>findAll() {
        return products;
    }

    @Override
    public List<Product> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Product> findAllById(Iterable<Integer> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Product product) {

    }

    @Override
    public void deleteAll(Iterable<? extends Product> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Product> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Product> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Product> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Product> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Product getOne(Integer integer) {
        return null;
    }

    @Override
    public <S extends Product> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Product> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Product> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Product> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Product> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Product> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public Product findById(int id) {
        for (Product product : products) {
            if(product.getId() ==id){
                return product;
            }
        }
        return null;
    }

    @Override
    public List<Product> findByPrixGreaterThan(int prixLimit) {
        return null;
    }

    @Override
    public List<Product> findByNomLike(String recherche) {
        return null;
    }

    @Override
    public void deleteProductById(int id) {

    }

    @Override
    public Product save(Product product) {
        products.add(product);
        return product;
    }
}

/**
 * Limamou Laye Ka M2GL
 */
