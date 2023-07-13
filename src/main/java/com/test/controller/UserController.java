package com.test.controller;

import com.test.domain.dto.UserUpdate;
import com.test.domain.entity.User;
import com.test.domain.request.LoginRequest;
import com.test.domain.request.SignupRequest;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    public UserService userService;

    @GetMapping("/main")
    public ModelAndView showMain(ModelAndView mav) {
        mav.setViewName("/main");
        return mav;
    }

    @GetMapping("/user")
    public ModelAndView getUserPage(ModelAndView mav) {
        List<User> users = userService.user();
        mav.addObject("users", users);
        mav.setViewName("/user");
        return mav;
    }
    @GetMapping("/update/{user_seq}")
    public ModelAndView getUpdatePage(ModelAndView mav, @PathVariable("user_seq") Integer user_seq) {
        User user = userService.findByUserSeq(user_seq);

        mav.addObject("user", user);
        mav.setViewName("/update");
        return mav;
    }

    @PostMapping("/update")
    public ModelAndView postUpdatePage(@ModelAttribute UserUpdate update, ModelAndView mav) {

        if (userService.update(update) == 1) {
            mav.setViewName("redirect:/user");
        }
        return mav;
    }
    @GetMapping("/delete/{user_seq}")
    public ModelAndView postDeletePage(
            @PathVariable("user_seq") int user_seq, ModelAndView mav) {
        if (userService.delete(user_seq) == 1) {
            mav.setViewName("redirect:/user");
        }
        return mav;
    }

    @GetMapping("login")
    public String getLoginPage() {
        return "/login";
    }
    @PostMapping("/login")
    public ModelAndView postLoginPage(@ModelAttribute LoginRequest loginRequest, ModelAndView mav) {
        User login = userService.login(loginRequest);
        if (login != null) {
            mav.setViewName("redirect:/main");
        }else {
            mav.setViewName("redirect:/login");
        }
        return mav;
    }

    @GetMapping("/signup")
    public String getSignupPage() {
        return "signup";
    }

    @PostMapping("/signup")
    public ModelAndView postSignupPage(@ModelAttribute SignupRequest signupRequest, ModelAndView mav) {
        if (userService.signup(signupRequest)) {
            mav.setViewName("redirect:/login");
        } else {
            mav.setViewName("redirect:/signup");
        }
        return mav;
    }

}
