package com.newProject.newProject.controller;


import com.newProject.newProject.entity.Slider;
import com.newProject.newProject.service.SliderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("/slider")
public class SliderController {

    private final SliderService sliderService;

    public SliderController(SliderService sliderService) {
        this.sliderService = sliderService;
    }

    @GetMapping("/demo")
    public String demo(){
        sliderService.save(
                Slider.builder()
                        .ad("bir")
                        .anabaslik("Yil başı kampanyası")
                        .altbaslik("ödüller cepte")
                        .aciklama("almadan kacırmasddsadsadsadsa sadsa sda asd d")
                        .buttontext("hadi katıl")
                        .buttonlink("/google.com.tr")
                        .resimurl("/images/home/girl.png")
                        .status(1)
                        .startdate(new Date().getTime()-(10000*60*60*24))
                        .enddate(new Date().getTime()+(1000*60*60*24*5))
                        .build());

    }
}
