package com.limamoulayeka.spring.web.controller;


import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.magattewar.mwarm2gl.dao.ProductDao;
import com.magattewar.mwarm2gl.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;


@RestController
public class ProductController {



    @Autowired
    private ProductDao productDao;

    @RequestMapping(value = "/Produits", method = RequestMethod.GET)

    //Find List products
    public MappingJacksonValue listeProduits() {

        List<Product> produits = productDao.findAll();

        SimpleBeanPropertyFilter monFiltre = SimpleBeanPropertyFilter.serializeAllExcept("prixAchat");

        FilterProvider listDeNosFiltres = new SimpleFilterProvider().addFilter("monFiltreDynamique", monFiltre);

        MappingJacksonValue produitsFiltres = new MappingJacksonValue(produits);

        produitsFiltres.setFilters(listDeNosFiltres);

        return produitsFiltres;
    }

    //Find product by Id
    @GetMapping(value="/Produits/{id}")
    public Product afficherUnProduit(@PathVariable int id) throws ProduitIntrouvableException {
        Product produit = productDao.findById(id);
        if(produit==null) {
            throw new ProduitIntrouvableException("Le produit avec l'id " + id + " est INTROUVABLE. Ecran Bleu si je pouvais.");
        }
        return produit;
    }

	//Delete Product
    @DeleteMapping (value = "/Produits/{id}")
    public void supprimerProduit(@PathVariable int id) {

        productDao.deleteProductById(id);
    }

    //Update Product
    @PutMapping (value = "/Produits")
    public void updateProduit(@RequestBody Product product) {

        productDao.save(product);
    }
}


/**
 * Limamou Laye Ka M2GL
 */
