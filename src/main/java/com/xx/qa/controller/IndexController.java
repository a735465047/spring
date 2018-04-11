package com.xx.qa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



/**
 * Created by catherine.liu on 15-4-15.
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping("welcome")
    public ModelAndView welcome() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("welcome");
        return mv;
    }

}
