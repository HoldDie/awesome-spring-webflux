package com.holddie.flux.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloFluxApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloFluxApplication.class);
        GreetingWebClient greetingWebClient = new GreetingWebClient();
        System.out.println(greetingWebClient.getResult());
    }
}
