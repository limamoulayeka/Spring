package com.limamoulayeka.spring.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.ACCEPTED)
public class ProduitIntrouvableException extends Throwable {
    public ProduitIntrouvableException(String s) {
        super(s);
    }
}

/**
 * Limamou Laye Ka M2GL
 */