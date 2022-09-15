package com.newProject.newProject.controller;


import com.newProject.newProject.service.CategoriesService;
import com.newProject.newProject.service.SliderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/index")
public class HomePageController {

    private final CategoriesService categoriesService;
    private final SliderService sliderService;

    public HomePageController(CategoriesService categoriesService, SliderService sliderService) {
        this.categoriesService = categoriesService;
        this.sliderService = sliderService;
    }

    @GetMapping
    public ModelAndView index() {
        ModelAndView model = new ModelAndView();
        model.addObject("categories",categoriesService.findAllParents());
        model.addObject("sliderlist", sliderService.findAllActive());;
        model.setViewName("index");

        return model;
    }
}
