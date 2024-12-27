package com.ai.chat.controller;

import com.ai.chat.service.AiService;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/ai")
public class AiController {

    @Autowired
    private ChatModel chatModel;

    @GetMapping("/chat")
    public String prompt(@RequestParam String prompt) {

        return chatModel.call(prompt);

    }

}
