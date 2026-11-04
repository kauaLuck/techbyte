package com.senai.techbyte;

import org.springframework.beans.propertyeditors.ClassEditor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class Controller {
    @GetMapping("/produto")
    public Produto show(){
        Produto produto= new Produto("Carne de primeira", "Essa carne veio das vacas que escutava musíca ", new BigDecimal("500.00"));
        return produto;
    }



}
