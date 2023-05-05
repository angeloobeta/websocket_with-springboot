package com.example.websocket_withspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//curl "localhost:3030/socket.io/?EIO=4&transport=polling"
@SpringBootApplication
public class WebsocketWithSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebsocketWithSpringbootApplication.class, args);
    }

}
