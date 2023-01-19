package com.calculator.calculatorforhome.api;

import com.calculator.calculatorforhome.service.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/calculation")
public class NewbuildingController {
    @Autowired
    private CustomUserDetailsService userService;

    @RequestMapping(value = {"/newbuilding"}, method = RequestMethod.GET)
    public ModelAndView calculation() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("build/newbuilding");
        return modelAndView;
    }
}
