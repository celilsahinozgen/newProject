package com.newProject.newProject.controller;

import com.newProject.newProject.entity.User;
import com.newProject.newProject.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("/")
public class RegisterController {

    private  final UserService userService;

    public RegisterController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public ModelAndView registerPage() {
        ModelAndView model = new ModelAndView();
        model.setViewName("register");
        return model;
    }

    //bu methot a post olarak gerin "name"alanı birebir
    //method ta talep edilen değişkenler bir bir aynı olmalıdır
    // URl adı aynı olan
    @PostMapping("/register")
    public String registerPage(String username,String password, int user_question,String reg_useranswer){

         userService.save(
                 User.builder().username(username)
                         .password(password)
                         .question(user_question)
                         .answer(reg_useranswer).build());
         return "redirect:/login";
    }
}
