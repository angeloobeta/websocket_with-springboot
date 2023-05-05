package com.example.websocket_withspringboot.controller;

import com.example.websocket_withspringboot.Greeting;
import com.example.websocket_withspringboot.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greet(HelloMessage helloMessage) throws InterruptedException{
        return new Greeting("Hello" + HtmlUtils.htmlEscape(helloMessage.getName()));
    }
}
