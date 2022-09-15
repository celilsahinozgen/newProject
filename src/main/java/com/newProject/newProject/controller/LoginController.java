package com.newProject.newProject.controller;


import com.newProject.newProject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
@RequiredArgsConstructor
public class LoginController {

    private final UserService userService;

    @GetMapping
    public ModelAndView login(){
        ModelAndView model = new ModelAndView();

        model.setViewName("login");

        return model;
    }

    @PostMapping
    public ModelAndView loginPage(String username, String password){
        boolean islogin = userService.isPassword(username,password);
        ModelAndView model = new ModelAndView();
        if (islogin) {
            model.setViewName("/");

        }else {
            model.addObject("error", "Kullanıcı adı veya şifresi yanlıştır");
            model.setViewName("/login");
        }
        return model;
    }
}


