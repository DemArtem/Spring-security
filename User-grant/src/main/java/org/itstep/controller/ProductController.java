package org.itstep.controller;

import org.itstep.dao.Product;
import org.itstep.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping({"","/"})
    public String home(Model model){
        List<Product> products = productService.findAll();
        model.addAttribute("products",products);
        return "index";
    }
}