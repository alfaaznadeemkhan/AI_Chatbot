package com.ai.chat.controller;

import com.ai.chat.service.AiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = "/chatbot")
public class AiController {

    @Autowired
    private AiService aiService;

    @GetMapping("/generate")
    public String generateResponse(@RequestParam(name = "inputText", defaultValue = "what is java") String inputText, Model theModel) {
        String response = aiService.generateResponse(inputText);
        theModel.addAttribute("response", response);
        return "test";
    }

}
