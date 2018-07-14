package com.txw.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * SpringBoot结合Jsp
 * create by txw on 2018-06-25
 */
@Controller
public class JspController {


    @GetMapping("/index")
    public String index(Model model) {

        model.addAttribute("index", "spring boot 结合使用jsp");

        return "index";
    }
}
