package com.templates.javaspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/version")
public class SaludoController {
    @GetMapping("/template")
    public String hola(){
        return "Versión 1.0 de templates java - spring";
    }
}