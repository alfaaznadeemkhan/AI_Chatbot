package com.ai.chat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/")
public class WebController {


    @GetMapping(path = "/chat")
    public String chat(){

        return "test";
    }

}
