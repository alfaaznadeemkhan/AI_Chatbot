package com.ai.chat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {


    @RequestMapping("/")
    public String goToChat(){

        return "redirect:/chat";

    }

}
