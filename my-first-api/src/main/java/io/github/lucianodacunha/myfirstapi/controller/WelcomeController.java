package io.github.lucianodacunha.myfirstapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping
    public String Welcome(){
        System.out.println("Welcome to Spring");
        return """
            <!DOCTYPE html>
            <html lang="pt-BR">
            <head>
            <meta charset="UTF-8">
            <title>Home</title>
            <head>
            <body>
            <h1 style=\"color: green;\">Welcome to Spring</h1>
            </body>
            </html>
            """;
    }
}
