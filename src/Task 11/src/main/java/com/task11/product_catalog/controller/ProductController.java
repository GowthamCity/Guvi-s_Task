package com.task11.product_catalog.controller;

import com.task11.product_catalog.model.Product;
import com.task11.product_catalog.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // first page with two options
    @GetMapping("/")
    public String home() {
        return "home";
    }

    // show add product form
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("product", new Product());
        return "add-product";
    }

    // handle form submit
    @PostMapping("/add")
    public String saveProduct(@ModelAttribute Product product) {
        productService.saveProduct(product);
        return "redirect:/display";
    }

    // display all products (optionally by category)
    @GetMapping("/display")
    public String displayProducts(@RequestParam(required = false) String category,
                                  Model model) {
        List<Product> products;
        if (category != null && !category.isBlank()) {
            products = productService.getProductsByCategory(category);
        } else {
            products = productService.getAllProducts();
        }
        model.addAttribute("products", products);
        model.addAttribute("category", category);
        return "display-products";
    }
}
