package com.newProject.newProject.controller;


import com.newProject.newProject.entity.Categories;
import com.newProject.newProject.service.CategoriesService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/categori")
public class CategoryController {

    private final CategoriesService categoriesService;

    public CategoryController(CategoriesService categoriesService) {
        this.categoriesService = categoriesService;
    }

    @GetMapping("/demo")
    public String demoCategori(){
        categoriesService.save(
                Categories.builder()
                        .ad("Bilgisayar")
                        .aciklama("Çok güzel bilgisayar")
                        .categoriurl("/bilgisayar")
                        .parentid(0)
                        .status(1)
                        .url("/images/categories.png")
                        .build());
        categoriesService.save(
                Categories.builder()
                        .ad("monitör")
                        .aciklama("iş görür güzel bilgisayar")
                        .categoriurl("/monitör")
                        .parentid(0)
                        .status(1)
                        .url("/images/monitör.png")
                        .build());
        categoriesService.save(
                Categories.builder()
                        .ad("laptop")
                        .aciklama("kötü güzel bilgisayar")
                        .categoriurl("/laptop")
                        .parentid(0)
                        .status(1)
                        .url("/images/laptop.png")
                        .build());
        return "return:/";

    }

}
