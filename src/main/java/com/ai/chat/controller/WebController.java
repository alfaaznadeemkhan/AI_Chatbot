package com.ai.chat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/chat")
public class WebController {


    @GetMapping(path = "/test")
    public String chat(){

        return "test";
    }

}
