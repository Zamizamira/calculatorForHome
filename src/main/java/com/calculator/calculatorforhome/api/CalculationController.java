package com.calculator.calculatorforhome.api;

import com.calculator.calculatorforhome.service.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculationController {

    @Autowired
    private CustomUserDetailsService userService;

//    @RequestMapping(value = "/calculation", method = RequestMethod.GET)
//    public ModelAndView calculation() {
//        ModelAndView modelAndView = new ModelAndView();
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        User user = userService.findUserByEmail(auth.getName());
//        modelAndView.addObject("user", user);
//        modelAndView.addObject("name", "Welcome " + user.getFirstName() + user.getEmail());
//        modelAndView.addObject("adminMessage", "Content Available Only for Users with Admin Role");
//        modelAndView.setViewName("calculation");
//        return modelAndView;
//    }

    @RequestMapping(value = {"/calculation"}, method = RequestMethod.GET)
    public ModelAndView calculation() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("calculation");
        return modelAndView;
    }
}
