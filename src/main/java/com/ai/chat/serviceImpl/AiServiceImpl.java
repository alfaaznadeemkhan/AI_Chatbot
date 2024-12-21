package com.ai.chat.serviceImpl;

import com.ai.chat.service.AiService;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AiServiceImpl implements AiService {

    @Autowired
    private ChatModel chatModel;

    @Override
    public String generateResponse(String inputText) {

        String response = chatModel.call(inputText);

        return response;

    }
}
