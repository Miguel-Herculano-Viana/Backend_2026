package com.senai.aula6.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloController {
    @GetMapping("/")
    public String home(){
        return "Aula 06 - springboot - Desenvolvimento backend";
    }
    @GetMapping("/curso")
    public String curso(){
        return "Analise e Desenvolvimento de Sistemas - SENAI 2026";
    }
    
}
