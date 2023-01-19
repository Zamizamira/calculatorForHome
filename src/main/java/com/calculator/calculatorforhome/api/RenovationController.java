package com.calculator.calculatorforhome.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/calculation")
public class RenovationController {

    @RequestMapping(value = {"/renovation"}, method = RequestMethod.GET)
    public ModelAndView calculation() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("renovation");
        return modelAndView;

    }
}
